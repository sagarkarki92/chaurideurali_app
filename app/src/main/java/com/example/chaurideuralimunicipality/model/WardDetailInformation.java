package com.example.chaurideuralimunicipality.model;

import java.io.Serializable;

public class WardDetailInformation implements Serializable {

    private String sachivName;
    private  String population;
    private String ward_phone_number;
    private String wardno;

    public WardDetailInformation(){}

    public WardDetailInformation(String wardno,String sachivName, String population, String ward_phone_number) {
        this.sachivName = sachivName;
        this.population = population;
        this.ward_phone_number = ward_phone_number;
        this.wardno = wardno;

    }

    public String getWardno() {
        return wardno;
    }

    public void setWardno(String wardno) {
        this.wardno = wardno;
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
