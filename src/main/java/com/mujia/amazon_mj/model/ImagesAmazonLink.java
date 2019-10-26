package com.mujia.amazon_mj.model;

public class ImagesAmazonLink {
    private String asin;

    private String country;

    private String imagelink;

    private Byte orderid;

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin == null ? null : asin.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getImagelink() {
        return imagelink;
    }

    public void setImagelink(String imagelink) {
        this.imagelink = imagelink == null ? null : imagelink.trim();
    }

    public Byte getOrderid() {
        return orderid;
    }

    public void setOrderid(Byte orderid) {
        this.orderid = orderid;
    }
}