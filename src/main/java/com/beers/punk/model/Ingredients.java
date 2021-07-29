package com.beers.punk.model;

import java.util.Arrays;

public class Ingredients {

    private Malt[] malt;

    @Override
    public String toString() {
        return "Ingredients{" +
                "malt=" + Arrays.toString(malt) +
                ", hops=" + Arrays.toString(hops) +
                ", yeast='" + yeast + '\'' +
                '}';
    }

    public Malt[] getMalt() {
        return malt;
    }

    public void setMalt(Malt[] malt) {
        this.malt = malt;
    }

    public Hops[] getHops() {
        return hops;
    }

    public void setHops(Hops[] hops) {
        this.hops = hops;
    }

    public String getYeast() {
        return yeast;
    }

    public void setYeast(String yeast) {
        this.yeast = yeast;
    }

    public Ingredients() {
    }

    private Hops[] hops;
    private String yeast;

}
