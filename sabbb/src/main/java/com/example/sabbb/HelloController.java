package com.example.sabbb;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private void goToHomePage(ActionEvent event) throws IOException {
        // Load the home page FXML
        Parent homePage = FXMLLoader.load(getClass().getResource("homePage.fxml"));
        // Get the current stage using the event source
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Create a new scene with the home page
        Scene scene = new Scene(homePage);
        // Set the scene to the stage
        stage.setScene(scene);
        // Show the stage
        stage.show();
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}