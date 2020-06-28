/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00127417.Home;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.util.Duration;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Oscar Lovato
 */
public class HomeController implements Initializable {

    
    @FXML
    private Button button,button1, button11, button12, button13;
    
    @FXML
    private AnchorPane anchorRoot;
    @FXML
    private StackPane parentContainer;
    
    @Override 
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void loadModelo(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/pkg00127417/modelo/modelo.fxml"));
        Scene scene = button.getScene();
        root.translateYProperty().set(scene.getHeight());

        parentContainer.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_BOTH);
        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(t -> {
            parentContainer.getChildren().remove(anchorRoot);
        });
        timeline.play();
    }
    
    @FXML
    private void loadDominio(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/pkg00127417/dominio/dominio.fxml"));
        Scene scene = button1.getScene();
        root.translateXProperty().set(scene.getHeight());

        parentContainer.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_BOTH);
        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(t -> {
            parentContainer.getChildren().remove(anchorRoot);
        });
        timeline.play();
    }
    @FXML
    private void loadMalla(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/pkg00127417/malla/malla.fxml"));
        Scene scene = button11.getScene();
        root.translateYProperty().set(scene.getHeight());

        parentContainer.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_BOTH);
        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(t -> {
            parentContainer.getChildren().remove(anchorRoot);
        });
        timeline.play();
    }
    @FXML
    private void loadCondiciones(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/pkg00127417/condiciones/condiciones.fxml"));
        Scene scene = button12.getScene();
        root.translateXProperty().set(scene.getHeight());

        parentContainer.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(root.translateXProperty(), 0, Interpolator.EASE_BOTH);
        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(t -> {
            parentContainer.getChildren().remove(anchorRoot);
        });
        timeline.play();
    }
     @FXML
    private void loadMef(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/pkg00127417/mef/mef.fxml"));
        Scene scene = button13.getScene();
        root.translateYProperty().set(scene.getHeight());

        parentContainer.getChildren().add(root);

        Timeline timeline = new Timeline();
        KeyValue kv = new KeyValue(root.translateYProperty(), 0, Interpolator.EASE_BOTH);
        KeyFrame kf = new KeyFrame(Duration.seconds(1), kv);
        timeline.getKeyFrames().add(kf);
        timeline.setOnFinished(t -> {
            parentContainer.getChildren().remove(anchorRoot);
        });
        timeline.play();
    }
    
    @FXML
    private void exit(ActionEvent event) throws IOException {
        System.exit(0);
    }
}
