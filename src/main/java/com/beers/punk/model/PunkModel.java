package com.beers.punk.model;

import org.springframework.http.ResponseEntity;

import java.io.Serializable;
import java.util.Arrays;

public class PunkModel{

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


    public PunkModel() {
    }

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getFirst_brewed() {
        return first_brewed;
    }

    public void setFirst_brewed(String first_brewed) {
        this.first_brewed = first_brewed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public double getAbv() {
        return abv;
    }

    public void setAbv(double abv) {
        this.abv = abv;
    }

    public double getIbu() {
        return ibu;
    }

    public void setIbu(double ibu) {
        this.ibu = ibu;
    }

    public double getTarget_fg() {
        return target_fg;
    }

    public void setTarget_fg(double target_fg) {
        this.target_fg = target_fg;
    }

    public double getTarget_og() {
        return target_og;
    }

    public void setTarget_og(double target_og) {
        this.target_og = target_og;
    }

    public double getEbc() {
        return ebc;
    }

    public void setEbc(double ebc) {
        this.ebc = ebc;
    }

    public double getSrm() {
        return srm;
    }

    public void setSrm(double srm) {
        this.srm = srm;
    }

    public double getPh() {
        return ph;
    }

    public void setPh(double ph) {
        this.ph = ph;
    }

    public double getAttenuation_level() {
        return attenuation_level;
    }

    public void setAttenuation_level(double attenuation_level) {
        this.attenuation_level = attenuation_level;
    }

    public Volume getVolume() {
        return volume;
    }

    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    public BoilVolume getBoil_volume() {
        return boil_volume;
    }

    public void setBoil_volume(BoilVolume boil_volume) {
        this.boil_volume = boil_volume;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public String[] getFood_pairing() {
        return food_pairing;
    }

    public void setFood_pairing(String[] food_pairing) {
        this.food_pairing = food_pairing;
    }

    public String getBrewers_tips() {
        return brewers_tips;
    }

    public void setBrewers_tips(String brewers_tips) {
        this.brewers_tips = brewers_tips;
    }

    public String getContributed_by() {
        return contributed_by;
    }

    public void setContributed_by(String contributed_by) {
        this.contributed_by = contributed_by;
    }
}
