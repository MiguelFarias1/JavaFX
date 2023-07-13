package com.example.scroll;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class HelloController {

    @FXML
    private DatePicker datePicker;

    @FXML
    private Label label;

    public void onAction(ActionEvent event) {

        LocalDate date = datePicker.getValue();

        label.setText(date.format(DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy")));
    }
}