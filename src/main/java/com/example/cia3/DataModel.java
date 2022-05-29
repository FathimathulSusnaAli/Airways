package com.example.cia3;

public class DataModel {
    String FLIGHT_NUMBER,FLIGHT_NAME,FLIGHT_TIME,FLIGHT_DURATION,PRICE;

    public DataModel(String flight_number, String flight_name, String flight_time, String flight_duration, String price) {
        this.FLIGHT_NUMBER = flight_number;
        this.FLIGHT_NAME= flight_name;
        this.FLIGHT_TIME = flight_time;
        this.FLIGHT_DURATION = flight_duration;
        this.PRICE = price;
    }

    public String getFLIGHT_NUMBER() {
        return FLIGHT_NUMBER;
    }

    public void getFLIGHT_NUMBER(String FLIGHT_NUMBER) {
        FLIGHT_NUMBER = FLIGHT_NUMBER;
    }

    public String getFLIGHT_NAME() {
        return FLIGHT_NAME;
    }

    public void getFLIGHT_NAME(String FLIGHT_NAME) {
        FLIGHT_NAME = FLIGHT_NAME;
    }

    public String getFLIGHT_TIME() {
        return FLIGHT_TIME;
    }

    public void setAircraft(String FLIGHT_TIME) {
        FLIGHT_TIME = FLIGHT_TIME;
    }

    public String getFLIGHT_DURATION() {
        return FLIGHT_DURATION;
    }

    public void setType(String FLIGHT_DURATION) {
        FLIGHT_DURATION = FLIGHT_DURATION;
    }

    public String getPRICE() {
        return PRICE;
    }

    public void setPRICE(String PRICE) {
        PRICE = PRICE;
    }
}
