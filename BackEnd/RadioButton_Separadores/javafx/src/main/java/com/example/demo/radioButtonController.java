package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class radioButtonController {
    @FXML
    private Label mensagem1;
    @FXML
    private RadioButton botao1;
    @FXML
    private RadioButton botao2;
    @FXML
    private RadioButton botao3;
    protected void selecionar(ActionEvent event){
    if (botao1.isSelected()){
    mensagem1.setText("Você escolheu Avatar!");}
    else if (botao2.isSelected()){
            mensagem1.setText("Você escolheu Star Wars!");}
    else if (botao3.isSelected()) {
        mensagem1.setText("Você escolheu Os vingadores!");
        }
    }
}
