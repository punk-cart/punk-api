package com.beers.punk.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Method {

    private MashTemp[] mashTemp;
    private Fermentation fermentation;
    private Object twist;

    @Override
    public String toString() {
        return "Method{" +
                "mashTemp=" + Arrays.toString(mashTemp) +
                ", fermentation=" + fermentation +
                ", twist=" + twist +
                '}';
    }


}
