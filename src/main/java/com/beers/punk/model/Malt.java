package com.beers.punk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
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

}
