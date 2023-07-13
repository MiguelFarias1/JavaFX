module com.mycompany.tabpaneimage {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tabpaneimage to javafx.fxml;
    exports com.mycompany.tabpaneimage;
}
