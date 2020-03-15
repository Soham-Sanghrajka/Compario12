package com.compario.compario;

public class BusListData {
private String travelAgency,arrTime,deptTime,journeyTime,busType;
private float price;

    public BusListData(String travelAgency, String arrTime, String deptTime, String journeyTime, String busType, float price) {
        this.travelAgency = travelAgency;
        this.arrTime = arrTime;
        this.deptTime = deptTime;
        this.journeyTime = journeyTime;
        this.busType = busType;
        this.price = price;
    }

    public String getTravelAgency() {
        return travelAgency;
    }

    public void setTravelAgency(String travelAgency) {
        this.travelAgency = travelAgency;
    }

    public String getArrTime() {
        return arrTime;
    }

    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    public String getDeptTime() {
        return deptTime;
    }

    public void setDeptTime(String deptTime) {
        this.deptTime = deptTime;
    }

    public String getJourneyTime() {
        return journeyTime;
    }

    public void setJourneyTime(String journeyTime) {
        this.journeyTime = journeyTime;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
