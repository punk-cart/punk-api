package com.beers.punk.model;

public class Temp {

    private double value;
    private String unit;

    @Override
    public String toString() {
        return "Temp{" +
                "value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }

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

    public Temp() {
    }
}
