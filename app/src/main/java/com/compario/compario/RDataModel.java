package com.compario.compario;

/**
 * Created by Soham on 1/13/2020.
 */

public class RDataModel {
String TravelAgency;
String Type;
String Source;
String Destination;
int ahh,amm,rhh,rmm;
float Price;

    public RDataModel(String travelAgency, String type, String source, String destination, int ahh, int amm, int rhh, int rmm, float price) {
        TravelAgency = travelAgency;
        Type = type;
        Source = source;
        Destination = destination;
        this.ahh = ahh;
        this.amm = amm;
        this.rhh = rhh;
        this.rmm = rmm;
        Price = price;
    }

    public String getTravelAgency() {
        return TravelAgency;
    }

    public void setTravelAgency(String travelAgency) {
        TravelAgency = travelAgency;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getSource() {
        return Source;
    }

    public void setSource(String source) {
        Source = source;
    }

    public String getDestination() {
        return Destination;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public int getAhh() {
        return ahh;
    }

    public void setAhh(int ahh) {
        this.ahh = ahh;
    }

    public int getAmm() {
        return amm;
    }

    public void setAmm(int amm) {
        this.amm = amm;
    }

    public int getRhh() {
        return rhh;
    }

    public void setRhh(int rhh) {
        this.rhh = rhh;
    }

    public int getRmm() {
        return rmm;
    }

    public void setRmm(int rmm) {
        this.rmm = rmm;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }
}
