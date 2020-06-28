/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00127417.modelo;

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
public class ModeloController implements Initializable {

    @FXML
    private Button button14;
    @FXML
    private AnchorPane anchorRoot;
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     
    @FXML
    private void backHome(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/pkg00127417/Home/home.fxml"));
        Scene scene = button14.getScene();
        root.translateYProperty().set(scene.getHeight());
        
        StackPane parentContainer = (StackPane) button14.getScene().getRoot();

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
