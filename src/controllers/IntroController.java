package controllers;

import com.sun.deploy.uitoolkit.impl.fx.HostServicesFactory;
import com.sun.javafx.application.HostServicesDelegate;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;

public class IntroController extends ActionEvent {

    public void buttonClicked(MouseEvent m) throws IOException {
        System.out.println("clicked");
        Parent two = FXMLLoader.load(getClass().getResource("/files/afterIntro.fxml"));
        Scene sceneTwo = new Scene(two);
        Stage window = (Stage)((Node)m.getSource()).getScene().getWindow();
        window.setScene(sceneTwo);
        window.centerOnScreen();
        window.show();
    }

    public void goToURL(MouseEvent mouseEvent) {
        HostServicesDelegate hostServices = HostServicesFactory.getInstance(new Application() {
            @Override
            public void start(Stage primaryStage) throws Exception {

            }
        });
        hostServices.showDocument("https://cardgames.io/yahtzee/");

    }
}
