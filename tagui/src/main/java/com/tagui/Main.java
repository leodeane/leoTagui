package com.tagui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;
import java.util.Properties;
import java.util.ResourceBundle;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("tagui.fxml"));
        stage.setScene(new Scene(root));
        stage.setTitle("SideWalk Virtual Teacher Assistant");
        stage.show();
    }

    public static void main(String[] args)
    {
        launch();
    }
}