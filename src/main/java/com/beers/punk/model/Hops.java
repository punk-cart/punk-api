package com.beers.punk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
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

}
