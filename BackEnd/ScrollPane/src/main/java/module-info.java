module com.mycompany.scrollpane {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.scrollpane to javafx.fxml;
    exports com.mycompany.scrollpane;
}
