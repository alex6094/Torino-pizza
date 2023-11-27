package com.example.sabbb;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private TextField passwordField;

    @FXML
    private void handleLogin() {
        String email = emailField.getText();
        String password = passwordField.getText();

        LogIn logIn = new LogIn();
        logIn.UpdateEmailAndPassword(email, password);
        logIn.GetDataBaseValues();
    }

    @FXML
    private void handleRegister(MouseEvent event) {
        ChangeScene.changeScene("register.fxml", event);
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