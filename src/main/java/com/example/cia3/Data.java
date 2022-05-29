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

public class Data {

    @FXML
    private TableView<Data1> datatable; // fx:id of Table

    @FXML
    private TableColumn<Data1, String> ap_NUMBER; // fx:id of column Time

    @FXML
    private TableColumn<Data1, String> ap_DATE; // fx:id of column Route

    @FXML
    private TableColumn<Data1, String> ap_DESTINATION; // fx:id of column Aircraft

    @FXML
    private TableColumn<Data1, String> ap_SCH_DEPARTTIME; // fx:id of column Type

    @FXML
    private TableColumn<Data1, String> ap_PLANETYPE; // fx:id of column Airline

    @FXML
    private TableColumn<Data1, String> ap_CAPACITY; // fx:id of column Airline

    @FXML
    private TableColumn<Data1, String> ap_RESERVED_S; // fx:id of column Airline

    @FXML
    private TableColumn<Data1, String> ap_AVAILABLE_S; // fx:id of column Airline



    public void datatable(ActionEvent event){ // method for Bangalore Airport option

        ObservableList<Data1> oblist = FXCollections.observableArrayList();
        try {

            Connection connectDB = DBconnect.getConnection();

            ResultSet Result = connectDB.createStatement().executeQuery("SELECT * FROM unscheduled_list");
            System.out.println(Result);

            // Fetching Data from the columns of the table from database

            while (Result.next()) {
                oblist.add(new Data1(Result.getString("NUMBER"),
                        Result.getString("DATE"),
                        Result.getString("DESTINATION"),
                        Result.getString("SCH_DEPARTTIME"),
                        Result.getString("PLANETYPE"),
                        Result.getString("CAPACITY"),
                        Result.getString("RESERVED_S"),
                        Result.getString("AVAILABLE_S")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

        // Assigning Data from database to the columns of the tableview


        ap_NUMBER.setCellValueFactory(new PropertyValueFactory<>("NUMBER"));
        ap_DATE.setCellValueFactory(new PropertyValueFactory<>("DATE"));
        ap_DESTINATION.setCellValueFactory(new PropertyValueFactory<>("DESTINATION"));
        ap_SCH_DEPARTTIME.setCellValueFactory(new PropertyValueFactory<>("SCH_DEPARTTIME"));
        ap_PLANETYPE.setCellValueFactory(new PropertyValueFactory<>("PLANETYPE"));
        ap_CAPACITY.setCellValueFactory(new PropertyValueFactory<>("CAPACITY"));
        ap_RESERVED_S.setCellValueFactory(new PropertyValueFactory<>("RESERVED_S"));
        ap_AVAILABLE_S.setCellValueFactory(new PropertyValueFactory<>("AVAILABLE_S"));


        datatable.setItems(oblist);


    }

}
