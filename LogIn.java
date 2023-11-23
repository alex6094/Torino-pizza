import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class LogIn {

    private static String Email = "mark-nielsen@email.com";
    private static String Password = "";


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

                if(dbEmail.equals(Email)){
                    System.out.println("Email correct");
                }


            }





            //dbEmail = resultSet.getString("Email");
            //dbPassword = resultSet.getString("Password");

        } catch (Exception e) {
            System.out.println(e);
        }
    }


    public void CheckValues(){

        
        
    }


}
