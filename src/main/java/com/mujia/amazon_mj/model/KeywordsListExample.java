package com.mujia.amazon_mj.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KeywordsListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KeywordsListExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andProductNameIsNull() {
            addCriterion("Product_Name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("Product_Name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("Product_Name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("Product_Name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("Product_Name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("Product_Name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("Product_Name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("Product_Name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("Product_Name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("Product_Name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("Product_Name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("Product_Name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("Product_Name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("Product_Name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountIsNull() {
            addCriterion("Purchase_Count is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountIsNotNull() {
            addCriterion("Purchase_Count is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountEqualTo(String value) {
            addCriterion("Purchase_Count =", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountNotEqualTo(String value) {
            addCriterion("Purchase_Count <>", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountGreaterThan(String value) {
            addCriterion("Purchase_Count >", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountGreaterThanOrEqualTo(String value) {
            addCriterion("Purchase_Count >=", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountLessThan(String value) {
            addCriterion("Purchase_Count <", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountLessThanOrEqualTo(String value) {
            addCriterion("Purchase_Count <=", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountLike(String value) {
            addCriterion("Purchase_Count like", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountNotLike(String value) {
            addCriterion("Purchase_Count not like", value, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountIn(List<String> values) {
            addCriterion("Purchase_Count in", values, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountNotIn(List<String> values) {
            addCriterion("Purchase_Count not in", values, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountBetween(String value1, String value2) {
            addCriterion("Purchase_Count between", value1, value2, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andPurchaseCountNotBetween(String value1, String value2) {
            addCriterion("Purchase_Count not between", value1, value2, "purchaseCount");
            return (Criteria) this;
        }

        public Criteria andStarLevelIsNull() {
            addCriterion("Star_Level is null");
            return (Criteria) this;
        }

        public Criteria andStarLevelIsNotNull() {
            addCriterion("Star_Level is not null");
            return (Criteria) this;
        }

        public Criteria andStarLevelEqualTo(String value) {
            addCriterion("Star_Level =", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotEqualTo(String value) {
            addCriterion("Star_Level <>", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelGreaterThan(String value) {
            addCriterion("Star_Level >", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelGreaterThanOrEqualTo(String value) {
            addCriterion("Star_Level >=", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLessThan(String value) {
            addCriterion("Star_Level <", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLessThanOrEqualTo(String value) {
            addCriterion("Star_Level <=", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelLike(String value) {
            addCriterion("Star_Level like", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotLike(String value) {
            addCriterion("Star_Level not like", value, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelIn(List<String> values) {
            addCriterion("Star_Level in", values, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotIn(List<String> values) {
            addCriterion("Star_Level not in", values, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelBetween(String value1, String value2) {
            addCriterion("Star_Level between", value1, value2, "starLevel");
            return (Criteria) this;
        }

        public Criteria andStarLevelNotBetween(String value1, String value2) {
            addCriterion("Star_Level not between", value1, value2, "starLevel");
            return (Criteria) this;
        }

        public Criteria andActualPriceIsNull() {
            addCriterion("Actual_Price is null");
            return (Criteria) this;
        }

        public Criteria andActualPriceIsNotNull() {
            addCriterion("Actual_Price is not null");
            return (Criteria) this;
        }

        public Criteria andActualPriceEqualTo(String value) {
            addCriterion("Actual_Price =", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceNotEqualTo(String value) {
            addCriterion("Actual_Price <>", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceGreaterThan(String value) {
            addCriterion("Actual_Price >", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceGreaterThanOrEqualTo(String value) {
            addCriterion("Actual_Price >=", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceLessThan(String value) {
            addCriterion("Actual_Price <", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceLessThanOrEqualTo(String value) {
            addCriterion("Actual_Price <=", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceLike(String value) {
            addCriterion("Actual_Price like", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceNotLike(String value) {
            addCriterion("Actual_Price not like", value, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceIn(List<String> values) {
            addCriterion("Actual_Price in", values, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceNotIn(List<String> values) {
            addCriterion("Actual_Price not in", values, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceBetween(String value1, String value2) {
            addCriterion("Actual_Price between", value1, value2, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andActualPriceNotBetween(String value1, String value2) {
            addCriterion("Actual_Price not between", value1, value2, "actualPrice");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceIsNull() {
            addCriterion("Promotion_Price is null");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceIsNotNull() {
            addCriterion("Promotion_Price is not null");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceEqualTo(String value) {
            addCriterion("Promotion_Price =", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotEqualTo(String value) {
            addCriterion("Promotion_Price <>", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceGreaterThan(String value) {
            addCriterion("Promotion_Price >", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceGreaterThanOrEqualTo(String value) {
            addCriterion("Promotion_Price >=", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceLessThan(String value) {
            addCriterion("Promotion_Price <", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceLessThanOrEqualTo(String value) {
            addCriterion("Promotion_Price <=", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceLike(String value) {
            addCriterion("Promotion_Price like", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotLike(String value) {
            addCriterion("Promotion_Price not like", value, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceIn(List<String> values) {
            addCriterion("Promotion_Price in", values, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotIn(List<String> values) {
            addCriterion("Promotion_Price not in", values, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceBetween(String value1, String value2) {
            addCriterion("Promotion_Price between", value1, value2, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andPromotionPriceNotBetween(String value1, String value2) {
            addCriterion("Promotion_Price not between", value1, value2, "promotionPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceIsNull() {
            addCriterion("Voucher_Price is null");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceIsNotNull() {
            addCriterion("Voucher_Price is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceEqualTo(String value) {
            addCriterion("Voucher_Price =", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceNotEqualTo(String value) {
            addCriterion("Voucher_Price <>", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceGreaterThan(String value) {
            addCriterion("Voucher_Price >", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceGreaterThanOrEqualTo(String value) {
            addCriterion("Voucher_Price >=", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceLessThan(String value) {
            addCriterion("Voucher_Price <", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceLessThanOrEqualTo(String value) {
            addCriterion("Voucher_Price <=", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceLike(String value) {
            addCriterion("Voucher_Price like", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceNotLike(String value) {
            addCriterion("Voucher_Price not like", value, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceIn(List<String> values) {
            addCriterion("Voucher_Price in", values, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceNotIn(List<String> values) {
            addCriterion("Voucher_Price not in", values, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceBetween(String value1, String value2) {
            addCriterion("Voucher_Price between", value1, value2, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andVoucherPriceNotBetween(String value1, String value2) {
            addCriterion("Voucher_Price not between", value1, value2, "voucherPrice");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryIsNull() {
            addCriterion("Current_Inventory is null");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryIsNotNull() {
            addCriterion("Current_Inventory is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryEqualTo(Integer value) {
            addCriterion("Current_Inventory =", value, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryNotEqualTo(Integer value) {
            addCriterion("Current_Inventory <>", value, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryGreaterThan(Integer value) {
            addCriterion("Current_Inventory >", value, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("Current_Inventory >=", value, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryLessThan(Integer value) {
            addCriterion("Current_Inventory <", value, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("Current_Inventory <=", value, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryIn(List<Integer> values) {
            addCriterion("Current_Inventory in", values, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryNotIn(List<Integer> values) {
            addCriterion("Current_Inventory not in", values, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryBetween(Integer value1, Integer value2) {
            addCriterion("Current_Inventory between", value1, value2, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andCurrentInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("Current_Inventory not between", value1, value2, "currentInventory");
            return (Criteria) this;
        }

        public Criteria andInventoryWarningIsNull() {
            addCriterion("Inventory_Warning is null");
            return (Criteria) this;
        }

        public Criteria andInventoryWarningIsNotNull() {
            addCriterion("Inventory_Warning is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryWarningEqualTo(Integer value) {
            addCriterion("Inventory_Warning =", value, "inventoryWarning");
            return (Criteria) this;
        }

        public Criteria andInventoryWarningNotEqualTo(Integer value) {
            addCriterion("Inventory_Warning <>", value, "inventoryWarning");
            return (Criteria) this;
        }

        public Criteria andInventoryWarningGreaterThan(Integer value) {
            addCriterion("Inventory_Warning >", value, "inventoryWarning");
            return (Criteria) this;
        }

        public Criteria andInventoryWarningGreaterThanOrEqualTo(Integer value) {
            addCriterion("Inventory_Warning >=", value, "inventoryWarning");
            return (Criteria) this;
        }

        public Criteria andInventoryWarningLessThan(Integer value) {
            addCriterion("Inventory_Warning <", value, "inventoryWarning");
            return (Criteria) this;
        }

        public Criteria andInventoryWarningLessThanOrEqualTo(Integer value) {
            addCriterion("Inventory_Warning <=", value, "inventoryWarning");
            return (Criteria) this;
        }

        public Criteria andInventoryWarningIn(List<Integer> values) {
            addCriterion("Inventory_Warning in", values, "inventoryWarning");
            return (Criteria) this;
        }

        public Criteria andInventoryWarningNotIn(List<Integer> values) {
            addCriterion("Inventory_Warning not in", values, "inventoryWarning");
            return (Criteria) this;
        }

        public Criteria andInventoryWarningBetween(Integer value1, Integer value2) {
            addCriterion("Inventory_Warning between", value1, value2, "inventoryWarning");
            return (Criteria) this;
        }

        public Criteria andInventoryWarningNotBetween(Integer value1, Integer value2) {
            addCriterion("Inventory_Warning not between", value1, value2, "inventoryWarning");
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