package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            // Create labels and input fields
            Label nameLabel = new Label("Name:");
            TextField nameField = new TextField();

            Label phoneLabel = new Label("Phone:");
            TextField phoneField = new TextField();

            Label emailLabel = new Label("Email:");
            TextField emailField = new TextField();

            Button submitButton = new Button("Submit");
            Label messageLabel = new Label();

            // Action on button click
            submitButton.setOnAction(e -> {
                String name = nameField.getText();
                String phone = phoneField.getText();
                String email = emailField.getText();

                messageLabel.setText("Submitted: " + name + ", " + phone + ", " + email);
            });

            // Layout using GridPane
            GridPane grid = new GridPane();
            grid.setVgap(10);
            grid.setHgap(10);

            grid.add(nameLabel, 0, 0);
            grid.add(nameField, 1, 0);
            grid.add(phoneLabel, 0, 1);
            grid.add(phoneField, 1, 1);
            grid.add(emailLabel, 0, 2);
            grid.add(emailField, 1, 2);
            grid.add(submitButton, 0, 3);
            grid.add(messageLabel, 1, 3);

            Scene scene = new Scene(grid, 400, 250);
            primaryStage.setScene(scene);
            primaryStage.setTitle("JavaFX Form");
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}