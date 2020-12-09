package com.tec;
import com.tec.ui.UIEngine;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;

public class Main extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/com/tec/ui/app.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("LogoTec");
        Scene scene = new Scene(root, 1080, 720);

        //primaryStage.setScene(new Scene(root, 1080, 720));
        UIEngine motor= new UIEngine(primaryStage,scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
