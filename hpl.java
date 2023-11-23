import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Hpl {

    static String URL = "jdbc:mysql://localhost:3306/pizza";


    public static void main(String args[]) {
/*
 Det er så her jeg ville lave min 
 
 */

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(URL, "root", "");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM `pizzamenu`");

            while (resultSet.next()) {

                System.out.println("Pizza nummer: " + resultSet.getInt(+1)
                        + ". Navnet på pizza: " + resultSet.getString("PizzaNavn")
                        + ". Hvad der er på: " + resultSet.getString("Toppings")
                        + ". Og hvad den koster: " + resultSet.getInt("Pris"));
            }
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }


        

    }


}