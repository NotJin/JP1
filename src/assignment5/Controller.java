package assignment5;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.util.Comparator;
import javafx.scene.text.Text;

import java.security.PublicKey;

public class Controller {
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtAddress;
    public TextField txtPhone;

    public ListView<Contact> lv;

    private ObservableList<assignment5.Contact> ls = FXCollections.observableArrayList();

    public void submit(ActionEvent actionEvent) {
        String Name = txtName.getText();
        String Email = txtEmail.getText();
        String Address = txtAddress.getText();
        String Phone = txtPhone.getText();

        Contact ct = new Contact(Name,Email,Address,Phone);
        ls.add(ct);
        print();
    }

    public void print(){
        lv.setItems(ls);
    }

    public void soft(ActionEvent actionEvent) {

    }
}
