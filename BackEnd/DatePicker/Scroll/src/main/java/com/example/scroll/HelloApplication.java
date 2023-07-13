package com.example.scroll;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {

        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("View.fxml")));

        Scene scene = new Scene(parent);

        primaryStage.setScene(scene);

        primaryStage.setTitle("Date Picker");

        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
