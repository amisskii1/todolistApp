package com.misskii.javatodolistapp;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("login-page.fxml"));
        stage.setTitle("TO-DO List Application");
        stage.setScene(new Scene(root));
        stage.setResizable(true);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}