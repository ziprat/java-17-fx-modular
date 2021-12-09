package com.example.bicycle;

import com.example.calculator.Calculator;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BicycleApp extends Application {

    Calculator calc = new Calculator();

    @Override
    public void start(Stage primaryStage) {
        try {
            BorderPane root = new BorderPane();
            // root.setCenter(createInputPane());
            Scene scene = new Scene(root,400,400);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Bicycle App");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        launch(args);
    }
}
