module com.integrador.projeto.listview {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.integrador.projeto.listview to javafx.fxml;
    exports com.integrador.projeto.listview;
}