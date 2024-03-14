package com.example.notesnap;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 0, 0);
        // Establecer el tamaño de la ventana al ancho y alto total de la pantalla
        stage.setWidth(800);
        stage.setHeight(600);


        stage.setTitle("Quick note");
        stage.setScene(scene);
        stage.getScene().getStylesheets().add(String.valueOf(getClass().getResource("styles.css")));

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}