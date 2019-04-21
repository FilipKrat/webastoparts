/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.webasto.webastoparts;

import javafx.application.Preloader;
import javafx.application.Preloader.StateChangeNotification.Type;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class AppPreloader extends Preloader {
private Stage preloaderStage;
 
    @Override
    public void start(Stage primaryStage) throws Exception {
       this.preloaderStage = primaryStage;
 
       VBox loading = new VBox(0);
 
       BorderPane root = new BorderPane(loading);
       Scene scene = new Scene(root);
 
       primaryStage.setWidth(0);
       primaryStage.setHeight(0);
       primaryStage.setScene(scene);
   }
 
   @Override
   public void handleStateChangeNotification(StateChangeNotification stateChangeNotification) {
      if (stateChangeNotification.getType() == Type.BEFORE_START) {
         preloaderStage.hide();
      }
   }
}