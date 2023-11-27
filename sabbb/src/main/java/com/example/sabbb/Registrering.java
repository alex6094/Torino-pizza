package com.example.sabbb;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Registrering {

    static String URL = "jdbc:mysql://localhost:3306/pizza";
    public  Connection connection = null;

    //Metode til at registrere ny kunde
    public void registerCustomer(String firstName, String lastName, Date birthday, String phoneNumber,
                                        String email, String address, String postalCode, String password) {

        try {
            connection = DriverManager.getConnection(URL, "root", "");
            
            //SQL statement til at indsætte kundedata i 'kunde' tabel
            String SQLStatement = "INSERT INTO `kunde` (`Fornavn`, `Efternavn`, `Foedselsdag`, `Telefon`, `Email`, `Adresse`, `Postnummer`, `Password`)" +
            "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        // Using PreparedStatement to prevent SQL injection
        try (PreparedStatement preparedStatement = connection.prepareStatement(SQLStatement)) {
            //Sætter værdierne ind i de eksisterende parametre
            preparedStatement.setString(1, firstName);
            preparedStatement.setString(2, lastName);
            preparedStatement.setDate(3, birthday);
            preparedStatement.setString(4, phoneNumber);
            preparedStatement.setString(5, email);
            preparedStatement.setString(6, address);
            preparedStatement.setString(7, postalCode);
            preparedStatement.setString(8, password);

            //Udføre update
            int rowsAffected = preparedStatement.executeUpdate();

            //Tjekker om der er succes med registrering
            if (rowsAffected > 0) {
                System.out.println("Customer registered successfully!");
            } else {
                System.out.println("Failed to register customer.");
            }
        }
    } catch (Exception e) {
        System.out.println(e);
    }  finally {
        // Close the connection in the finally block to ensure it gets closed regardless of exceptions
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
}
