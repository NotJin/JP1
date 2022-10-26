package assignment7.list;

import assignment7.Contact;
import assignment7.Main;
import assignment7.Student;
import assignment7.create.CreateController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import java.util.Comparator;
import java.util.Collections;

public class ListController {
    public ListView<Student> lv;

    public static ObservableList<assignment7.Contact> ls = FXCollections.observableArrayList();

    public void createStudent(ActionEvent event) throws Exception{
        Parent createForm = FXMLLoader.load(getClass().getResource("../create/create.fxml"));
        Scene sc = new Scene(createForm,800,600);
        Main.rootStage.setScene(sc);
    }

    public void edit() {
        CreateController.editedStudent = lv.getSelectionModel().getSelectedItem();

    }
}