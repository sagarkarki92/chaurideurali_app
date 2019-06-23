package com.example.chaurideuralimunicipality.model;

import java.io.Serializable;

public class WardDetailInformation implements Serializable {

    private String sachivName;
    private  String population;
    private String ward_phone_number;

    public WardDetailInformation(){}

    public WardDetailInformation(String sachivName, String population, String ward_phone_number) {
        this.sachivName = sachivName;
        this.population = population;
        this.ward_phone_number = ward_phone_number;
    }



    public String getSachivName() {
        return sachivName;
    }

    public void setSachivName(String sachivName) {
        this.sachivName = sachivName;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getWard_phone_number() {
        return ward_phone_number;
    }

    public void setWard_phone_number(String ward_phone_number) {
        this.ward_phone_number = ward_phone_number;
    }
}
