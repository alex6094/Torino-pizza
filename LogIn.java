import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LogIn {

    private static String Email = "john.doe@email.com";
    private static String Password = "password123";


public static void main(String args[]) {
    GetDataBaseValues();
}


    static String URL = "jdbc:mysql://localhost:3306/pizza";

    public static void GetDataBaseValues() {
        try {
            
            //Opretter forbindelse til databasen

            Connection connection = DriverManager.getConnection(URL, "root", "");

            Statement statement = connection.createStatement();

            String SQLStatement = "SELECT Email,Password FROM `kunde` WHERE Email ='" + Email + "' And Password ='" + Password + "'";

            ResultSet resultSet = statement.executeQuery(SQLStatement);


                if(resultSet.next()){
                    System.out.println("Succesfully Logged in!");
                }
                
                System.out.println("i did something!");
            //dbEmail = resultSet.getString("Email");
            //dbPassword = resultSet.getString("Password");

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void CheckValues(){

        
        
    }


}
