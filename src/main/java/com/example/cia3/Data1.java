package com.example.cia3;

public class Data1 {

    String NUMBER,DATE,DESTINATION,SCH_DEPARTTIME,PLANETYPE,CAPACITY,RESERVED_S,AVAILABLE_S;

    public Data1(String num, String date, String des, String depart, String type, String capacity, String reserved_s, String available_s) {
        this.NUMBER = num;
        this.DATE= date;
        this.DESTINATION = des;
        this.SCH_DEPARTTIME = depart;
        this.PLANETYPE = type;
        this.CAPACITY = capacity;
        this.RESERVED_S = reserved_s;
        this.AVAILABLE_S = available_s;
    }

    public String getNUMBER() {
        return NUMBER;
    }

    public void getNUMBER(String NUMBER) {
        NUMBER = NUMBER;
    }

    public String getDATE() {
        return DATE;
    }

    public void getDATE(String DATE) {
        DATE = DATE;
    }

    public String getDESTINATION() {
        return DESTINATION;
    }

    public void setDESTINATION(String DESTINATION) {
        DESTINATION = DESTINATION;
    }

    public String getSCH_DEPARTTIME() {
        return SCH_DEPARTTIME;
    }

    public void setSCH_DEPARTTIME(String SCH_DEPARTTIME) {
        SCH_DEPARTTIME = SCH_DEPARTTIME;
    }

    public String getPLANETYPE() {
        return PLANETYPE;
    }

    public void setPLANETYPE(String PLANETYPE) {
        PLANETYPE = PLANETYPE;
    }

    public String getCAPACITY() {
        return CAPACITY;
    }

    public void setCAPACITY(String CAPACITY) {
        CAPACITY = CAPACITY;
    }

    public String getRESERVED_S() {
        return RESERVED_S;
    }

    public void setRESERVED_S(String RESERVED_S) {
        RESERVED_S = RESERVED_S;
    }

    public String getAVAILABLE_S() {
        return AVAILABLE_S;
    }

    public void setAVAILABLE_S(String AVAILABLE_S) {
        AVAILABLE_S = AVAILABLE_S;
    }


}
