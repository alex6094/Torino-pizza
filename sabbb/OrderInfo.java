package com.example.sabbb;

import javafx.scene.input.MouseEvent;

public class OrderInfo {
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
