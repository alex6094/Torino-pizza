package com.example.sabbb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class LogIn {

    private static String Email;
    private static String Password;
    public static boolean LoggedIn = false;

    static String URL = "jdbc:mysql://localhost:3306/pizza";

    public void UpdateEmailAndPassword(String _Email, String _Password){
        Email = _Email;
        Password = _Password;
    }

    public void GetDataBaseValues() {
        try {
            //Opretter forbindelse til databasen
            Connection connection = DriverManager.getConnection(URL, "root", "");

            Statement statement = connection.createStatement();

            //søger efter det Email og Password som er blevet indskrevet
            String SQLStatement = "SELECT Email,Password FROM `kunde` WHERE Email ='" + Email + "' And Password ='" + Password + "'";

            ResultSet resultSet = statement.executeQuery(SQLStatement);

            //Hvis at der er noget i den liste der kom fra søgningen, så logger man ind.
            if(resultSet.next()){
                System.out.println("Succesfully Logged in!");
                LoggedIn = true;
            }
            System.out.println("i did something!");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
