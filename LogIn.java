import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LogIn {

    private static String Email = "oliver.garcia@email.com";
    private static String Password = "oliverpass";
    public static boolean loggedIn = false;


public static void main(String args[]) {
    GetDataBaseValues();
}


    static String URL = "jdbc:mysql://localhost:3306/pizza";

    public static void GetDataBaseValues() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, "root", "");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT Email,Password FROM `kunde`");

            while(resultSet.next()){
                String dbEmail = resultSet.getString("Email");
                String dbPassword = resultSet.getString("Password");

                if(dbEmail.equals(Email)){
                    if(dbPassword.equals(Password)){
                    loggedIn = true;
                    System.out.println("logged in!");
                    break;
                    }
                }
                else{
                    System.out.println("not correct");
                }

            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }


    


}
