import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class Ordrer {
    Statement statement;

    public void create(int[][] pizza, LocalDateTime ctime) {
        try {
            Connection connection = connectDB();       
            statement = connection.createStatement();


            //opretter ordre: indsætter kundeID etc.
            String sql = 
                    "INSERT INTO ordrer(KundeID, Oprettet, Leveres) "+
                    "VALUES (78, '"+ctime+"', 0)";

            PreparedStatement pstatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstatement.executeUpdate();
            ResultSet resultSet = pstatement.getGeneratedKeys();
            resultSet.next();
            int OrdrerID = resultSet.getInt(1);

            //forbinder ordre med pizzaIDer
            for (int[] p : pizza) {
                sql =   "INSERT INTO pizzaordrer(PizzaID, OrdrerID, Antal) VALUES ("+p[0]+", "+OrdrerID+", "+p[1]+")";
                statement.executeUpdate(sql);
            };


            //viser ordren
            double totalprice = show(OrdrerID);


 

            //opdater ordren med totalpris
            statement.executeUpdate("UPDATE ordrer SET TotalPris = "+totalprice+ " WHERE ID = "+OrdrerID);     

            
            System.out.println("Totalpris:"+ totalprice);



            connection.close();

        } catch (Exception e) {

            System.out.println(e);

        }


        

    }

    public static Connection connectDB() throws SQLException {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza", "root", "");

    }

    private double show(int ordrerID) throws SQLException {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ordrer_view WHERE ID="+ordrerID);
            double totalprice = 0;

            while (resultSet.next()) {
                double pris = resultSet.getDouble("Pris");
                totalprice += pris;

                System.out.println(
                    "OrdreID: " + resultSet.getInt("ID") +", "+
                    "PizzaNavn: " + resultSet.getString("PizzaNavn") +", "+
                    "Toppings: " + resultSet.getString("Toppings") +", "+
                    "Pris pr stk.: " + resultSet.getDouble("StkPris") +", "+
                    "Antal: " + resultSet.getInt("Antal") +", "+
                    "Pris i alt: " + pris
                    );
                
            }

            return totalprice;

    }

}

