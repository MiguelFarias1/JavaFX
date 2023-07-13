package program;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class ViewController implements Initializable{
    
    @FXML
    private ComboBox<Person> comboPerson;

    private ObservableList observable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        List<Person> list = new ArrayList<>();

        Person person = new Person(1L, "Miguel", "miguel@teste.com");
        Person person2 = new Person(2L, "Rafael", "rafael@teste.com");
        Person person3 = new Person(3L, "Lucas", "lucas@teste.com");

        list.add(person3);
        list.add(person2);
        list.add(person);

        observable = FXCollections.observableArrayList(list);

        comboPerson.setItems(observable);
    }

}