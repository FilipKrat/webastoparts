/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webasto.webastoparts;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author FilipKrat
 */
public class MaterialController implements Initializable {

    @FXML
    private ImageView searchFooter, searchBackgroundImage, addFooter, addBackgroundImage, filterFooter, filterBackgroundImage, printFooter, printBackgroundImage, settingFooter, settingBackgroundImage, materialImage;

    @FXML
    private AnchorPane allMaterialsPane, addMaterialpane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        final double SHAPE = searchBackgroundImage.getFitHeight() / searchBackgroundImage.getFitWidth();

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
    }

}
