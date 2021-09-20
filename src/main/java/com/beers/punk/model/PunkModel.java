package com.beers.punk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.util.Arrays;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PunkModel{

    @Id
    private String id;
    private String name;
    private String tagline;
    private String first_brewed;
    private String description;
    private String image_url;
    private double abv;
    private double ibu;
    private double target_fg;
    private double target_og;
    private double ebc;
    private double srm;
    private double ph;
    private double attenuation_level;
    private Volume volume;
    private BoilVolume boil_volume;
    private Method method;
    private Ingredients ingredients;
    private String[] food_pairing;
    private String brewers_tips;
    private String contributed_by;


    @Override
    public String toString() {
        return "PunkModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", tagline='" + tagline + '\'' +
                ", first_brewed='" + first_brewed + '\'' +
                ", description='" + description + '\'' +
                ", image_url='" + image_url + '\'' +
                ", abv=" + abv +
                ", ibu=" + ibu +
                ", target_fg=" + target_fg +
                ", target_og=" + target_og +
                ", ebc=" + ebc +
                ", srm=" + srm +
                ", ph=" + ph +
                ", attenuation_level=" + attenuation_level +
                ", volume=" + volume +
                ", boil_volume=" + boil_volume +
                ", method=" + method +
                ", ingredients=" + ingredients +
                ", food_pairing=" + Arrays.toString(food_pairing) +
                ", brewers_tips='" + brewers_tips + '\'' +
                ", contributed_by='" + contributed_by + '\'' +
                '}';
    }

}
