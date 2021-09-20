package com.beers.punk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fermentation {

    private Temp temp;

    @Override
    public String toString() {
        return "Fermentation{" +
                "temp=" + temp +
                '}';
    }
}
