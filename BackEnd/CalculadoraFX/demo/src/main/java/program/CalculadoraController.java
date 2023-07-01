package program;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculadoraController {
    
    @FXML
    private Label labelNumber1;

    @FXML
    private Label labelNumber2;

    @FXML
    private Label labelResult;

    @FXML
    private TextField txtNumber1;

    @FXML
    private TextField txtNumber2;

    @FXML
    private Button btnSoma;

    public void onClickSoma()
    {
        Double number1 = Double.parseDouble(txtNumber1.getText());

        Double number2 = Double.parseDouble(txtNumber2.getText());

        Double result = number1 + number2;

        labelResult.setText(String.valueOf(result));
    }
}