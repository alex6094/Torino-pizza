module com.example.sabbb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sabbb to javafx.fxml;
    exports com.example.sabbb;
}