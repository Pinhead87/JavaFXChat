package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField messageField;
    @FXML
    TextArea mainTextArea;


    public void btnOneClickAction(ActionEvent actionEvent) {
        mainTextArea.appendText(messageField.getText() + '\n');
        messageField.clear();
        messageField.requestFocus();
    }
}
