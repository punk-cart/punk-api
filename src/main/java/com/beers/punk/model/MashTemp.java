package com.beers.punk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
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

}
