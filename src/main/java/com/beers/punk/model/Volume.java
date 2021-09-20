package com.beers.punk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Volume {

    private double value;
    private String unit;

    @Override
    public String toString() {
        return "Volume{" +
                "value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }


}
