package com.example.demo1;


import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
 @FXML
    private Slider slider;

 @FXML
    Label label;

 int valor;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                valor = (int) slider.getValue();
                label.setText((Integer.toString(valor)));
            }
        });
    }


}


