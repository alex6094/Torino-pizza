import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Sqltask {
    static Connection connection;  
    static Statement statement;
    static SimpleDateFormat danishdate;
  
    public static void main(String args[]) {
        try {
            System.setProperty("console.encoding", "ISO-8859-1");
            connection = Ordrer.connectDB();  
            statement = connection.createStatement();
            danishdate = setDanishLocale();
            ResultSet result;
            String sqltext ;
            String text;

            text = "1. Formater telefonnr (CONCAT)";
            sqltext = "SELECT Fornavn, Efternavn, CONCAT('+45 ', SUBSTRING(Telefon, 1, 4), ' ', SUBSTRING(Telefon, 5, 8)) AS Telefon FROM kunde LIMIT 10";
            result = sqlexq(sqltext);
            ShowResult(result, text, sqltext, new String[] {"%-15s"}, 0);

            text = "2. Order bestil i postnr Glostrup, Århus C, Esbjerg, Skive og Aalborg  (DISTINCT/WHERE)";
            sqltext = "SELECT GROUP_CONCAT(DISTINCT ID SEPARATOR ', ') AS Ordrer, Totalpris, count(DISTINCT ID) AS Antal, Bynavn \nFROM ordrer_view \nWHERE Postnr IN (2600,8000,6700,7800,9000) \nGROUP BY Postnr \nORDER BY Postnr";
            result = sqlexq(sqltext);
            ShowResult(result, text, sqltext, new String[] {"-30s","-15.2f","-10s","-20s"}, 0);


            text = "3. Opret table view (JOIN)";
            sqltext = "#CREATE VIEW Ordrer_view AS\n" + 
                    "SELECT Ordrer.ID, Ordrer.Oprettet, Ordrer.Betalt, Ordrer.Faerdig, PizzaMenu_view.*, Antal, Antal*StkPris AS Pris, Ordrer.TotalPris, Kunde_view.*\n" +
                    "FROM ordrer\n" +
                    "LEFT JOIN pizzaordrer ON Ordrer.ID = pizzaordrer.OrdrerID\n" + 
                    "LEFT JOIN PizzaMenu_view ON pizzaordrer.PizzaID = PizzaMenu_view.PizzaID\n" + 
                    "LEFT JOIN Kunde_view ON ordrer.KundeID = Kunde_view.KundeID LIMIT 10";
            result = sqlexq(sqltext);
            ShowResult(result, text, sqltext, new String[] {"-10d","-25s","-8s","-10s","-10s","-25s","-50s","-10.2f","-10d","-10.2f","-15.2f","-10s","-12s","-12s","-12s","-20s","-10s","-20s"}, 0);


            text = "4. Antal pizzaer bestilt pr pizzatype (ORDER)";
            sqltext = "SELECT PizzaID, PizzaNavn, COUNT(PizzaID) AS Antal \nFROM ordrer_view \nGROUP BY PizzaID \nORDER BY Antal DESC";
            result = sqlexq(sqltext);
            ShowResult(result, text, sqltext, new String[] {"-10d","-25s","-10d"}, 0);


            text = "5. Antal pizzaer bestilt pr pizzatype pr dag (GROUP BY)";
            sqltext = "SELECT PizzaID, PizzaNavn, SUBSTRING_INDEX(Oprettet, ' ',1) AS Dag, COUNT(PizzaID) AS Antal \nFROM ordrer_view \nGROUP BY Dag, PizzaID \nORDER BY Dag ASC, Antal DESC";
            result = sqlexq(sqltext);
            ShowResult(result, text, sqltext, new String[] {"-10d","-25s","-15s","-10d"}, 3);

            text = "6. Første ordre pr dag (MIN)";
            sqltext = "SELECT ID, MIN(Oprettet) 'Dag/tid', Fornavn, Efternavn, SUM(Antal) OVER (PARTITION BY ID) AS Antal , TotalPris AS Pris \nFROM ordrer_view \nGROUP BY SUBSTRING_INDEX(Oprettet, ' ',1) \nORDER BY Oprettet ASC;";
            result = sqlexq(sqltext);
            ShowResult(result, text, sqltext, new String[] {"-10d","-25s","-15s","-15s","-10s","-10.2f"}, 0);

            text = "7. Højeste ordrer pr dag (MAX)";
            sqltext = "SELECT ID, SUBSTRING_INDEX(Oprettet, ' ',1) AS Dag, Fornavn, Efternavn, MAX(TotalPris) AS Pris \nFROM ordrer_view \nGROUP BY Dag \nORDER BY Dag ASC";
            result = sqlexq(sqltext);
            ShowResult(result, text, sqltext, new String[] {"-10d","-25s","-15s","-15s","-10.2f"}, 0);

            text = "8. Liste over ordre den 21. nov. 2023 (Wildcard)";
            sqltext = "SELECT ID, Oprettet, GROUP_CONCAT(PizzaNavn SEPARATOR ', ') AS Pizzaer, Fornavn, Efternavn, TotalPris \nFROM ordrer_view WHERE Oprettet LIKE '2023-11-21%' \nGROUP BY ID \nORDER BY ID ASC;";
            result = sqlexq(sqltext);
            ShowResult(result, text, sqltext, new String[] {"-10d","-25s","-60s","-15s","-15s","-10.2f"}, 0);

            text = "9. Top 10 liste over de kunder der har bestilt for mest (SUM)";
            sqltext = "SELECT KundeID, Fornavn, Efternavn, SUM(TotalPris) AS Pris \nFROM ordrer_view GROUP BY PizzaNavn \nORDER BY Pris DESC Limit 10";
            result = sqlexq(sqltext);
            ShowResult(result, text, sqltext, new String[] {"-10d","-15s","-15s","-10.2f"}, 0);


            text = "10. Flest ordre pr time pr dag, over 500kr total (HAVING)";
            sqltext = "SELECT SUBSTRING_INDEX(Oprettet, ' ',1) AS Dag, SUBSTRING_INDEX(SUBSTRING_INDEX(Oprettet, ' ',-1),':',1) AS time, SUM(Antal) AS Antal, SUM(TotalPris) AS Pris \nFROM ordrer_view \nGROUP BY SUBSTRING_INDEX(Oprettet, ':',1) \nHAVING Pris > 500 \nORDER BY Dag ASC, Pris DESC";
            result = sqlexq(sqltext);
            ShowResult(result, text, sqltext, new String[] {"-15s","-10s","-8s","10.2f"}, 1);


        } catch (Exception e) {

            System.out.println(e);
             System.out.println("error");
        }

}




    public static ResultSet sqlexq(String sqlstring) throws SQLException {
        return statement.executeQuery(sqlstring);
    }  


    public static SimpleDateFormat setDanishLocale() {
        Locale danishLocale = new Locale.Builder().setLanguage("da").setRegion("DK").build();
        return new SimpleDateFormat("dd/MM/yyyy HH:mm", danishLocale);
    }


    public static void ShowResult(ResultSet result, String text, String sql, String[] formats, int delimiterColumn) throws SQLException {

        System.out.println("\n\u001B[91m"+text+ "\u001B[0m\n--\n" + //
                "\u001B[94m"+sql+"\u001B[0m\n--\n"); 


        //udskiver tabelhovedet
        ResultSetMetaData metaData = result.getMetaData();
        int columnCount = metaData.getColumnCount();
        for (int i=1; i<=columnCount; i++) {
            String f = rc(getFormat(formats, i));
            System.out.printf("\u001B[1m"+f+"\u001B[0m",metaData.getColumnName(i));
        }   
        System.out.println(); 

        String delimiterColumnText = "";

        //udskriver tabeldata
        while (result.next()) {

            //tester om der skal være en opdeling
            if(delimiterColumn>0) {
                String dct = (String) result.getObject(delimiterColumn);
                if(!dct.equals(delimiterColumnText)) {
                    System.out.println("--"); 
                }
                delimiterColumnText = dct;
            }

            for (int i=1; i<=columnCount; i++) {
                System.out.printf(getFormat(formats, i),result.getObject(i));
            }   
            System.out.println(); 
        }    

    } 

    private static String getFormat(String[] f, int i) {
        int fl = f.length;
        if(fl>1) {
             if(fl>=i) {
                return "%"+f[i-1]; 
             } else {
                return "%"+f[fl-1]; 
             }           
        } else {
            return f[0];
        }

    }

    private static String rc(String text) {
        return text.replace(".2f","s").replace("d","s");
    }

}

