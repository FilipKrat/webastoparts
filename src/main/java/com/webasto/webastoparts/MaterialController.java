/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webasto.webastoparts;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
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
import javafx.util.Duration;
import sun.security.tools.keytool.Main;

/**
 *
 * @author FilipKrat
 */
public class MaterialController implements Initializable {

    @FXML
    private ImageView searchFooter, searchBackgroundImage, addFooter, addBackgroundImage, filterFooter, filterBackgroundImage, printFooter, printBackgroundImage, settingFooter, settingBackgroundImage, materialImage;

    @FXML
    private AnchorPane allMaterialsPane, addMaterialPane, settingsPane, filterPane, printPane, mainPane, kittingPane;

    @FXML
    private Label notification;

    

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        final double SHAPE = searchBackgroundImage.getFitHeight() / searchBackgroundImage.getFitWidth();
        notification.setVisible(false);
        FadeTransition fadeIn = new FadeTransition(Duration.seconds(2), mainPane);
        fadeIn.setFromValue(0);
        fadeIn.setToValue(1);
        fadeIn.setCycleCount(1);

        allMaterialsPane.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                searchFooter.setFitWidth(newValue.doubleValue());
                addFooter.setFitWidth(newValue.doubleValue());
                filterFooter.setFitWidth(newValue.doubleValue());
                printFooter.setFitWidth(newValue.doubleValue());
                settingFooter.setFitWidth(newValue.doubleValue());
            }
        });
        allMaterialsPane.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                searchBackgroundImage.setFitHeight(newValue.doubleValue());
                searchBackgroundImage.setFitWidth(SHAPE * newValue.doubleValue());
                addBackgroundImage.setFitHeight(newValue.doubleValue());
                addBackgroundImage.setFitWidth(SHAPE * newValue.doubleValue());
                filterBackgroundImage.setFitHeight(newValue.doubleValue());
                filterBackgroundImage.setFitWidth(SHAPE * newValue.doubleValue());
                printBackgroundImage.setFitHeight(newValue.doubleValue());
                printBackgroundImage.setFitWidth(SHAPE * newValue.doubleValue());
                settingBackgroundImage.setFitHeight(newValue.doubleValue());
                settingBackgroundImage.setFitWidth(SHAPE * newValue.doubleValue());
            }
        });
        fadeIn.play();

    }

    @FXML
    private void handleOpenSearchButtonAction(ActionEvent event) {
        allMaterialsPane.setVisible(true);
        addMaterialPane.setVisible(false);
        settingsPane.setVisible(false);
        filterPane.setVisible(false);
        kittingPane.setVisible(false);
        printPane.setVisible(false);
        showNotification();
    }

    @FXML
    private void handleOpenAddButtonAction(ActionEvent event) {
        allMaterialsPane.setVisible(false);
        addMaterialPane.setVisible(true);
        settingsPane.setVisible(false);
        filterPane.setVisible(false);
        kittingPane.setVisible(false);
        printPane.setVisible(false);
    }

    @FXML
    private void handleOpenSettingsButtonAction(ActionEvent event) {
        allMaterialsPane.setVisible(false);
        addMaterialPane.setVisible(false);
        settingsPane.setVisible(true);
        filterPane.setVisible(false);
        kittingPane.setVisible(false);
        printPane.setVisible(false);
    }

    @FXML
    private void handleOpenPrintButtonAction(ActionEvent event) {
        allMaterialsPane.setVisible(false);
        addMaterialPane.setVisible(false);
        settingsPane.setVisible(false);
        kittingPane.setVisible(false);
        filterPane.setVisible(false);
        printPane.setVisible(true);
    }

    @FXML
    private void handleOpenWebPrintButtonAction(ActionEvent event) {

        try {
            Stage stage = new Stage();
            stage.setTitle("Webasto Parts - Tisk");
            stage.setMaximized(true);
            //stage.setResizable(false);
            FXMLLoader fxmlLoader = new FXMLLoader();
            Parent root = fxmlLoader.load(Main.class.getResource("/fxml/WebPrintScene.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(MaterialController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    private void handleOpenFilterButtonAction(ActionEvent event) {
        allMaterialsPane.setVisible(false);
        addMaterialPane.setVisible(false);
        settingsPane.setVisible(false);
        kittingPane.setVisible(false);
        filterPane.setVisible(true);
        printPane.setVisible(false);
    }

    @FXML
    private void handleOpenKittingButtonAction(ActionEvent event) {
        allMaterialsPane.setVisible(false);
        addMaterialPane.setVisible(false);
        settingsPane.setVisible(false);
        kittingPane.setVisible(true);
        filterPane.setVisible(false);
        printPane.setVisible(false);
    }

    public void showNotification() {
        this.notification.toFront();
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.25), evt -> notification.setVisible(true)),
                new KeyFrame(Duration.seconds(3.00), evt -> notification.setVisible(false)));
        timeline.setCycleCount(1);
        timeline.play();
    }

}
