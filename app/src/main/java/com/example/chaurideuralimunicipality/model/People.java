package com.example.chaurideuralimunicipality.model;

import java.io.Serializable;

public class People implements Serializable {
    String name;
    String post;
    String phonenumber;

    public People(){}
    public People(String name, String post, String phonenumber) {
        this.name = name;
        this.post = post;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
