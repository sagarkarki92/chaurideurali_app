package com.example.chaurideuralimunicipality.model;

import android.net.Uri;

public class Gallery {
    private String title;
    private Uri bgimage;

    public Gallery(String title, Uri bgimage) {
        this.title = title;
        this.bgimage = bgimage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Uri getBgimage() {
        return bgimage;
    }

    public void setBgimage(Uri bgimage) {
        this.bgimage = bgimage;
    }
}
