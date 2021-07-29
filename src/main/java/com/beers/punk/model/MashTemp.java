package com.beers.punk.model;

public class MashTemp {

    private Temp temp;
    private double duration;

    @Override
    public String toString() {
        return "MashTemp{" +
                "temp=" + temp +
                ", duration=" + duration +
                '}';
    }

    public Temp getTemp() {
        return temp;
    }

    public void setTemp(Temp temp) {
        this.temp = temp;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public MashTemp() {
    }
}
