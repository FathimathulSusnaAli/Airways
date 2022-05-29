package com.example.cia3;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class distance {

    @FXML
    private TableView<distance1> distancetable; // fx:id of Table

    @FXML
    private TableColumn<distance1, String> ap_AIRPORT_CODE; // fx:id of column Time

    @FXML
    private TableColumn<distance1, String> ap_AIRPORT_LOCATION; // fx:id of column Route

    @FXML
    private TableColumn<distance1, String> ap_YEAR_OPENED; // fx:id of column Aircraft

    @FXML
    private TableColumn<distance1, String> ap_NUMBER_OF_TERMINALS; // fx:id of column Type




    public void distancetable(ActionEvent event){ // method for Bangalore Airport option

        ObservableList<distance1> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DBconnect.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM AIRPORT_DISTANCE");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new distance1(Result.getString("AIRPORT_CODE"),
                        Result.getString("AIRPORT_LOCATION"),
                        Result.getString("YEAR_OPENED"),


                        Result.getString("NUMBER_OF_TERMINALS")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        ap_AIRPORT_CODE.setCellValueFactory(new PropertyValueFactory<>("AIRPORT_CODE"));
        ap_AIRPORT_LOCATION.setCellValueFactory(new PropertyValueFactory<>("AIRPORT_LOCATION"));
        ap_YEAR_OPENED.setCellValueFactory(new PropertyValueFactory<>("YEAR_OPENED"));
        ap_NUMBER_OF_TERMINALS.setCellValueFactory(new PropertyValueFactory<>("NUMBER_OF_TERMINALS"));



        distancetable.setItems(oblist);


    }

}