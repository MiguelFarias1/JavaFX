package com.mycompany.menubar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) {

        BorderPane layout = new BorderPane();
        MenuBar menu = new MenuBar();
        Menu arquivo = new Menu("Arquivo");
        Menu duvidas = new Menu("Dúvidas");
        layout.setTop(menu);

        menu.setUseSystemMenuBar(true);

        menu.getMenus().addAll(arquivo,duvidas);

        MenuItem item1 = new MenuItem("Abrir");
        MenuItem item2 = new MenuItem("Salvar");
        MenuItem item3 = new MenuItem("Sair");

        item1.setOnAction(actionEvent -> {
            alerta();
        });
        item2.setOnAction(actionEvent -> {
            alerta();
        });
        item3.setOnAction(actionEvent -> {
            alerta();
        });

        arquivo.getItems().addAll(item1,item2,item3);

        Scene cenario = new Scene(layout,400,400);
        stage.setTitle("Menu Principal");
        stage.setScene(cenario);
        stage.show();

    }

    private void alerta(){
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Menu Principal");
        alerta.setHeaderText("Item do Menu");
        alerta.setContentText("Clicado");
        alerta.show();
    }

    public static void main(String[] args) {
        launch();
    }

}