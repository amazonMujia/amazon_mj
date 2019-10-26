package com.mujia.amazon_mj.model;

import java.math.BigDecimal;
import java.util.Date;

public class Spec {
    private String asin;

    private Integer mainasinid;

    private String mainasin;

    private String shopname;

    private String country;

    private String size;

    private String color;

    private BigDecimal price;

    private BigDecimal dealprice;

    private BigDecimal shippingfee;

    private Integer shortage;

    private String mainimage;

    private Date getdate;

    private Integer isamazonchoice;

    private String amazonchoicekeyword;

    private Integer promotionnum;

    private String promotiondetails;

    private Integer bigcategoryrank;

    private Integer smallcategoryrank;

    private String pageDescription;

    private String pageTitle;

    private String pageKeywords;

    private String macaddress;

    private String username;

    public String getAsin() {
        return asin;
    }

    public void setAsin(String asin) {
        this.asin = asin == null ? null : asin.trim();
    }

    public Integer getMainasinid() {
        return mainasinid;
    }

    public void setMainasinid(Integer mainasinid) {
        this.mainasinid = mainasinid;
    }

    public String getMainasin() {
        return mainasin;
    }

    public void setMainasin(String mainasin) {
        this.mainasin = mainasin == null ? null : mainasin.trim();
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDealprice() {
        return dealprice;
    }

    public void setDealprice(BigDecimal dealprice) {
        this.dealprice = dealprice;
    }

    public BigDecimal getShippingfee() {
        return shippingfee;
    }

    public void setShippingfee(BigDecimal shippingfee) {
        this.shippingfee = shippingfee;
    }

    public Integer getShortage() {
        return shortage;
    }

    public void setShortage(Integer shortage) {
        this.shortage = shortage;
    }

    public String getMainimage() {
        return mainimage;
    }

    public void setMainimage(String mainimage) {
        this.mainimage = mainimage == null ? null : mainimage.trim();
    }

    public Date getGetdate() {
        return getdate;
    }

    public void setGetdate(Date getdate) {
        this.getdate = getdate;
    }

    public Integer getIsamazonchoice() {
        return isamazonchoice;
    }

    public void setIsamazonchoice(Integer isamazonchoice) {
        this.isamazonchoice = isamazonchoice;
    }

    public String getAmazonchoicekeyword() {
        return amazonchoicekeyword;
    }

    public void setAmazonchoicekeyword(String amazonchoicekeyword) {
        this.amazonchoicekeyword = amazonchoicekeyword == null ? null : amazonchoicekeyword.trim();
    }

    public Integer getPromotionnum() {
        return promotionnum;
    }

    public void setPromotionnum(Integer promotionnum) {
        this.promotionnum = promotionnum;
    }

    public String getPromotiondetails() {
        return promotiondetails;
    }

    public void setPromotiondetails(String promotiondetails) {
        this.promotiondetails = promotiondetails == null ? null : promotiondetails.trim();
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

    public String getPageDescription() {
        return pageDescription;
    }

    public void setPageDescription(String pageDescription) {
        this.pageDescription = pageDescription == null ? null : pageDescription.trim();
    }

    public String getPageTitle() {
        return pageTitle;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle == null ? null : pageTitle.trim();
    }

    public String getPageKeywords() {
        return pageKeywords;
    }

    public void setPageKeywords(String pageKeywords) {
        this.pageKeywords = pageKeywords == null ? null : pageKeywords.trim();
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