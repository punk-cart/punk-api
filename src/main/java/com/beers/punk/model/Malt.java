package com.beers.punk.model;

public class Malt {

    private String name;
    private Amount amount;

    @Override
    public String toString() {
        return "Malt{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Malt() {
    }
}
