import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Mark {

    static String URL = "jdbc:mysql://localhost:3306/pizza";


    public static void main(String args[]) {
/*
 Dette er ren test, eller død kode. 
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
