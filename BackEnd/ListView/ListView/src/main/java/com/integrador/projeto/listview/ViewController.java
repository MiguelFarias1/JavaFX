package com.integrador.projeto.listview;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class ViewController  implements Initializable {

    @FXML
    private ListView<Categoria> categoriaListView = new ListView<>();

    private List<Categoria> categoriaList = new ArrayList<>();

    private ObservableList<Categoria> observableList;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initializeCategorias();
    }

    public void initializeCategorias() {

        Categoria categoria1 = new Categoria("Eletrônico");
        Categoria categoria2 = new Categoria("Livro");
        Categoria categoria3 = new Categoria("Cozinha");

        categoriaList = Arrays.asList(categoria1, categoria2, categoria3);

        observableList = FXCollections.observableArrayList(categoriaList);

        categoriaListView.setItems(observableList);
    }
}