package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class LandingPageController {
    @FXML
    public void login(ActionEvent event) throws Exception{
        SceneManager.switchScene(event, "/fxml/login.fxml");
    }
    public void register(){

    }
}
