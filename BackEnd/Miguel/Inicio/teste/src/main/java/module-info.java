module aprendizado.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens aprendizado.example to javafx.fxml;
    exports aprendizado.example;
}
