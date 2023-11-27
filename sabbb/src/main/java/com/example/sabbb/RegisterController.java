package com.example.sabbb;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class RegisterController {

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField dateOfBirthField;

    @FXML
    private TextField phoneNumberField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField addressField;

    @FXML
    private TextField passwordField;

    @FXML
    private TextField postalCodeField;

    @FXML
    private void handleRegister(ActionEvent event) {
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String postalCode = postalCodeField.getText();
        String dateOfBirthString = dateOfBirthField.getText();
        String phoneNumber = phoneNumberField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();
        String address = addressField.getText();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString, formatter);

        Registrering registrering = new Registrering();
        registrering.registerCustomer(firstName,lastName, Date.valueOf(dateOfBirth), phoneNumber,email,address,postalCode,password);
    }

    public void handleBackToLogIn(ActionEvent event){
        ChangeScene.changeScene("login.fxml", event);
    }

    public void handleOrderOnlineClick(MouseEvent event) {
        ChangeScene.changeScene("your-order.fxml", event);
    }

    public void handleInfoClick(MouseEvent event) {
        ChangeScene.changeScene("info.fxml", event);
    }

    public void handleHomeClick(MouseEvent event) {
        ChangeScene.changeScene("dine-in-take-away.fxml", event);
    }
}
