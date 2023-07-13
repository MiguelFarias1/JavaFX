package com.mycompany.draganddrop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;

public class PrimaryController {

    @FXML
    private ImageView imageView;

    @FXML
    private void arrastar(DragEvent event){
        if(event.getDragboard().hasFiles()){
            event.acceptTransferModes(TransferMode.ANY);
        }
    }

    @FXML
    private void soltar(DragEvent event) throws FileNotFoundException{
        List<File> arquivos = event.getDragboard().getFiles();
        Image img = new Image(new FileInputStream(arquivos.get(0)));
        imageView.setImage(img);
    }
}
