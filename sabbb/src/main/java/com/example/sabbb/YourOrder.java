package com.example.sabbb;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class YourOrder {

    @FXML
    private VBox orderList;

    @FXML
    private Label totalLabel;

    private double total = 0.0;

    @FXML
    public void handleHomeClick(MouseEvent event){
        ChangeScene.changeScene("dine-in-take-away.fxml",  event);
    }

    @FXML
    public void handleOrderOnlineClick(MouseEvent event){
        ChangeScene.changeScene("your-order.fxml", event);
    }

    @FXML
    public void handleInfoClick(MouseEvent event){
        ChangeScene.changeScene("info.fxml", event);
    }

    @FXML
    protected void addPizza() {
        addItemToOrder("Pizza", 2.50);
    }

    @FXML
    protected void addCalzone() {
        addItemToOrder("Calzone", 3.00);
    }

    @FXML
    protected void addDrinks() {
        addItemToOrder("Drinks", 1.50);
    }

    @FXML
    protected void addPasta() {
        addItemToOrder("Pasta", 10.00);
    }

    @FXML
    protected void addSpaghetti() {
        addItemToOrder("Spaghetti", 6.00);
    }

    @FXML
    protected void removeSpaghetti() {
        removeItemFromOrder("Spaghetti", 6.00);
    }

    @FXML
    protected void removePasta() {
        removeItemFromOrder("Pasta", 10.00);
    }

    @FXML
    protected void removeDrinks() {
        removeItemFromOrder("Drinks", 1.50);
    }

    @FXML
    protected void removeCalzone() {
        removeItemFromOrder("Calzone", 3);
    }

    @FXML
    protected void removePizza() {
        removeItemFromOrder("Pizza", 2.50);
    }

    private void addItemToOrder(String item, double price) {
        boolean itemFound = false;
        for (Node node : orderList.getChildren()) {
            if (node instanceof Label) {
                Label label = (Label) node;
                String labelText = label.getText();
                if (labelText.startsWith(item)) {
                    String[] parts = labelText.split(" x");
                    int quantity = 1;
                    if (parts.length > 1) {
                        quantity = Integer.parseInt(parts[1]);
                    }
                    label.setText(item + " x" + (quantity + 1));
                    itemFound = true;
                    break;
                }
            }
        }

        if (!itemFound) {
            Label itemLabel = new Label(item + " x1");
            orderList.getChildren().add(itemLabel);
        }

        total += price;
        totalLabel.setText(String.format("$%.2f", total));
    }

    private void removeItemFromOrder(String item, double price) {
        boolean itemFound = false;

        for (Node node : new ArrayList<>(orderList.getChildren())) {
            if (node instanceof Label) {
                Label label = (Label) node;
                String labelText = label.getText();
                if (labelText.startsWith(item)) {
                    String[] parts = labelText.split(" x");
                    int quantity = Integer.parseInt(parts[1]);
                    if (quantity > 1) {
                        label.setText(item + " x" + (quantity - 1));
                    } else {
                        orderList.getChildren().remove(label);
                    }
                    itemFound = true;
                    break;
                }
            }
        }

        if (itemFound) {
            total = Math.max(0, total - price);
            totalLabel.setText(String.format("$%.2f", total));
        }
    }
}
