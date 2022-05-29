package com.example.cia3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


import java.io.IOException;


public class HelloController {

    @FXML
    private TableView<DataModel> flightTable; // fx:id of Table

    @FXML
    private TableColumn<DataModel, String> ap_FLIGHT_NUMBER; // fx:id of column Time

    @FXML
    private TableColumn<DataModel, String> ap_FLIGHT_NAME; // fx:id of column Route

    @FXML
    private TableColumn<DataModel, String> ap_FLIGHT_TIME; // fx:id of column Aircraft

    @FXML
    private TableColumn<DataModel, String> ap_FLIGHT_DURATION; // fx:id of column Type

    @FXML
    private TableColumn<DataModel, String> ap_PRICE; // fx:id of column Airline

    @FXML
    private Label welcomeText;

    @FXML
    public Button closeButton;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("home.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);
        Stage stage = new Stage();
        stage.setTitle("Airline Reservation System");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    protected void onSecondButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("reservation.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
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

        Scene scene = new Scene(fxmlLoader.load(), 700, 500);
        Stage stage = new Stage();
        stage.setTitle("Airline Reservation System");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void onFifthButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("createacc.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
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
    protected void onSeventhButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("search.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 600);
        Stage stage = new Stage();
        stage.setTitle("Airline Reservation System");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    protected void onEigthButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Unscheduled_flight.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 600);
        Stage stage = new Stage();
        stage.setTitle("Airline Reservation System");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    protected void onTenthButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("thankyou.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 400);
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