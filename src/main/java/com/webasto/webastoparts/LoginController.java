package com.webasto.webastoparts;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
import javafx.stage.Stage;

public class LoginController implements Initializable {
    private Stage stage;
    @FXML
    private Label label;
    
    @FXML
    private ImageView logo, settinglogo;
    
    @FXML
    private ImageView footer, settingfooter;
    @FXML
    private JFXButton loginButton, openLoginButton, openSettingButton, loadButton, settingsButton;
    
     @FXML
    private AnchorPane loginPane, settingsPane;
    
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
    private void handleLoginButtonAction(ActionEvent event) throws IOException{
        //try {
        stage = (Stage) loginButton.getScene().getWindow();
        stage.setTitle("Správa materiálů");
        Parent root;
        root = (Parent) FXMLLoader.load(getClass().getResource("/fxml/MaterialScene.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        stage.setScene(scene);
        
        //} catch(Exception e) {
          // e.printStackTrace();
          //}
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        loginPane.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                footer.setFitWidth(newValue.doubleValue());
                settingfooter.setFitWidth(newValue.doubleValue());
                loginButton.setLayoutX((newValue.doubleValue()/2.0)-39.0); //39 - button_size/2 - not possible to count dynamically, setting after init
                settingsButton.setLayoutX((newValue.doubleValue()/2.0)-39.0);
            }
         });
             
    } 
    
    

    
    
//    
//    public void showLogo() {
//    try {
//        Image image = new Image("../images/Webasto_logo.jpg");
//        logo.setImage(image);
//        logo.setCache(true);
//    } catch (Exception e) {
//        printStackTrace();
//    }
//}
//    public void showFooter() {
//    try {
//        Image image = new Image("../images/Webasto_footer.png");
//        logo.setImage(image);
//        logo.setCache(true);
//    } catch (Exception e) {
//        printStackTrace();
//    }
//}

}
