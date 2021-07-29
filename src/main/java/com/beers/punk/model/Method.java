package com.beers.punk.model;


import java.util.Arrays;

public class Method {

    private MashTemp[] mashTemp;
    private Fermentation fermentation;
    private Object twist;

    @Override
    public String toString() {
        return "Method{" +
                "mashTemp=" + Arrays.toString(mashTemp) +
                ", fermentation=" + fermentation +
                ", twist=" + twist +
                '}';
    }

    public MashTemp[] getMashTemp() {
        return mashTemp;
    }

    public void setMashTemp(MashTemp[] mashTemp) {
        this.mashTemp = mashTemp;
    }

    public Fermentation getFermentation() {
        return fermentation;
    }

    public void setFermentation(Fermentation fermentation) {
        this.fermentation = fermentation;
    }

    public Object getTwist() {
        return twist;
    }

    public void setTwist(Object twist) {
        this.twist = twist;
    }

    public Method() {
    }
}
