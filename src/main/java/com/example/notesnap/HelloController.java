package com.example.notesnap;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.Pane;

import java.util.Optional;

public class HelloController {


    @FXML
    private Pane view_tareas,CuadroCrearTareas,viewNotas;
    @FXML
   private Button btn1,btn2;


    @FXML
    //method para cambio de vista
    public void changeViewsNote(){
        btn1.setStyle("-fx-background-color: #91B4E9; -fx-text-fill: #ffffff;");
        btn2.setStyle("-fx-background-color: transparent; -fx-text-fill: #344c7b; -fx-border-color:  #6F98D6; -fx-border-radius:3;");
        view_tareas.setVisible(false);
        viewNotas.setVisible(true);
    }
    @FXML
    public void changeViewsTask(){
        btn2.setStyle("-fx-background-color: #91B4E9; -fx-text-fill: #ffffff;");
        btn1.setStyle("-fx-background-color: transparent; -fx-text-fill: #344c7b; -fx-border-color:  #6F98D6; -fx-border-radius:3;");
        view_tareas.setVisible(true);
        viewNotas.setVisible(false);

    }
    @FXML
    public void OpenFormCreateNewTask() {
        // Crear el cuadro de diálogo
        CuadroCrearTareas.setVisible(true);
    }

    @FXML
    public void CloseFormCreateNewTask() {
        // Crear el cuadro de diálogo
        CuadroCrearTareas.setVisible(false);
    }


}