import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AuctionLauncher extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/landingPage.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("PONZI Auction");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        launch();
    }

}
