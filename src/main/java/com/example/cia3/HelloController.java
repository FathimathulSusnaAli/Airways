package com.example.cia3;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    public Button closeButton;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("Airline Reservation System");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onSecondButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("reservation.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 600);
        Stage stage = new Stage();
        stage.setTitle("Airline Reservation System");
        stage.setScene(scene);
        stage.show();

    }



    @FXML
    protected void onThirdButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Signup.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 600);
        Stage stage = new Stage();
        stage.setTitle("Airline Reservation System");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onFourthButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("feedback.fxml"));
<<<<<<< HEAD
        Scene scene = new Scene(fxmlLoader.load(), 700, 600);
=======
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
>>>>>>> e75f97235914c517e2290894bdeb8ad22f37b490
        Stage stage = new Stage();
        stage.setTitle("Airline Reservation System");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onFifthButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("createacc.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 600);
        Stage stage = new Stage();
        stage.setTitle("Airline Reservation System");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onSixthButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Booking.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 600);
        Stage stage = new Stage();
        stage.setTitle("Airline Reservation System");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void closeButtonAction() throws IOException {
        // get a handle to the stage
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
//
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
//        Stage nstage = new Stage();
//        nstage.setTitle("HOME");
//        nstage.setScene(scene);
//        nstage.show();
    }



}