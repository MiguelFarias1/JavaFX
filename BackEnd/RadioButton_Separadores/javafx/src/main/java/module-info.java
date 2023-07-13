module com.example.javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx to javafx.fxml;
    exports com.example.javafx;
    exports exemplo;
    opens exemplo to javafx.fxml;
    exports com.example.demo;
    opens com.example.demo to javafx.fxml;
}