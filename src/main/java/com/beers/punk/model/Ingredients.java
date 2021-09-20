package com.beers.punk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ingredients {

    private Malt[] malt;
    private Hops[] hops;
    private String yeast;


    @Override
    public String toString() {
        return "Ingredients{" +
                "malt=" + Arrays.toString(malt) +
                ", hops=" + Arrays.toString(hops) +
                ", yeast='" + yeast + '\'' +
                '}';
    }

}
