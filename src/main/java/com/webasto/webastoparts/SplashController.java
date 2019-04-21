package com.webasto.webastoparts;

import java.net.URL;

import java.util.ResourceBundle;
import javafx.animation.RotateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;

import javafx.util.Duration;

public class SplashController implements Initializable {

    @FXML
    private HBox loadingCircle;

    @FXML
    private AnchorPane mainPane;
    @FXML
    private Circle c1, c2, c3;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        new Thread(new Rotations()).start();
    }

    public class Rotations implements Runnable {

        @Override
        public void run() {
            setRotate(c3, true, 360, 8);
            setRotate(c2, true, 180, 12);
            setRotate(c1, true, 145, 15);
        }

        private void setRotate(Circle c, boolean reverse, int angle, long duration) {
            RotateTransition rotateTransition = new RotateTransition(Duration.seconds(duration), c);
            rotateTransition.setAutoReverse(reverse);
            rotateTransition.setByAngle(angle);
            rotateTransition.setDelay(Duration.seconds(0));
            rotateTransition.setRate(3);
            rotateTransition.setCycleCount(18);
            rotateTransition.play();
        }
    }

}
