package com.webasto.webastoparts;

import com.sun.javafx.application.LauncherImpl;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class App extends Application {
public static boolean isSplashLoaded = false;
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/LoginScene.fxml")); 
        Parent root = fxmlLoader.load(); 
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
        stage.setTitle("Webasto Parts - Přihlášení");
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }
    @Override
       public void init() throws Exception {
          // Do some heavy lifting
       }
    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LauncherImpl.launchApplication(App.class, AppPreloader.class, args);
        //launch(args);
    }

}
