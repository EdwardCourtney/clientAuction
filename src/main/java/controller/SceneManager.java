package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.Stage;

public class SceneManager {

    public static void switchScene(ActionEvent event, String fxml) throws Exception {

        Parent root = FXMLLoader.load(
                SceneManager.class.getResource(fxml)
        );

        Stage stage = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();

        stage.setScene(new Scene(root));
    }
}
