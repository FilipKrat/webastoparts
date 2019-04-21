package com.webasto.webastoparts;

import com.jfoenix.controls.JFXButton;
import com.webasto.database.JDBCConnection;
import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class LoginController implements Initializable {

    @FXML
    private Label label;

    @FXML
    private HBox loadingCircle;

    @FXML
    private ImageView logo, settinglogo;

    @FXML
    private ImageView footer, settingfooter;
    @FXML
    private JFXButton loginButton, openLoginButton, openSettingButton, loadButton, settingsButton;

    @FXML
    private AnchorPane loginPane, settingsPane, mainPane;
    @FXML
    private Circle c1, c2, c3;

    @FXML
    private void handleSettingButtonAction(ActionEvent event) {
        loginPane.setVisible(false);
        settingsPane.setVisible(true);
    }

    @FXML
    private void handleOpenLoginButtonAction(ActionEvent event) {

        loginPane.setVisible(true);
        settingsPane.setVisible(false);
    }

    @FXML
    private void handleLoginButtonAction(ActionEvent event) throws IOException {

        loginButton.setVisible(false);
        loadingCircle.setVisible(true);
        loadingCircle.toFront();
        new Thread(new Rotations()).start();
    FadeTransition fadeOut = new FadeTransition(Duration.seconds(2), mainPane);
    fadeOut.setFromValue(1);
    fadeOut.setToValue(0);
    fadeOut.setCycleCount(1);

        JDBCConnection database = new JDBCConnection();
        database.connect();
        fadeOut.play();
        fadeOut.setOnFinished((e) -> {
            try {
                Stage stage = (Stage) loginButton.getScene().getWindow();
                stage.setTitle("Webasto Parts - Správa materiálů");
                stage.setMinHeight(520);
                stage.setMinWidth(800);
                stage.setResizable(true);
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/MaterialScene.fxml"));
                Parent root = fxmlLoader.load();
                Scene scene = new Scene(root);
                scene.getStylesheets().add("/styles/Styles.css");
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }

        });
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loginPane.setVisible(false);
        settingsPane.setVisible(false);
        if (!App.isSplashLoaded) {
            loadSplashScreen();
        }
           FadeTransition fadeIn2 = new FadeTransition(Duration.seconds(0.9), loginPane);
                    fadeIn2.setFromValue(0);
                    fadeIn2.setToValue(1);
                    fadeIn2.setCycleCount(1);
                    loginPane.setVisible(true);
                    fadeIn2.play();
        loginPane.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                footer.setFitWidth(newValue.doubleValue());
                settingfooter.setFitWidth(newValue.doubleValue());
                loginButton.setLayoutX((newValue.doubleValue() / 2.0) - 39.0); //39 - button_size/2 - not possible to count dynamically, setting after init
                settingsButton.setLayoutX((newValue.doubleValue() / 2.0) - 39.0);
            }
        });

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

    private void loadSplashScreen() {
        try {
            App.isSplashLoaded = true;
            //Load splash screen view FXML
            AnchorPane pane = FXMLLoader.load(getClass().getResource(("/fxml/SplashScreen.fxml")));
            //Add it to root container (Can be StackPane, AnchorPane etc)
            mainPane.getChildren().setAll(pane);
            new Thread(new Rotations()).start();
            //Load splash screen with fade in effect
            FadeTransition fadeIn = new FadeTransition(Duration.seconds(1.2), pane);
            fadeIn.setFromValue(0);
            fadeIn.setToValue(1);
            fadeIn.setCycleCount(1);

            //Finish splash with fade out effect
            FadeTransition fadeOut = new FadeTransition(Duration.seconds(1.5), pane);
            fadeOut.setFromValue(1);
            fadeOut.setToValue(0);
            fadeOut.setCycleCount(1);

            fadeIn.play();

            //After fade in, start fade out
            fadeIn.setOnFinished((e) -> {
                fadeOut.play();
            });

            //After fade out, load actual content
            fadeOut.setOnFinished((e) -> {
                try {
                    AnchorPane parentContent = FXMLLoader.load(getClass().getResource(("/fxml/LoginScene.fxml")));
                    mainPane.getChildren().setAll(parentContent);
                    
                } catch (IOException ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
