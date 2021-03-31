package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextField t;


    @FXML
    public void cb1(ActionEvent actionOne){
       Double a = Double.parseDouble(t.getText());
        if (a<3){
            a++;
        t.setText(String.valueOf(a));}
    }
    @FXML
    public void cb2(ActionEvent actionOne){
       Double a = Double.parseDouble(t.getText());
        if (a>-5){
            a--;
            t.setText(String.valueOf(a));}
    }
}
