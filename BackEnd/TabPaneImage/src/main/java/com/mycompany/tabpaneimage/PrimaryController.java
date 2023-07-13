package com.mycompany.tabpaneimage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PrimaryController implements Initializable {

    @FXML
    private Tab tab1, tab2, tab3;

    private ImageView addImagem(String arquivoImagem){
        ImageView imageView = null;
        Image image = new Image(getClass().getResourceAsStream(arquivoImagem));
        imageView = new ImageView(image);
        imageView.setFitWidth(15);
        imageView.setFitHeight(15);
        return imageView;
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ImageView vista1 = addImagem("tab1.png");
        tab1.setGraphic(vista1);
        ImageView vista2 = addImagem("tab2.png");
        tab2.setGraphic(vista2);
        ImageView vista3 = addImagem("tab3.png");
        tab3.setGraphic(vista3);
    }
}
