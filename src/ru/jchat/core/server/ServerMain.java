package ru.jchat.core.server;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class ServerMain extends Application {

    Thread mainThread;
    boolean running = true;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ServerFX.fxml"));
        primaryStage.setTitle("JChat Server");
        primaryStage.setScene(new Scene(root, 300, 400));
        primaryStage.show();
    }

//    class InnerServer implements Initializable {
//
//        @Override
//        public void initialize(URL location, ResourceBundle resources) {
//
//        }
//    }
    public static void main(String[] args) { launch();




    }

    public void launchServer () {


            mainThread = new Thread(() -> {
                new Server();
            });

            mainThread.start();



    }

    public void stopServer() {
        System.exit(0);
    }
}
