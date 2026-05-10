package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class LoginController {
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    @FXML
    public void back(ActionEvent event) throws Exception{
        SceneManager.switchScene(event, "/fxml/landingPage.fxml");
    }
}
