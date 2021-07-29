package com.beers.punk.model;

public class BoilVolume {

    private double value;
    private String unit;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "BoilVolume{" +
                "value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }

    public BoilVolume() {
    }
}
