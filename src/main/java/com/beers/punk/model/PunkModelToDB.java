package com.beers.punk.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Beers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PunkModelToDB {

    @Id
    @Column(name="Id")
    private String id;
    @Column(name="Name")
    private String name;
    @Column(name="TagLine")
    private String tagline;
    @Column(name="FirstBrewed")
    private String firstBrewed;
    @Lob
    @Column(columnDefinition = "text", name="Description")
    private String description;
    @Column(name="ImageURL")
    private String imageUrl;
    @Column(name="ABV")
    private double abv;
    @Column(name="IBU")
    private double ibu;
    @Column(name="TargetFg")
    private double targetFg;
    @Column(name="TargetOg")
    private double targetOg;
    @Column(name="EBC")
    private double ebc;
    @Column(name="SRM")
    private double srm;
    @Column(name="PH")
    private double ph;
    @Column(name="AttenuationLevel")
    private double attenuationLevel;
    @Column(name="Volume")
    private String volume;
    @Column(name="BoilVolume")
    private String boilVolume;
    @Column(name="Method")
    private String method;
    @Lob
    @Column(columnDefinition = "text", name="Ingredients")
    private String ingredients;
    @Column(name="FoodPairing")
    private String[] foodPairing;
    @Column(name="BrewerTips")
    private String brewersTips;
    @Column(name="ContributedBy")
    private String contributedBy;
}
