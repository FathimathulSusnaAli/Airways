package com.example.cia3;

public class distance1 {

    String AIRPORT_CODE, AIRPORT_LOCATION, YEAR_OPENED, NUMBER_OF_TERMINALS;

    public distance1(String code, String location, String year, String terminals) {
        this.AIRPORT_CODE = code;
        this.AIRPORT_LOCATION= location;
        this.YEAR_OPENED = year;
        this.NUMBER_OF_TERMINALS = terminals;

    }

    public String getAIRPORT_CODE() {
        return AIRPORT_CODE;
    }

    public void getAIRPORT_CODE(String AIRPORT_CODE) {
        AIRPORT_CODE = AIRPORT_CODE;
    }

    public String getAIRPORT_LOCATION() {
        return AIRPORT_LOCATION;
    }

    public void getDATE(String AIRPORT_LOCATION) {
        AIRPORT_LOCATION = AIRPORT_LOCATION;
    }

    public String getYEAR_OPENED() {
        return YEAR_OPENED;
    }

    public void setYEAR_OPENED(String YEAR_OPENED) {
        YEAR_OPENED = YEAR_OPENED;
    }

    public String getNUMBER_OF_TERMINALS() {
        return NUMBER_OF_TERMINALS;
    }

    public void setNUMBER_OF_TERMINALS(String NUMBER_OF_TERMINALS) {
        NUMBER_OF_TERMINALS = NUMBER_OF_TERMINALS;
    }




}
