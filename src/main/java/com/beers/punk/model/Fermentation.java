package com.beers.punk.model;

public class Fermentation {

    private Temp temp;

    @Override
    public String toString() {
        return "Fermentation{" +
                "temp=" + temp +
                '}';
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public Fermentation() {
    }
}
