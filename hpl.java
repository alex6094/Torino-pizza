import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class Hpl {


    public static void main(String args[]) {
        
        try {
            Connection connection = connectDB();         
            Statement statement = connection.createStatement();

            /*
             * Kunde (KundeID 78) bestiller 3 pizzaer: 1 stk. Fire Cheese (5) og 2 stk. Meat Lovers (15)
             * Pizzaerne bliver afhentet
             * 
             * 
             */

            int[][] pizza = {{5, 1},
                            {15,2}};
            LocalDateTime ctime = LocalDateTime.now();

            //opretter ordre: indsætter kundeID etc.
            String sql = 
                    "INSERT INTO ordrer(KundeID, Oprettet, Leveres) "+
                    "VALUES (78, '"+ctime+"', 0)";

            PreparedStatement pstatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            pstatement.executeUpdate();
            ResultSet rs = pstatement.getGeneratedKeys();
            rs.next();
            int OrdrerID = rs.getInt(1);

            //forbinder ordre med pizzaIDer
            for (int[] p : pizza) {
                sql =   "INSERT INTO pizzaordrer(PizzaID, OrdrerID, Antal) VALUES ("+p[0]+", "+OrdrerID+", "+p[1]+")";
                statement.executeUpdate(sql);
            };


            //viser ordren
            ResultSet resultSet = statement.executeQuery("SELECT * FROM ordrer_view WHERE ID="+OrdrerID);
            int totalprice = 0;

            while (resultSet.next()) {

                System.out.println(
                    "OrdreID: " + resultSet.getInt("ID") +", "+
                    "PizzaNavn: " + resultSet.getString("PizzaNavn") +", "+
                    "Toppings: " + resultSet.getString("Toppings") +", "+
                    "Pris pr stk.: " + resultSet.getDouble("Pris") +", "+
                    "Antal: " + resultSet.getInt("Antal") +", "+
                    "Pris i alt: " + resultSet.getDouble("PrisTotal")
                    );
                totalprice += resultSet.getDouble("PrisTotal");
            }
            System.out.println("Totalpris:"+ totalprice);



            connection.close();

        } catch (Exception e) {
            System.out.println(e);
        }


        

    }

    public static Connection connectDB() throws SQLException {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/pizza", "root", "");

    }



}

