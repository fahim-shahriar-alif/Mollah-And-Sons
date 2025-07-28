package com.example.alif.mollahandsons;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    public TextField usernameTextField;
    @FXML
    public TextField passwordTextField;
    @FXML
    public Label messageLabel;


    @FXML
    public void loginButtonOnAction(ActionEvent actionEvent) throws IOException {
        String username = usernameTextField.getText();
        String password = passwordTextField.getText();

        if (username.equals("Shamim") && password.equals("shamim")) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboard-view.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setTitle("Mollah and Sons Dashboard");
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else if (username.equals("Jakir") && password.equals("jakir")) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dashboard-view.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) usernameTextField.getScene().getWindow();
            stage.setTitle("Mollah and Sons Dashboard");
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

        else {
            messageLabel.setText("Invalid Username or Password. Please try again.");
        }
    }
}