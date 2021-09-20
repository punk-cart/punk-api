package com.beers.punk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Amount {

    private double value;
    private String unit;


    @Override
    public String toString() {
        return "Amount{" +
                "value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }

}
