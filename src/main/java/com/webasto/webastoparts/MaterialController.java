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
public class MaterialController implements Initializable{
    
@FXML
    private ImageView footer, backgroundImage;
    
@FXML
    private AnchorPane mainPane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(backgroundImage.getFitHeight());
        final double SHAPE = backgroundImage.getFitHeight()/backgroundImage.getFitWidth();
        
        mainPane.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                footer.setFitWidth(newValue.doubleValue());   
            }
         });
        mainPane.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                backgroundImage.setFitHeight(newValue.doubleValue());   
                backgroundImage.setFitWidth(SHAPE*newValue.doubleValue());
            }
         });
        }
    
}
