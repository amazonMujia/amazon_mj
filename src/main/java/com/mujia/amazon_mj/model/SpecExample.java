package com.mujia.amazon_mj.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SpecExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAsinIsNull() {
            addCriterion("ASIN is null");
            return (Criteria) this;
        }

        public Criteria andAsinIsNotNull() {
            addCriterion("ASIN is not null");
            return (Criteria) this;
        }

        public Criteria andAsinEqualTo(String value) {
            addCriterion("ASIN =", value, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinNotEqualTo(String value) {
            addCriterion("ASIN <>", value, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinGreaterThan(String value) {
            addCriterion("ASIN >", value, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinGreaterThanOrEqualTo(String value) {
            addCriterion("ASIN >=", value, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinLessThan(String value) {
            addCriterion("ASIN <", value, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinLessThanOrEqualTo(String value) {
            addCriterion("ASIN <=", value, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinLike(String value) {
            addCriterion("ASIN like", value, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinNotLike(String value) {
            addCriterion("ASIN not like", value, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinIn(List<String> values) {
            addCriterion("ASIN in", values, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinNotIn(List<String> values) {
            addCriterion("ASIN not in", values, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinBetween(String value1, String value2) {
            addCriterion("ASIN between", value1, value2, "asin");
            return (Criteria) this;
        }

        public Criteria andAsinNotBetween(String value1, String value2) {
            addCriterion("ASIN not between", value1, value2, "asin");
            return (Criteria) this;
        }

        public Criteria andMainasinidIsNull() {
            addCriterion("MainAsinId is null");
            return (Criteria) this;
        }

        public Criteria andMainasinidIsNotNull() {
            addCriterion("MainAsinId is not null");
            return (Criteria) this;
        }

        public Criteria andMainasinidEqualTo(Integer value) {
            addCriterion("MainAsinId =", value, "mainasinid");
            return (Criteria) this;
        }

        public Criteria andMainasinidNotEqualTo(Integer value) {
            addCriterion("MainAsinId <>", value, "mainasinid");
            return (Criteria) this;
        }

        public Criteria andMainasinidGreaterThan(Integer value) {
            addCriterion("MainAsinId >", value, "mainasinid");
            return (Criteria) this;
        }

        public Criteria andMainasinidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MainAsinId >=", value, "mainasinid");
            return (Criteria) this;
        }

        public Criteria andMainasinidLessThan(Integer value) {
            addCriterion("MainAsinId <", value, "mainasinid");
            return (Criteria) this;
        }

        public Criteria andMainasinidLessThanOrEqualTo(Integer value) {
            addCriterion("MainAsinId <=", value, "mainasinid");
            return (Criteria) this;
        }

        public Criteria andMainasinidIn(List<Integer> values) {
            addCriterion("MainAsinId in", values, "mainasinid");
            return (Criteria) this;
        }

        public Criteria andMainasinidNotIn(List<Integer> values) {
            addCriterion("MainAsinId not in", values, "mainasinid");
            return (Criteria) this;
        }

        public Criteria andMainasinidBetween(Integer value1, Integer value2) {
            addCriterion("MainAsinId between", value1, value2, "mainasinid");
            return (Criteria) this;
        }

        public Criteria andMainasinidNotBetween(Integer value1, Integer value2) {
            addCriterion("MainAsinId not between", value1, value2, "mainasinid");
            return (Criteria) this;
        }

        public Criteria andMainasinIsNull() {
            addCriterion("MainASIN is null");
            return (Criteria) this;
        }

        public Criteria andMainasinIsNotNull() {
            addCriterion("MainASIN is not null");
            return (Criteria) this;
        }

        public Criteria andMainasinEqualTo(String value) {
            addCriterion("MainASIN =", value, "mainasin");
            return (Criteria) this;
        }

        public Criteria andMainasinNotEqualTo(String value) {
            addCriterion("MainASIN <>", value, "mainasin");
            return (Criteria) this;
        }

        public Criteria andMainasinGreaterThan(String value) {
            addCriterion("MainASIN >", value, "mainasin");
            return (Criteria) this;
        }

        public Criteria andMainasinGreaterThanOrEqualTo(String value) {
            addCriterion("MainASIN >=", value, "mainasin");
            return (Criteria) this;
        }

        public Criteria andMainasinLessThan(String value) {
            addCriterion("MainASIN <", value, "mainasin");
            return (Criteria) this;
        }

        public Criteria andMainasinLessThanOrEqualTo(String value) {
            addCriterion("MainASIN <=", value, "mainasin");
            return (Criteria) this;
        }

        public Criteria andMainasinLike(String value) {
            addCriterion("MainASIN like", value, "mainasin");
            return (Criteria) this;
        }

        public Criteria andMainasinNotLike(String value) {
            addCriterion("MainASIN not like", value, "mainasin");
            return (Criteria) this;
        }

        public Criteria andMainasinIn(List<String> values) {
            addCriterion("MainASIN in", values, "mainasin");
            return (Criteria) this;
        }

        public Criteria andMainasinNotIn(List<String> values) {
            addCriterion("MainASIN not in", values, "mainasin");
            return (Criteria) this;
        }

        public Criteria andMainasinBetween(String value1, String value2) {
            addCriterion("MainASIN between", value1, value2, "mainasin");
            return (Criteria) this;
        }

        public Criteria andMainasinNotBetween(String value1, String value2) {
            addCriterion("MainASIN not between", value1, value2, "mainasin");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNull() {
            addCriterion("ShopName is null");
            return (Criteria) this;
        }

        public Criteria andShopnameIsNotNull() {
            addCriterion("ShopName is not null");
            return (Criteria) this;
        }

        public Criteria andShopnameEqualTo(String value) {
            addCriterion("ShopName =", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotEqualTo(String value) {
            addCriterion("ShopName <>", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThan(String value) {
            addCriterion("ShopName >", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameGreaterThanOrEqualTo(String value) {
            addCriterion("ShopName >=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThan(String value) {
            addCriterion("ShopName <", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLessThanOrEqualTo(String value) {
            addCriterion("ShopName <=", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameLike(String value) {
            addCriterion("ShopName like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotLike(String value) {
            addCriterion("ShopName not like", value, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameIn(List<String> values) {
            addCriterion("ShopName in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotIn(List<String> values) {
            addCriterion("ShopName not in", values, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameBetween(String value1, String value2) {
            addCriterion("ShopName between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andShopnameNotBetween(String value1, String value2) {
            addCriterion("ShopName not between", value1, value2, "shopname");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("Country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("Country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("Country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("Country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("Country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("Country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("Country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("Country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("Country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("Country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("Country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("Country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("Country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("Country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("Size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("Size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("Size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("Size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("Size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("Size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("Size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("Size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("Size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("Size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("Size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("Size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("Size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("Size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andColorIsNull() {
            addCriterion("Color is null");
            return (Criteria) this;
        }

        public Criteria andColorIsNotNull() {
            addCriterion("Color is not null");
            return (Criteria) this;
        }

        public Criteria andColorEqualTo(String value) {
            addCriterion("Color =", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotEqualTo(String value) {
            addCriterion("Color <>", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThan(String value) {
            addCriterion("Color >", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorGreaterThanOrEqualTo(String value) {
            addCriterion("Color >=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThan(String value) {
            addCriterion("Color <", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLessThanOrEqualTo(String value) {
            addCriterion("Color <=", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorLike(String value) {
            addCriterion("Color like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotLike(String value) {
            addCriterion("Color not like", value, "color");
            return (Criteria) this;
        }

        public Criteria andColorIn(List<String> values) {
            addCriterion("Color in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotIn(List<String> values) {
            addCriterion("Color not in", values, "color");
            return (Criteria) this;
        }

        public Criteria andColorBetween(String value1, String value2) {
            addCriterion("Color between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andColorNotBetween(String value1, String value2) {
            addCriterion("Color not between", value1, value2, "color");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andDealpriceIsNull() {
            addCriterion("DealPrice is null");
            return (Criteria) this;
        }

        public Criteria andDealpriceIsNotNull() {
            addCriterion("DealPrice is not null");
            return (Criteria) this;
        }

        public Criteria andDealpriceEqualTo(BigDecimal value) {
            addCriterion("DealPrice =", value, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceNotEqualTo(BigDecimal value) {
            addCriterion("DealPrice <>", value, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceGreaterThan(BigDecimal value) {
            addCriterion("DealPrice >", value, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DealPrice >=", value, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceLessThan(BigDecimal value) {
            addCriterion("DealPrice <", value, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DealPrice <=", value, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceIn(List<BigDecimal> values) {
            addCriterion("DealPrice in", values, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceNotIn(List<BigDecimal> values) {
            addCriterion("DealPrice not in", values, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DealPrice between", value1, value2, "dealprice");
            return (Criteria) this;
        }

        public Criteria andDealpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DealPrice not between", value1, value2, "dealprice");
            return (Criteria) this;
        }

        public Criteria andShippingfeeIsNull() {
            addCriterion("ShippingFee is null");
            return (Criteria) this;
        }

        public Criteria andShippingfeeIsNotNull() {
            addCriterion("ShippingFee is not null");
            return (Criteria) this;
        }

        public Criteria andShippingfeeEqualTo(BigDecimal value) {
            addCriterion("ShippingFee =", value, "shippingfee");
            return (Criteria) this;
        }

        public Criteria andShippingfeeNotEqualTo(BigDecimal value) {
            addCriterion("ShippingFee <>", value, "shippingfee");
            return (Criteria) this;
        }

        public Criteria andShippingfeeGreaterThan(BigDecimal value) {
            addCriterion("ShippingFee >", value, "shippingfee");
            return (Criteria) this;
        }

        public Criteria andShippingfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ShippingFee >=", value, "shippingfee");
            return (Criteria) this;
        }

        public Criteria andShippingfeeLessThan(BigDecimal value) {
            addCriterion("ShippingFee <", value, "shippingfee");
            return (Criteria) this;
        }

        public Criteria andShippingfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ShippingFee <=", value, "shippingfee");
            return (Criteria) this;
        }

        public Criteria andShippingfeeIn(List<BigDecimal> values) {
            addCriterion("ShippingFee in", values, "shippingfee");
            return (Criteria) this;
        }

        public Criteria andShippingfeeNotIn(List<BigDecimal> values) {
            addCriterion("ShippingFee not in", values, "shippingfee");
            return (Criteria) this;
        }

        public Criteria andShippingfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShippingFee between", value1, value2, "shippingfee");
            return (Criteria) this;
        }

        public Criteria andShippingfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShippingFee not between", value1, value2, "shippingfee");
            return (Criteria) this;
        }

        public Criteria andShortageIsNull() {
            addCriterion("Shortage is null");
            return (Criteria) this;
        }

        public Criteria andShortageIsNotNull() {
            addCriterion("Shortage is not null");
            return (Criteria) this;
        }

        public Criteria andShortageEqualTo(Integer value) {
            addCriterion("Shortage =", value, "shortage");
            return (Criteria) this;
        }

        public Criteria andShortageNotEqualTo(Integer value) {
            addCriterion("Shortage <>", value, "shortage");
            return (Criteria) this;
        }

        public Criteria andShortageGreaterThan(Integer value) {
            addCriterion("Shortage >", value, "shortage");
            return (Criteria) this;
        }

        public Criteria andShortageGreaterThanOrEqualTo(Integer value) {
            addCriterion("Shortage >=", value, "shortage");
            return (Criteria) this;
        }

        public Criteria andShortageLessThan(Integer value) {
            addCriterion("Shortage <", value, "shortage");
            return (Criteria) this;
        }

        public Criteria andShortageLessThanOrEqualTo(Integer value) {
            addCriterion("Shortage <=", value, "shortage");
            return (Criteria) this;
        }

        public Criteria andShortageIn(List<Integer> values) {
            addCriterion("Shortage in", values, "shortage");
            return (Criteria) this;
        }

        public Criteria andShortageNotIn(List<Integer> values) {
            addCriterion("Shortage not in", values, "shortage");
            return (Criteria) this;
        }

        public Criteria andShortageBetween(Integer value1, Integer value2) {
            addCriterion("Shortage between", value1, value2, "shortage");
            return (Criteria) this;
        }

        public Criteria andShortageNotBetween(Integer value1, Integer value2) {
            addCriterion("Shortage not between", value1, value2, "shortage");
            return (Criteria) this;
        }

        public Criteria andMainimageIsNull() {
            addCriterion("MainImage is null");
            return (Criteria) this;
        }

        public Criteria andMainimageIsNotNull() {
            addCriterion("MainImage is not null");
            return (Criteria) this;
        }

        public Criteria andMainimageEqualTo(String value) {
            addCriterion("MainImage =", value, "mainimage");
            return (Criteria) this;
        }

        public Criteria andMainimageNotEqualTo(String value) {
            addCriterion("MainImage <>", value, "mainimage");
            return (Criteria) this;
        }

        public Criteria andMainimageGreaterThan(String value) {
            addCriterion("MainImage >", value, "mainimage");
            return (Criteria) this;
        }

        public Criteria andMainimageGreaterThanOrEqualTo(String value) {
            addCriterion("MainImage >=", value, "mainimage");
            return (Criteria) this;
        }

        public Criteria andMainimageLessThan(String value) {
            addCriterion("MainImage <", value, "mainimage");
            return (Criteria) this;
        }

        public Criteria andMainimageLessThanOrEqualTo(String value) {
            addCriterion("MainImage <=", value, "mainimage");
            return (Criteria) this;
        }

        public Criteria andMainimageLike(String value) {
            addCriterion("MainImage like", value, "mainimage");
            return (Criteria) this;
        }

        public Criteria andMainimageNotLike(String value) {
            addCriterion("MainImage not like", value, "mainimage");
            return (Criteria) this;
        }

        public Criteria andMainimageIn(List<String> values) {
            addCriterion("MainImage in", values, "mainimage");
            return (Criteria) this;
        }

        public Criteria andMainimageNotIn(List<String> values) {
            addCriterion("MainImage not in", values, "mainimage");
            return (Criteria) this;
        }

        public Criteria andMainimageBetween(String value1, String value2) {
            addCriterion("MainImage between", value1, value2, "mainimage");
            return (Criteria) this;
        }

        public Criteria andMainimageNotBetween(String value1, String value2) {
            addCriterion("MainImage not between", value1, value2, "mainimage");
            return (Criteria) this;
        }

        public Criteria andGetdateIsNull() {
            addCriterion("GetDate is null");
            return (Criteria) this;
        }

        public Criteria andGetdateIsNotNull() {
            addCriterion("GetDate is not null");
            return (Criteria) this;
        }

        public Criteria andGetdateEqualTo(Date value) {
            addCriterion("GetDate =", value, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateNotEqualTo(Date value) {
            addCriterion("GetDate <>", value, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateGreaterThan(Date value) {
            addCriterion("GetDate >", value, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateGreaterThanOrEqualTo(Date value) {
            addCriterion("GetDate >=", value, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateLessThan(Date value) {
            addCriterion("GetDate <", value, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateLessThanOrEqualTo(Date value) {
            addCriterion("GetDate <=", value, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateIn(List<Date> values) {
            addCriterion("GetDate in", values, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateNotIn(List<Date> values) {
            addCriterion("GetDate not in", values, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateBetween(Date value1, Date value2) {
            addCriterion("GetDate between", value1, value2, "getdate");
            return (Criteria) this;
        }

        public Criteria andGetdateNotBetween(Date value1, Date value2) {
            addCriterion("GetDate not between", value1, value2, "getdate");
            return (Criteria) this;
        }

        public Criteria andIsamazonchoiceIsNull() {
            addCriterion("IsAmazonChoice is null");
            return (Criteria) this;
        }

        public Criteria andIsamazonchoiceIsNotNull() {
            addCriterion("IsAmazonChoice is not null");
            return (Criteria) this;
        }

        public Criteria andIsamazonchoiceEqualTo(Integer value) {
            addCriterion("IsAmazonChoice =", value, "isamazonchoice");
            return (Criteria) this;
        }

        public Criteria andIsamazonchoiceNotEqualTo(Integer value) {
            addCriterion("IsAmazonChoice <>", value, "isamazonchoice");
            return (Criteria) this;
        }

        public Criteria andIsamazonchoiceGreaterThan(Integer value) {
            addCriterion("IsAmazonChoice >", value, "isamazonchoice");
            return (Criteria) this;
        }

        public Criteria andIsamazonchoiceGreaterThanOrEqualTo(Integer value) {
            addCriterion("IsAmazonChoice >=", value, "isamazonchoice");
            return (Criteria) this;
        }

        public Criteria andIsamazonchoiceLessThan(Integer value) {
            addCriterion("IsAmazonChoice <", value, "isamazonchoice");
            return (Criteria) this;
        }

        public Criteria andIsamazonchoiceLessThanOrEqualTo(Integer value) {
            addCriterion("IsAmazonChoice <=", value, "isamazonchoice");
            return (Criteria) this;
        }

        public Criteria andIsamazonchoiceIn(List<Integer> values) {
            addCriterion("IsAmazonChoice in", values, "isamazonchoice");
            return (Criteria) this;
        }

        public Criteria andIsamazonchoiceNotIn(List<Integer> values) {
            addCriterion("IsAmazonChoice not in", values, "isamazonchoice");
            return (Criteria) this;
        }

        public Criteria andIsamazonchoiceBetween(Integer value1, Integer value2) {
            addCriterion("IsAmazonChoice between", value1, value2, "isamazonchoice");
            return (Criteria) this;
        }

        public Criteria andIsamazonchoiceNotBetween(Integer value1, Integer value2) {
            addCriterion("IsAmazonChoice not between", value1, value2, "isamazonchoice");
            return (Criteria) this;
        }

        public Criteria andAmazonchoicekeywordIsNull() {
            addCriterion("AmazonChoiceKeyword is null");
            return (Criteria) this;
        }

        public Criteria andAmazonchoicekeywordIsNotNull() {
            addCriterion("AmazonChoiceKeyword is not null");
            return (Criteria) this;
        }

        public Criteria andAmazonchoicekeywordEqualTo(String value) {
            addCriterion("AmazonChoiceKeyword =", value, "amazonchoicekeyword");
            return (Criteria) this;
        }

        public Criteria andAmazonchoicekeywordNotEqualTo(String value) {
            addCriterion("AmazonChoiceKeyword <>", value, "amazonchoicekeyword");
            return (Criteria) this;
        }

        public Criteria andAmazonchoicekeywordGreaterThan(String value) {
            addCriterion("AmazonChoiceKeyword >", value, "amazonchoicekeyword");
            return (Criteria) this;
        }

        public Criteria andAmazonchoicekeywordGreaterThanOrEqualTo(String value) {
            addCriterion("AmazonChoiceKeyword >=", value, "amazonchoicekeyword");
            return (Criteria) this;
        }

        public Criteria andAmazonchoicekeywordLessThan(String value) {
            addCriterion("AmazonChoiceKeyword <", value, "amazonchoicekeyword");
            return (Criteria) this;
        }

        public Criteria andAmazonchoicekeywordLessThanOrEqualTo(String value) {
            addCriterion("AmazonChoiceKeyword <=", value, "amazonchoicekeyword");
            return (Criteria) this;
        }

        public Criteria andAmazonchoicekeywordLike(String value) {
            addCriterion("AmazonChoiceKeyword like", value, "amazonchoicekeyword");
            return (Criteria) this;
        }

        public Criteria andAmazonchoicekeywordNotLike(String value) {
            addCriterion("AmazonChoiceKeyword not like", value, "amazonchoicekeyword");
            return (Criteria) this;
        }

        public Criteria andAmazonchoicekeywordIn(List<String> values) {
            addCriterion("AmazonChoiceKeyword in", values, "amazonchoicekeyword");
            return (Criteria) this;
        }

        public Criteria andAmazonchoicekeywordNotIn(List<String> values) {
            addCriterion("AmazonChoiceKeyword not in", values, "amazonchoicekeyword");
            return (Criteria) this;
        }

        public Criteria andAmazonchoicekeywordBetween(String value1, String value2) {
            addCriterion("AmazonChoiceKeyword between", value1, value2, "amazonchoicekeyword");
            return (Criteria) this;
        }

        public Criteria andAmazonchoicekeywordNotBetween(String value1, String value2) {
            addCriterion("AmazonChoiceKeyword not between", value1, value2, "amazonchoicekeyword");
            return (Criteria) this;
        }

        public Criteria andPromotionnumIsNull() {
            addCriterion("PromotionNum is null");
            return (Criteria) this;
        }

        public Criteria andPromotionnumIsNotNull() {
            addCriterion("PromotionNum is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionnumEqualTo(Integer value) {
            addCriterion("PromotionNum =", value, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumNotEqualTo(Integer value) {
            addCriterion("PromotionNum <>", value, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumGreaterThan(Integer value) {
            addCriterion("PromotionNum >", value, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("PromotionNum >=", value, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumLessThan(Integer value) {
            addCriterion("PromotionNum <", value, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumLessThanOrEqualTo(Integer value) {
            addCriterion("PromotionNum <=", value, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumIn(List<Integer> values) {
            addCriterion("PromotionNum in", values, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumNotIn(List<Integer> values) {
            addCriterion("PromotionNum not in", values, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumBetween(Integer value1, Integer value2) {
            addCriterion("PromotionNum between", value1, value2, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotionnumNotBetween(Integer value1, Integer value2) {
            addCriterion("PromotionNum not between", value1, value2, "promotionnum");
            return (Criteria) this;
        }

        public Criteria andPromotiondetailsIsNull() {
            addCriterion("PromotionDetails is null");
            return (Criteria) this;
        }

        public Criteria andPromotiondetailsIsNotNull() {
            addCriterion("PromotionDetails is not null");
            return (Criteria) this;
        }

        public Criteria andPromotiondetailsEqualTo(String value) {
            addCriterion("PromotionDetails =", value, "promotiondetails");
            return (Criteria) this;
        }

        public Criteria andPromotiondetailsNotEqualTo(String value) {
            addCriterion("PromotionDetails <>", value, "promotiondetails");
            return (Criteria) this;
        }

        public Criteria andPromotiondetailsGreaterThan(String value) {
            addCriterion("PromotionDetails >", value, "promotiondetails");
            return (Criteria) this;
        }

        public Criteria andPromotiondetailsGreaterThanOrEqualTo(String value) {
            addCriterion("PromotionDetails >=", value, "promotiondetails");
            return (Criteria) this;
        }

        public Criteria andPromotiondetailsLessThan(String value) {
            addCriterion("PromotionDetails <", value, "promotiondetails");
            return (Criteria) this;
        }

        public Criteria andPromotiondetailsLessThanOrEqualTo(String value) {
            addCriterion("PromotionDetails <=", value, "promotiondetails");
            return (Criteria) this;
        }

        public Criteria andPromotiondetailsLike(String value) {
            addCriterion("PromotionDetails like", value, "promotiondetails");
            return (Criteria) this;
        }

        public Criteria andPromotiondetailsNotLike(String value) {
            addCriterion("PromotionDetails not like", value, "promotiondetails");
            return (Criteria) this;
        }

        public Criteria andPromotiondetailsIn(List<String> values) {
            addCriterion("PromotionDetails in", values, "promotiondetails");
            return (Criteria) this;
        }

        public Criteria andPromotiondetailsNotIn(List<String> values) {
            addCriterion("PromotionDetails not in", values, "promotiondetails");
            return (Criteria) this;
        }

        public Criteria andPromotiondetailsBetween(String value1, String value2) {
            addCriterion("PromotionDetails between", value1, value2, "promotiondetails");
            return (Criteria) this;
        }

        public Criteria andPromotiondetailsNotBetween(String value1, String value2) {
            addCriterion("PromotionDetails not between", value1, value2, "promotiondetails");
            return (Criteria) this;
        }

        public Criteria andBigcategoryrankIsNull() {
            addCriterion("BigCategoryRank is null");
            return (Criteria) this;
        }

        public Criteria andBigcategoryrankIsNotNull() {
            addCriterion("BigCategoryRank is not null");
            return (Criteria) this;
        }

        public Criteria andBigcategoryrankEqualTo(Integer value) {
            addCriterion("BigCategoryRank =", value, "bigcategoryrank");
            return (Criteria) this;
        }

        public Criteria andBigcategoryrankNotEqualTo(Integer value) {
            addCriterion("BigCategoryRank <>", value, "bigcategoryrank");
            return (Criteria) this;
        }

        public Criteria andBigcategoryrankGreaterThan(Integer value) {
            addCriterion("BigCategoryRank >", value, "bigcategoryrank");
            return (Criteria) this;
        }

        public Criteria andBigcategoryrankGreaterThanOrEqualTo(Integer value) {
            addCriterion("BigCategoryRank >=", value, "bigcategoryrank");
            return (Criteria) this;
        }

        public Criteria andBigcategoryrankLessThan(Integer value) {
            addCriterion("BigCategoryRank <", value, "bigcategoryrank");
            return (Criteria) this;
        }

        public Criteria andBigcategoryrankLessThanOrEqualTo(Integer value) {
            addCriterion("BigCategoryRank <=", value, "bigcategoryrank");
            return (Criteria) this;
        }

        public Criteria andBigcategoryrankIn(List<Integer> values) {
            addCriterion("BigCategoryRank in", values, "bigcategoryrank");
            return (Criteria) this;
        }

        public Criteria andBigcategoryrankNotIn(List<Integer> values) {
            addCriterion("BigCategoryRank not in", values, "bigcategoryrank");
            return (Criteria) this;
        }

        public Criteria andBigcategoryrankBetween(Integer value1, Integer value2) {
            addCriterion("BigCategoryRank between", value1, value2, "bigcategoryrank");
            return (Criteria) this;
        }

        public Criteria andBigcategoryrankNotBetween(Integer value1, Integer value2) {
            addCriterion("BigCategoryRank not between", value1, value2, "bigcategoryrank");
            return (Criteria) this;
        }

        public Criteria andSmallcategoryrankIsNull() {
            addCriterion("SmallCategoryRank is null");
            return (Criteria) this;
        }

        public Criteria andSmallcategoryrankIsNotNull() {
            addCriterion("SmallCategoryRank is not null");
            return (Criteria) this;
        }

        public Criteria andSmallcategoryrankEqualTo(Integer value) {
            addCriterion("SmallCategoryRank =", value, "smallcategoryrank");
            return (Criteria) this;
        }

        public Criteria andSmallcategoryrankNotEqualTo(Integer value) {
            addCriterion("SmallCategoryRank <>", value, "smallcategoryrank");
            return (Criteria) this;
        }

        public Criteria andSmallcategoryrankGreaterThan(Integer value) {
            addCriterion("SmallCategoryRank >", value, "smallcategoryrank");
            return (Criteria) this;
        }

        public Criteria andSmallcategoryrankGreaterThanOrEqualTo(Integer value) {
            addCriterion("SmallCategoryRank >=", value, "smallcategoryrank");
            return (Criteria) this;
        }

        public Criteria andSmallcategoryrankLessThan(Integer value) {
            addCriterion("SmallCategoryRank <", value, "smallcategoryrank");
            return (Criteria) this;
        }

        public Criteria andSmallcategoryrankLessThanOrEqualTo(Integer value) {
            addCriterion("SmallCategoryRank <=", value, "smallcategoryrank");
            return (Criteria) this;
        }

        public Criteria andSmallcategoryrankIn(List<Integer> values) {
            addCriterion("SmallCategoryRank in", values, "smallcategoryrank");
            return (Criteria) this;
        }

        public Criteria andSmallcategoryrankNotIn(List<Integer> values) {
            addCriterion("SmallCategoryRank not in", values, "smallcategoryrank");
            return (Criteria) this;
        }

        public Criteria andSmallcategoryrankBetween(Integer value1, Integer value2) {
            addCriterion("SmallCategoryRank between", value1, value2, "smallcategoryrank");
            return (Criteria) this;
        }

        public Criteria andSmallcategoryrankNotBetween(Integer value1, Integer value2) {
            addCriterion("SmallCategoryRank not between", value1, value2, "smallcategoryrank");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionIsNull() {
            addCriterion("page_description is null");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionIsNotNull() {
            addCriterion("page_description is not null");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionEqualTo(String value) {
            addCriterion("page_description =", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionNotEqualTo(String value) {
            addCriterion("page_description <>", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionGreaterThan(String value) {
            addCriterion("page_description >", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("page_description >=", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionLessThan(String value) {
            addCriterion("page_description <", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionLessThanOrEqualTo(String value) {
            addCriterion("page_description <=", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionLike(String value) {
            addCriterion("page_description like", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionNotLike(String value) {
            addCriterion("page_description not like", value, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionIn(List<String> values) {
            addCriterion("page_description in", values, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionNotIn(List<String> values) {
            addCriterion("page_description not in", values, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionBetween(String value1, String value2) {
            addCriterion("page_description between", value1, value2, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageDescriptionNotBetween(String value1, String value2) {
            addCriterion("page_description not between", value1, value2, "pageDescription");
            return (Criteria) this;
        }

        public Criteria andPageTitleIsNull() {
            addCriterion("page_title is null");
            return (Criteria) this;
        }

        public Criteria andPageTitleIsNotNull() {
            addCriterion("page_title is not null");
            return (Criteria) this;
        }

        public Criteria andPageTitleEqualTo(String value) {
            addCriterion("page_title =", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleNotEqualTo(String value) {
            addCriterion("page_title <>", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleGreaterThan(String value) {
            addCriterion("page_title >", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleGreaterThanOrEqualTo(String value) {
            addCriterion("page_title >=", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleLessThan(String value) {
            addCriterion("page_title <", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleLessThanOrEqualTo(String value) {
            addCriterion("page_title <=", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleLike(String value) {
            addCriterion("page_title like", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleNotLike(String value) {
            addCriterion("page_title not like", value, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleIn(List<String> values) {
            addCriterion("page_title in", values, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleNotIn(List<String> values) {
            addCriterion("page_title not in", values, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleBetween(String value1, String value2) {
            addCriterion("page_title between", value1, value2, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageTitleNotBetween(String value1, String value2) {
            addCriterion("page_title not between", value1, value2, "pageTitle");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsIsNull() {
            addCriterion("page_keywords is null");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsIsNotNull() {
            addCriterion("page_keywords is not null");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsEqualTo(String value) {
            addCriterion("page_keywords =", value, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsNotEqualTo(String value) {
            addCriterion("page_keywords <>", value, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsGreaterThan(String value) {
            addCriterion("page_keywords >", value, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("page_keywords >=", value, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsLessThan(String value) {
            addCriterion("page_keywords <", value, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsLessThanOrEqualTo(String value) {
            addCriterion("page_keywords <=", value, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsLike(String value) {
            addCriterion("page_keywords like", value, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsNotLike(String value) {
            addCriterion("page_keywords not like", value, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsIn(List<String> values) {
            addCriterion("page_keywords in", values, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsNotIn(List<String> values) {
            addCriterion("page_keywords not in", values, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsBetween(String value1, String value2) {
            addCriterion("page_keywords between", value1, value2, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andPageKeywordsNotBetween(String value1, String value2) {
            addCriterion("page_keywords not between", value1, value2, "pageKeywords");
            return (Criteria) this;
        }

        public Criteria andMacaddressIsNull() {
            addCriterion("MacAddress is null");
            return (Criteria) this;
        }

        public Criteria andMacaddressIsNotNull() {
            addCriterion("MacAddress is not null");
            return (Criteria) this;
        }

        public Criteria andMacaddressEqualTo(String value) {
            addCriterion("MacAddress =", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressNotEqualTo(String value) {
            addCriterion("MacAddress <>", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressGreaterThan(String value) {
            addCriterion("MacAddress >", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressGreaterThanOrEqualTo(String value) {
            addCriterion("MacAddress >=", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressLessThan(String value) {
            addCriterion("MacAddress <", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressLessThanOrEqualTo(String value) {
            addCriterion("MacAddress <=", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressLike(String value) {
            addCriterion("MacAddress like", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressNotLike(String value) {
            addCriterion("MacAddress not like", value, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressIn(List<String> values) {
            addCriterion("MacAddress in", values, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressNotIn(List<String> values) {
            addCriterion("MacAddress not in", values, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressBetween(String value1, String value2) {
            addCriterion("MacAddress between", value1, value2, "macaddress");
            return (Criteria) this;
        }

        public Criteria andMacaddressNotBetween(String value1, String value2) {
            addCriterion("MacAddress not between", value1, value2, "macaddress");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}