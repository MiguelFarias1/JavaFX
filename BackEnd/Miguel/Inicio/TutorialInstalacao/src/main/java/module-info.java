module com.integrador.projeto.teste {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.integrador.projeto.teste to javafx.fxml;
    exports com.integrador.projeto.teste;
}