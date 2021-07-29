package com.beers.punk.model;

public class Hops {

    private String name;
    private Amount amount;
    private String add;
    private String attribute;

    @Override
    public String toString() {
        return "Hops{" +
                "name='" + name + '\'' +
                ", amount=" + amount +
                ", add='" + add + '\'' +
                ", attribute='" + attribute + '\'' +
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

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public Hops() {
    }
}
