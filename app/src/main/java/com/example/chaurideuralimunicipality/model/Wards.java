package com.example.chaurideuralimunicipality.model;

import java.util.ArrayList;

public class Wards {
    private int wardnumber;
    private String wardname;

    public Wards(int wardnumber, String wardname) {
        this.wardnumber = wardnumber;
        this.wardname = wardname;
    }

    public int getWardnumber() {
        return wardnumber;
    }

    public void setWardnumber(int wardnumber) {
        this.wardnumber = wardnumber;
    }

    public String getWardname() {
        return wardname;
    }

    public void setWardname(String wardname) {
        this.wardname = wardname;
    }


}
