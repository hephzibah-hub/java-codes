/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myanimation;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.ParallelTransition;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 *
 * 
 */
public class FXMLDocumentController implements Initializable {
    
@FXML
    private Text a;
 
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
  
       
       Polyline polyline = new Polyline();
polyline.getPoints().addAll(new Double[]{
      //0.0, 0.0,
        -150.0, 0.0, 
        150.0, 0.0, 
        0.0, -170.0,
        -170.0, 0.0,
        0.0, 170.0
      //  0.0, 0.0,
});
        
RotateTransition rt = new RotateTransition(Duration.millis(400), a);
       rt.setNode(a);
        rt.setByAngle(360f);
        rt.setCycleCount(12);
        
       PathTransition transition = new PathTransition();
       transition.setNode(a);
       transition.setDuration(Duration.seconds(5));
       transition.setPath(polyline);
       transition.setAutoReverse(true);
    
       
       ParallelTransition pt = new ParallelTransition();
        pt.getChildren().addAll(rt, transition);
        pt.setAutoReverse(true);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.play();   
}
    
}


