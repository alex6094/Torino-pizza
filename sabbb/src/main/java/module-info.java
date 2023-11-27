module com.example.sabbb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.sabbb to javafx.fxml;
    exports com.example.sabbb;
}