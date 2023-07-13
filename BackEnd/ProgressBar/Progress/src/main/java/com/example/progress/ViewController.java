package com.example.progress;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewController implements Initializable {

    @FXML
    private ProgressBar progressBar = new ProgressBar();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        new Thread(() -> {

            for(int i = 1; i <= 100; i++) {

                progressBar.setProgress(i / 100.0);

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }).start();
    }
}