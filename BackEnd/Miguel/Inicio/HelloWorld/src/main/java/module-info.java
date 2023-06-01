module com.integrador.projeto.helloworld {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.integrador.projeto.helloworld to javafx.fxml;
    exports com.integrador.projeto.helloworld;
}