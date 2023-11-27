import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField EmailField;
    @FXML
    private TextField PasswordField;

    @FXML
    private void handleLogin(ActionEvent event) {
        //changeScene("your-order.fxml", event);
        LogIn.UpdateEmailAndPassword(EmailField.getText(), PasswordField.getText());
        LogIn.GetDataBaseValues();
    }

    @FXML
    private void handleSignUp(ActionEvent event) {
        //changeScene("your-order.fxml", event);
    }

    private void changeScene(String fxmlFile, ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(fxmlFile));
            Parent parent = loader.load();

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(parent));

            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}