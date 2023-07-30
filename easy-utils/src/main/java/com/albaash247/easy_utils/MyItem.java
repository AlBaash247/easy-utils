package com.albaash247.easy_utils;

public class MyItem {

    public MyItem() {
    }

    public MyItem(String title, String details, String imgUrl) {
        this.title = title;
        this.details = details;
        this.imgUrl = imgUrl;
    }

    private String title;
    private String details;
    private String imgUrl;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
