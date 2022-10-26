package assignment7.create;

import assignment7.Contact;
import assignment7.Main;
import assignment7.Student;
import assignment7.list.ListController;
import assignment7.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class CreateController {
    public ListView<Contact> lv;
    public static Student editedStudent;
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtMark;

    public void backToList(ActionEvent event) throws Exception{
        Parent listScene = FXMLLoader.load(getClass().getResource("../list/list.fxml"));
        Scene sc = new Scene(listScene,800,600);
        Main.rootStage.setScene(sc);
    }

    public void submit(ActionEvent event) throws Exception{
        // them sv
        String Name = txtName.getText();
        String Email = txtEmail.getText();
        String Mark = txtMark.getText();

        Contact ct = new Contact(Name,Email,Mark);
        ListController.ls.add(ct);

        // xong
        Print();

        backToList(null);
    }
    public void Print(){
        lv.setItems(ListController.ls);
    }
}