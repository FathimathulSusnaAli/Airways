package com.example.cia3;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class FlightData {

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



    public void flightData(ActionEvent event){ // method for Bangalore Airport option

        ObservableList<DataModel> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DBconnect.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM LIST_DETAILS");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new DataModel(Result.getString("FLIGHT_NUMBER"),
                        Result.getString("FLIGHT_NAME"),
                        Result.getString("FLIGHT_TIME"),
                        Result.getString("FLIGHT_DURATION"),
                        Result.getString("PRICE")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        ap_FLIGHT_NUMBER.setCellValueFactory(new PropertyValueFactory<>("FLIGHT_NUMBER"));
        ap_FLIGHT_NAME.setCellValueFactory(new PropertyValueFactory<>("FLIGHT_NAME"));
        ap_FLIGHT_TIME.setCellValueFactory(new PropertyValueFactory<>("FLIGHT_TIME"));
        ap_FLIGHT_DURATION.setCellValueFactory(new PropertyValueFactory<>("FLIGHT_DURATION"));
        ap_PRICE.setCellValueFactory(new PropertyValueFactory<>("PRICE"));

        flightTable.setItems(oblist);


    }

    @FXML
    protected void onNinthButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("distance.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 700, 600);
        Stage stage = new Stage();
        stage.setTitle("Airline Reservation System");
        stage.setScene(scene);
        stage.show();

    }

}
