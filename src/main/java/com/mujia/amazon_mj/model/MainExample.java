package com.mujia.amazon_mj.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MainExample() {
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

        public Criteria andRelationasinIsNull() {
            addCriterion("RelationASIN is null");
            return (Criteria) this;
        }

        public Criteria andRelationasinIsNotNull() {
            addCriterion("RelationASIN is not null");
            return (Criteria) this;
        }

        public Criteria andRelationasinEqualTo(String value) {
            addCriterion("RelationASIN =", value, "relationasin");
            return (Criteria) this;
        }

        public Criteria andRelationasinNotEqualTo(String value) {
            addCriterion("RelationASIN <>", value, "relationasin");
            return (Criteria) this;
        }

        public Criteria andRelationasinGreaterThan(String value) {
            addCriterion("RelationASIN >", value, "relationasin");
            return (Criteria) this;
        }

        public Criteria andRelationasinGreaterThanOrEqualTo(String value) {
            addCriterion("RelationASIN >=", value, "relationasin");
            return (Criteria) this;
        }

        public Criteria andRelationasinLessThan(String value) {
            addCriterion("RelationASIN <", value, "relationasin");
            return (Criteria) this;
        }

        public Criteria andRelationasinLessThanOrEqualTo(String value) {
            addCriterion("RelationASIN <=", value, "relationasin");
            return (Criteria) this;
        }

        public Criteria andRelationasinLike(String value) {
            addCriterion("RelationASIN like", value, "relationasin");
            return (Criteria) this;
        }

        public Criteria andRelationasinNotLike(String value) {
            addCriterion("RelationASIN not like", value, "relationasin");
            return (Criteria) this;
        }

        public Criteria andRelationasinIn(List<String> values) {
            addCriterion("RelationASIN in", values, "relationasin");
            return (Criteria) this;
        }

        public Criteria andRelationasinNotIn(List<String> values) {
            addCriterion("RelationASIN not in", values, "relationasin");
            return (Criteria) this;
        }

        public Criteria andRelationasinBetween(String value1, String value2) {
            addCriterion("RelationASIN between", value1, value2, "relationasin");
            return (Criteria) this;
        }

        public Criteria andRelationasinNotBetween(String value1, String value2) {
            addCriterion("RelationASIN not between", value1, value2, "relationasin");
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

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRatingsIsNull() {
            addCriterion("ratings is null");
            return (Criteria) this;
        }

        public Criteria andRatingsIsNotNull() {
            addCriterion("ratings is not null");
            return (Criteria) this;
        }

        public Criteria andRatingsEqualTo(Integer value) {
            addCriterion("ratings =", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsNotEqualTo(Integer value) {
            addCriterion("ratings <>", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsGreaterThan(Integer value) {
            addCriterion("ratings >", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ratings >=", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsLessThan(Integer value) {
            addCriterion("ratings <", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsLessThanOrEqualTo(Integer value) {
            addCriterion("ratings <=", value, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsIn(List<Integer> values) {
            addCriterion("ratings in", values, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsNotIn(List<Integer> values) {
            addCriterion("ratings not in", values, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsBetween(Integer value1, Integer value2) {
            addCriterion("ratings between", value1, value2, "ratings");
            return (Criteria) this;
        }

        public Criteria andRatingsNotBetween(Integer value1, Integer value2) {
            addCriterion("ratings not between", value1, value2, "ratings");
            return (Criteria) this;
        }

        public Criteria andCustomerreviewsIsNull() {
            addCriterion("CustomerReviews is null");
            return (Criteria) this;
        }

        public Criteria andCustomerreviewsIsNotNull() {
            addCriterion("CustomerReviews is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerreviewsEqualTo(Integer value) {
            addCriterion("CustomerReviews =", value, "customerreviews");
            return (Criteria) this;
        }

        public Criteria andCustomerreviewsNotEqualTo(Integer value) {
            addCriterion("CustomerReviews <>", value, "customerreviews");
            return (Criteria) this;
        }

        public Criteria andCustomerreviewsGreaterThan(Integer value) {
            addCriterion("CustomerReviews >", value, "customerreviews");
            return (Criteria) this;
        }

        public Criteria andCustomerreviewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("CustomerReviews >=", value, "customerreviews");
            return (Criteria) this;
        }

        public Criteria andCustomerreviewsLessThan(Integer value) {
            addCriterion("CustomerReviews <", value, "customerreviews");
            return (Criteria) this;
        }

        public Criteria andCustomerreviewsLessThanOrEqualTo(Integer value) {
            addCriterion("CustomerReviews <=", value, "customerreviews");
            return (Criteria) this;
        }

        public Criteria andCustomerreviewsIn(List<Integer> values) {
            addCriterion("CustomerReviews in", values, "customerreviews");
            return (Criteria) this;
        }

        public Criteria andCustomerreviewsNotIn(List<Integer> values) {
            addCriterion("CustomerReviews not in", values, "customerreviews");
            return (Criteria) this;
        }

        public Criteria andCustomerreviewsBetween(Integer value1, Integer value2) {
            addCriterion("CustomerReviews between", value1, value2, "customerreviews");
            return (Criteria) this;
        }

        public Criteria andCustomerreviewsNotBetween(Integer value1, Integer value2) {
            addCriterion("CustomerReviews not between", value1, value2, "customerreviews");
            return (Criteria) this;
        }

        public Criteria andAnsweredquestionsIsNull() {
            addCriterion("AnsweredQuestions is null");
            return (Criteria) this;
        }

        public Criteria andAnsweredquestionsIsNotNull() {
            addCriterion("AnsweredQuestions is not null");
            return (Criteria) this;
        }

        public Criteria andAnsweredquestionsEqualTo(Integer value) {
            addCriterion("AnsweredQuestions =", value, "answeredquestions");
            return (Criteria) this;
        }

        public Criteria andAnsweredquestionsNotEqualTo(Integer value) {
            addCriterion("AnsweredQuestions <>", value, "answeredquestions");
            return (Criteria) this;
        }

        public Criteria andAnsweredquestionsGreaterThan(Integer value) {
            addCriterion("AnsweredQuestions >", value, "answeredquestions");
            return (Criteria) this;
        }

        public Criteria andAnsweredquestionsGreaterThanOrEqualTo(Integer value) {
            addCriterion("AnsweredQuestions >=", value, "answeredquestions");
            return (Criteria) this;
        }

        public Criteria andAnsweredquestionsLessThan(Integer value) {
            addCriterion("AnsweredQuestions <", value, "answeredquestions");
            return (Criteria) this;
        }

        public Criteria andAnsweredquestionsLessThanOrEqualTo(Integer value) {
            addCriterion("AnsweredQuestions <=", value, "answeredquestions");
            return (Criteria) this;
        }

        public Criteria andAnsweredquestionsIn(List<Integer> values) {
            addCriterion("AnsweredQuestions in", values, "answeredquestions");
            return (Criteria) this;
        }

        public Criteria andAnsweredquestionsNotIn(List<Integer> values) {
            addCriterion("AnsweredQuestions not in", values, "answeredquestions");
            return (Criteria) this;
        }

        public Criteria andAnsweredquestionsBetween(Integer value1, Integer value2) {
            addCriterion("AnsweredQuestions between", value1, value2, "answeredquestions");
            return (Criteria) this;
        }

        public Criteria andAnsweredquestionsNotBetween(Integer value1, Integer value2) {
            addCriterion("AnsweredQuestions not between", value1, value2, "answeredquestions");
            return (Criteria) this;
        }

        public Criteria andBigcategorytypeIsNull() {
            addCriterion("BigCategoryType is null");
            return (Criteria) this;
        }

        public Criteria andBigcategorytypeIsNotNull() {
            addCriterion("BigCategoryType is not null");
            return (Criteria) this;
        }

        public Criteria andBigcategorytypeEqualTo(String value) {
            addCriterion("BigCategoryType =", value, "bigcategorytype");
            return (Criteria) this;
        }

        public Criteria andBigcategorytypeNotEqualTo(String value) {
            addCriterion("BigCategoryType <>", value, "bigcategorytype");
            return (Criteria) this;
        }

        public Criteria andBigcategorytypeGreaterThan(String value) {
            addCriterion("BigCategoryType >", value, "bigcategorytype");
            return (Criteria) this;
        }

        public Criteria andBigcategorytypeGreaterThanOrEqualTo(String value) {
            addCriterion("BigCategoryType >=", value, "bigcategorytype");
            return (Criteria) this;
        }

        public Criteria andBigcategorytypeLessThan(String value) {
            addCriterion("BigCategoryType <", value, "bigcategorytype");
            return (Criteria) this;
        }

        public Criteria andBigcategorytypeLessThanOrEqualTo(String value) {
            addCriterion("BigCategoryType <=", value, "bigcategorytype");
            return (Criteria) this;
        }

        public Criteria andBigcategorytypeLike(String value) {
            addCriterion("BigCategoryType like", value, "bigcategorytype");
            return (Criteria) this;
        }

        public Criteria andBigcategorytypeNotLike(String value) {
            addCriterion("BigCategoryType not like", value, "bigcategorytype");
            return (Criteria) this;
        }

        public Criteria andBigcategorytypeIn(List<String> values) {
            addCriterion("BigCategoryType in", values, "bigcategorytype");
            return (Criteria) this;
        }

        public Criteria andBigcategorytypeNotIn(List<String> values) {
            addCriterion("BigCategoryType not in", values, "bigcategorytype");
            return (Criteria) this;
        }

        public Criteria andBigcategorytypeBetween(String value1, String value2) {
            addCriterion("BigCategoryType between", value1, value2, "bigcategorytype");
            return (Criteria) this;
        }

        public Criteria andBigcategorytypeNotBetween(String value1, String value2) {
            addCriterion("BigCategoryType not between", value1, value2, "bigcategorytype");
            return (Criteria) this;
        }

        public Criteria andSmallcategorytypeIsNull() {
            addCriterion("SmallCategoryType is null");
            return (Criteria) this;
        }

        public Criteria andSmallcategorytypeIsNotNull() {
            addCriterion("SmallCategoryType is not null");
            return (Criteria) this;
        }

        public Criteria andSmallcategorytypeEqualTo(String value) {
            addCriterion("SmallCategoryType =", value, "smallcategorytype");
            return (Criteria) this;
        }

        public Criteria andSmallcategorytypeNotEqualTo(String value) {
            addCriterion("SmallCategoryType <>", value, "smallcategorytype");
            return (Criteria) this;
        }

        public Criteria andSmallcategorytypeGreaterThan(String value) {
            addCriterion("SmallCategoryType >", value, "smallcategorytype");
            return (Criteria) this;
        }

        public Criteria andSmallcategorytypeGreaterThanOrEqualTo(String value) {
            addCriterion("SmallCategoryType >=", value, "smallcategorytype");
            return (Criteria) this;
        }

        public Criteria andSmallcategorytypeLessThan(String value) {
            addCriterion("SmallCategoryType <", value, "smallcategorytype");
            return (Criteria) this;
        }

        public Criteria andSmallcategorytypeLessThanOrEqualTo(String value) {
            addCriterion("SmallCategoryType <=", value, "smallcategorytype");
            return (Criteria) this;
        }

        public Criteria andSmallcategorytypeLike(String value) {
            addCriterion("SmallCategoryType like", value, "smallcategorytype");
            return (Criteria) this;
        }

        public Criteria andSmallcategorytypeNotLike(String value) {
            addCriterion("SmallCategoryType not like", value, "smallcategorytype");
            return (Criteria) this;
        }

        public Criteria andSmallcategorytypeIn(List<String> values) {
            addCriterion("SmallCategoryType in", values, "smallcategorytype");
            return (Criteria) this;
        }

        public Criteria andSmallcategorytypeNotIn(List<String> values) {
            addCriterion("SmallCategoryType not in", values, "smallcategorytype");
            return (Criteria) this;
        }

        public Criteria andSmallcategorytypeBetween(String value1, String value2) {
            addCriterion("SmallCategoryType between", value1, value2, "smallcategorytype");
            return (Criteria) this;
        }

        public Criteria andSmallcategorytypeNotBetween(String value1, String value2) {
            addCriterion("SmallCategoryType not between", value1, value2, "smallcategorytype");
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

        public Criteria andBriefintroIsNull() {
            addCriterion("BriefIntro is null");
            return (Criteria) this;
        }

        public Criteria andBriefintroIsNotNull() {
            addCriterion("BriefIntro is not null");
            return (Criteria) this;
        }

        public Criteria andBriefintroEqualTo(String value) {
            addCriterion("BriefIntro =", value, "briefintro");
            return (Criteria) this;
        }

        public Criteria andBriefintroNotEqualTo(String value) {
            addCriterion("BriefIntro <>", value, "briefintro");
            return (Criteria) this;
        }

        public Criteria andBriefintroGreaterThan(String value) {
            addCriterion("BriefIntro >", value, "briefintro");
            return (Criteria) this;
        }

        public Criteria andBriefintroGreaterThanOrEqualTo(String value) {
            addCriterion("BriefIntro >=", value, "briefintro");
            return (Criteria) this;
        }

        public Criteria andBriefintroLessThan(String value) {
            addCriterion("BriefIntro <", value, "briefintro");
            return (Criteria) this;
        }

        public Criteria andBriefintroLessThanOrEqualTo(String value) {
            addCriterion("BriefIntro <=", value, "briefintro");
            return (Criteria) this;
        }

        public Criteria andBriefintroLike(String value) {
            addCriterion("BriefIntro like", value, "briefintro");
            return (Criteria) this;
        }

        public Criteria andBriefintroNotLike(String value) {
            addCriterion("BriefIntro not like", value, "briefintro");
            return (Criteria) this;
        }

        public Criteria andBriefintroIn(List<String> values) {
            addCriterion("BriefIntro in", values, "briefintro");
            return (Criteria) this;
        }

        public Criteria andBriefintroNotIn(List<String> values) {
            addCriterion("BriefIntro not in", values, "briefintro");
            return (Criteria) this;
        }

        public Criteria andBriefintroBetween(String value1, String value2) {
            addCriterion("BriefIntro between", value1, value2, "briefintro");
            return (Criteria) this;
        }

        public Criteria andBriefintroNotBetween(String value1, String value2) {
            addCriterion("BriefIntro not between", value1, value2, "briefintro");
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