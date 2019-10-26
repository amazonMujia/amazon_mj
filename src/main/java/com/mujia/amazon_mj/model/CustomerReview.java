package com.mujia.amazon_mj.model;

import java.util.Date;

public class CustomerReview {
    private String asin;

    private String country;

    private Integer star1;

    private Integer star2;

    private Integer star3;

    private Integer star4;

    private Integer star5;

    private Date createdate;

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

    public Integer getStar1() {
        return star1;
    }

    public void setStar1(Integer star1) {
        this.star1 = star1;
    }

    public Integer getStar2() {
        return star2;
    }

    public void setStar2(Integer star2) {
        this.star2 = star2;
    }

    public Integer getStar3() {
        return star3;
    }

    public void setStar3(Integer star3) {
        this.star3 = star3;
    }

    public Integer getStar4() {
        return star4;
    }

    public void setStar4(Integer star4) {
        this.star4 = star4;
    }

    public Integer getStar5() {
        return star5;
    }

    public void setStar5(Integer star5) {
        this.star5 = star5;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}