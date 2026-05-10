package controller;

import api.UserApi;
import client.RetrofitClient;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import service.AuthService;

public class LoginController {
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    @FXML
    public void back(ActionEvent event) throws Exception{
        SceneManager.switchScene(event, "/fxml/landingPage.fxml");
    }

    // LoginController.java
    @FXML
    public void login(ActionEvent event) {
        String user = username.getText();
        String pass = password.getText();

        // Tạo UserApi thông qua Retrofit, rồi truyền cho service
        UserApi api = RetrofitClient.getInstance().create(UserApi.class);
        AuthService authService = new AuthService(api);

        authService.login(user, pass);  // 👈 gọi xuống tầng service
    }
}
