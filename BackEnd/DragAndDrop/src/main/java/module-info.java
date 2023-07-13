module com.mycompany.draganddrop {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.draganddrop to javafx.fxml;
    exports com.mycompany.draganddrop;
}
