package com.mujia.amazon_mj.model;

public class MainFeatures {
    private Integer id;

    private String mainasin;

    private String features;

    private Byte orderid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMainasin() {
        return mainasin;
    }

    public void setMainasin(String mainasin) {
        this.mainasin = mainasin == null ? null : mainasin.trim();
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features == null ? null : features.trim();
    }

    public Byte getOrderid() {
        return orderid;
    }

    public void setOrderid(Byte orderid) {
        this.orderid = orderid;
    }
}