/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00127417.mef.pasos.paso6;

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
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Oscar Lovato
 */
public class Paso6Controller implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private Button button;
    @FXML
    private AnchorPane anchorRoot;
    
    @FXML
    private void backMef(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/pkg00127417/mef/mef.fxml"));
        Scene scene = button.getScene();
        root.translateYProperty().set(scene.getHeight());
        
        StackPane parentContainer = (StackPane) button.getScene().getRoot();

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
    private void paso5(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/pkg00127417/mef/pasos/paso5/paso5.fxml"));
        Scene scene = button.getScene();
        root.translateYProperty().set(scene.getHeight());
        
        StackPane parentContainer = (StackPane) button.getScene().getRoot();

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
    private void paso7(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/pkg00127417/mef/pasos/paso7/paso7.fxml"));
        Scene scene = button.getScene();
        root.translateYProperty().set(scene.getHeight());
        
        StackPane parentContainer = (StackPane) button.getScene().getRoot();

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
}
