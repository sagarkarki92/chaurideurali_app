package com.example.chaurideuralimunicipality.model;

import java.util.Date;

public class Notice {

    private String date;
    private String title;
    private String body;


    public Notice(){}  //empty constructor for reading data from database

    public Notice(String publishdate, String title, String body) {
        this.date = date;
        this.title = title;
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String publishdate) {
        this.date = publishdate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


}
