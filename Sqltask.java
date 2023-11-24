import java.sql.Connection;
import java.sql.ResultSet;
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
            connection = Ordrer.connectDB();  
            statement = connection.createStatement();
            danishdate = setDanishLocale();

            //se alle kundeordrer
            ResultSet result = sqlexq("SELECT * FROM ordrer_view");
            showKunder(result, "ALLE KUNDEORDRE");

            
            //se specific kundeordre
            int KundeID = 78;
            result  = statement.executeQuery("SELECT * FROM ordrer_view WHERE KundeID="+KundeID);        
            showKunder(result, "KUNDEORDRE");


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



      public static void showKunder(ResultSet result, String header) throws SQLException {
            String outputformat = "%-8s%-20s%-30s%-50s%15s%10s%15s\033[1m%15s\033[0m%n";
            System.out.println("\n\n************************ "+header+" ************************\n");
            System.out.printf(outputformat,"ID", "Oprettet", "Pizza", "Beskrivelse", "Pris stk.", "Antal", "Pris", "Pris Total");
            int id = 0;
            //udskriver tabeldata
            while (result.next()) {
                
                int c1 = result.getInt("ID");
                String c2 = danishdate.format(result.getTimestamp("Oprettet"));
                String c3 = result.getString("PizzaNavn");
                String c4 = result.getString("Toppings");
                double c5 = result.getDouble("StkPris");
                int c6 = result.getInt("Antal");
                double c7 = result.getDouble("Pris");
                double c8 = result.getDouble("TotalPris");

                if(id != c1) System.out.println("--");
                id = c1;
                System.out.printf("%-8d%-20s%-30s%-50s%15.2f%10s%15.2f\033[1m%15.2f\033[0m%n", c1, c2, c3, c4, c5, c6, c7, c8);
            }
      }

}

