package org.example.javafxreadingdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class HelloController {

    @FXML
    private Label welcomeText;

    @FXML
    private Button confirmBtn;

    @FXML
    protected void onButton1Click() {
        welcomeText.setText("Button 1 was clicked!");
    }

    @FXML
    protected void onButton2Click() {
        welcomeText.setText("Button 2 was clicked!");
    }

    @FXML
    private void handleConfirm(ActionEvent event) {
        welcomeText.setText("Button 3 was clicked!");
        System.out.println("Button 3 clicked! (Confirm action)");
    }
}
