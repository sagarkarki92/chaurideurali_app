package com.example.chaurideuralimunicipality.model;

import java.io.Serializable;
import java.util.List;

public class Gallery implements Serializable {
    private String title;
    private List<String> urls;

    public Gallery(){}
    public Gallery(String title, List<String> urls) {
        this.title = title;
        this.urls = urls;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }
}
