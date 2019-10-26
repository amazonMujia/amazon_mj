package com.mujia.amazon_mj.model;

import java.math.BigDecimal;
import java.util.Date;

public class Main {
    private Long id;

    private String mainasin;

    private String relationasin;

    private String shopname;

    private String country;

    private BigDecimal rate;

    private Integer ratings;

    private Integer customerreviews;

    private Integer answeredquestions;

    private String bigcategorytype;

    private String smallcategorytype;

    private Integer bigcategoryrank;

    private Integer smallcategoryrank;

    private String briefintro;

    private Date getdate;

    private String macaddress;

    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMainasin() {
        return mainasin;
    }

    public void setMainasin(String mainasin) {
        this.mainasin = mainasin == null ? null : mainasin.trim();
    }

    public String getRelationasin() {
        return relationasin;
    }

    public void setRelationasin(String relationasin) {
        this.relationasin = relationasin == null ? null : relationasin.trim();
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname == null ? null : shopname.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Integer getRatings() {
        return ratings;
    }

    public void setRatings(Integer ratings) {
        this.ratings = ratings;
    }

    public Integer getCustomerreviews() {
        return customerreviews;
    }

    public void setCustomerreviews(Integer customerreviews) {
        this.customerreviews = customerreviews;
    }

    public Integer getAnsweredquestions() {
        return answeredquestions;
    }

    public void setAnsweredquestions(Integer answeredquestions) {
        this.answeredquestions = answeredquestions;
    }

    public String getBigcategorytype() {
        return bigcategorytype;
    }

    public void setBigcategorytype(String bigcategorytype) {
        this.bigcategorytype = bigcategorytype == null ? null : bigcategorytype.trim();
    }

    public String getSmallcategorytype() {
        return smallcategorytype;
    }

    public void setSmallcategorytype(String smallcategorytype) {
        this.smallcategorytype = smallcategorytype == null ? null : smallcategorytype.trim();
    }

    public Integer getBigcategoryrank() {
        return bigcategoryrank;
    }

    public void setBigcategoryrank(Integer bigcategoryrank) {
        this.bigcategoryrank = bigcategoryrank;
    }

    public Integer getSmallcategoryrank() {
        return smallcategoryrank;
    }

    public void setSmallcategoryrank(Integer smallcategoryrank) {
        this.smallcategoryrank = smallcategoryrank;
    }

    public String getBriefintro() {
        return briefintro;
    }

    public void setBriefintro(String briefintro) {
        this.briefintro = briefintro == null ? null : briefintro.trim();
    }

    public Date getGetdate() {
        return getdate;
    }

    public void setGetdate(Date getdate) {
        this.getdate = getdate;
    }

    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress == null ? null : macaddress.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }
}