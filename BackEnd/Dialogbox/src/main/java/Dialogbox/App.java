package Dialogbox;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class App extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane raiz = new BorderPane();
        Scene cenario = new Scene(raiz,400,400);
        stage.setScene(cenario);
        stage.setTitle("Janela de diálogo");
        stage.show();
        Button button = new Button("Entrar");
        raiz.setCenter(button);

        button.setOnAction(e->{
            Dialog dialogo = new Dialog<>();
            dialogo.setTitle("Login");
            dialogo.getDialogPane().getButtonTypes().add(ButtonType.CLOSE);
            dialogo.getDialogPane().setContent(criarLogin());
            dialogo.show();
        });
    }

    private Node criarLogin(){
        GridPane gridpane = new GridPane();
        gridpane.add(new Label("Username: "),0,0);
        gridpane.add(new Label("Senha: "),0,1);
        gridpane.add(new TextField(),1,0);
        gridpane.add(new TextField(),1,1);
        gridpane.add(new Button("Entrar"),0,2);
        return gridpane;
    }

    public static void main(String[] args) {
        launch();
    }

}