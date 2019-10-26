package com.mujia.amazon_mj.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerReviewExample() {
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

        public Criteria andStar1IsNull() {
            addCriterion("Star1 is null");
            return (Criteria) this;
        }

        public Criteria andStar1IsNotNull() {
            addCriterion("Star1 is not null");
            return (Criteria) this;
        }

        public Criteria andStar1EqualTo(Integer value) {
            addCriterion("Star1 =", value, "star1");
            return (Criteria) this;
        }

        public Criteria andStar1NotEqualTo(Integer value) {
            addCriterion("Star1 <>", value, "star1");
            return (Criteria) this;
        }

        public Criteria andStar1GreaterThan(Integer value) {
            addCriterion("Star1 >", value, "star1");
            return (Criteria) this;
        }

        public Criteria andStar1GreaterThanOrEqualTo(Integer value) {
            addCriterion("Star1 >=", value, "star1");
            return (Criteria) this;
        }

        public Criteria andStar1LessThan(Integer value) {
            addCriterion("Star1 <", value, "star1");
            return (Criteria) this;
        }

        public Criteria andStar1LessThanOrEqualTo(Integer value) {
            addCriterion("Star1 <=", value, "star1");
            return (Criteria) this;
        }

        public Criteria andStar1In(List<Integer> values) {
            addCriterion("Star1 in", values, "star1");
            return (Criteria) this;
        }

        public Criteria andStar1NotIn(List<Integer> values) {
            addCriterion("Star1 not in", values, "star1");
            return (Criteria) this;
        }

        public Criteria andStar1Between(Integer value1, Integer value2) {
            addCriterion("Star1 between", value1, value2, "star1");
            return (Criteria) this;
        }

        public Criteria andStar1NotBetween(Integer value1, Integer value2) {
            addCriterion("Star1 not between", value1, value2, "star1");
            return (Criteria) this;
        }

        public Criteria andStar2IsNull() {
            addCriterion("Star2 is null");
            return (Criteria) this;
        }

        public Criteria andStar2IsNotNull() {
            addCriterion("Star2 is not null");
            return (Criteria) this;
        }

        public Criteria andStar2EqualTo(Integer value) {
            addCriterion("Star2 =", value, "star2");
            return (Criteria) this;
        }

        public Criteria andStar2NotEqualTo(Integer value) {
            addCriterion("Star2 <>", value, "star2");
            return (Criteria) this;
        }

        public Criteria andStar2GreaterThan(Integer value) {
            addCriterion("Star2 >", value, "star2");
            return (Criteria) this;
        }

        public Criteria andStar2GreaterThanOrEqualTo(Integer value) {
            addCriterion("Star2 >=", value, "star2");
            return (Criteria) this;
        }

        public Criteria andStar2LessThan(Integer value) {
            addCriterion("Star2 <", value, "star2");
            return (Criteria) this;
        }

        public Criteria andStar2LessThanOrEqualTo(Integer value) {
            addCriterion("Star2 <=", value, "star2");
            return (Criteria) this;
        }

        public Criteria andStar2In(List<Integer> values) {
            addCriterion("Star2 in", values, "star2");
            return (Criteria) this;
        }

        public Criteria andStar2NotIn(List<Integer> values) {
            addCriterion("Star2 not in", values, "star2");
            return (Criteria) this;
        }

        public Criteria andStar2Between(Integer value1, Integer value2) {
            addCriterion("Star2 between", value1, value2, "star2");
            return (Criteria) this;
        }

        public Criteria andStar2NotBetween(Integer value1, Integer value2) {
            addCriterion("Star2 not between", value1, value2, "star2");
            return (Criteria) this;
        }

        public Criteria andStar3IsNull() {
            addCriterion("Star3 is null");
            return (Criteria) this;
        }

        public Criteria andStar3IsNotNull() {
            addCriterion("Star3 is not null");
            return (Criteria) this;
        }

        public Criteria andStar3EqualTo(Integer value) {
            addCriterion("Star3 =", value, "star3");
            return (Criteria) this;
        }

        public Criteria andStar3NotEqualTo(Integer value) {
            addCriterion("Star3 <>", value, "star3");
            return (Criteria) this;
        }

        public Criteria andStar3GreaterThan(Integer value) {
            addCriterion("Star3 >", value, "star3");
            return (Criteria) this;
        }

        public Criteria andStar3GreaterThanOrEqualTo(Integer value) {
            addCriterion("Star3 >=", value, "star3");
            return (Criteria) this;
        }

        public Criteria andStar3LessThan(Integer value) {
            addCriterion("Star3 <", value, "star3");
            return (Criteria) this;
        }

        public Criteria andStar3LessThanOrEqualTo(Integer value) {
            addCriterion("Star3 <=", value, "star3");
            return (Criteria) this;
        }

        public Criteria andStar3In(List<Integer> values) {
            addCriterion("Star3 in", values, "star3");
            return (Criteria) this;
        }

        public Criteria andStar3NotIn(List<Integer> values) {
            addCriterion("Star3 not in", values, "star3");
            return (Criteria) this;
        }

        public Criteria andStar3Between(Integer value1, Integer value2) {
            addCriterion("Star3 between", value1, value2, "star3");
            return (Criteria) this;
        }

        public Criteria andStar3NotBetween(Integer value1, Integer value2) {
            addCriterion("Star3 not between", value1, value2, "star3");
            return (Criteria) this;
        }

        public Criteria andStar4IsNull() {
            addCriterion("Star4 is null");
            return (Criteria) this;
        }

        public Criteria andStar4IsNotNull() {
            addCriterion("Star4 is not null");
            return (Criteria) this;
        }

        public Criteria andStar4EqualTo(Integer value) {
            addCriterion("Star4 =", value, "star4");
            return (Criteria) this;
        }

        public Criteria andStar4NotEqualTo(Integer value) {
            addCriterion("Star4 <>", value, "star4");
            return (Criteria) this;
        }

        public Criteria andStar4GreaterThan(Integer value) {
            addCriterion("Star4 >", value, "star4");
            return (Criteria) this;
        }

        public Criteria andStar4GreaterThanOrEqualTo(Integer value) {
            addCriterion("Star4 >=", value, "star4");
            return (Criteria) this;
        }

        public Criteria andStar4LessThan(Integer value) {
            addCriterion("Star4 <", value, "star4");
            return (Criteria) this;
        }

        public Criteria andStar4LessThanOrEqualTo(Integer value) {
            addCriterion("Star4 <=", value, "star4");
            return (Criteria) this;
        }

        public Criteria andStar4In(List<Integer> values) {
            addCriterion("Star4 in", values, "star4");
            return (Criteria) this;
        }

        public Criteria andStar4NotIn(List<Integer> values) {
            addCriterion("Star4 not in", values, "star4");
            return (Criteria) this;
        }

        public Criteria andStar4Between(Integer value1, Integer value2) {
            addCriterion("Star4 between", value1, value2, "star4");
            return (Criteria) this;
        }

        public Criteria andStar4NotBetween(Integer value1, Integer value2) {
            addCriterion("Star4 not between", value1, value2, "star4");
            return (Criteria) this;
        }

        public Criteria andStar5IsNull() {
            addCriterion("Star5 is null");
            return (Criteria) this;
        }

        public Criteria andStar5IsNotNull() {
            addCriterion("Star5 is not null");
            return (Criteria) this;
        }

        public Criteria andStar5EqualTo(Integer value) {
            addCriterion("Star5 =", value, "star5");
            return (Criteria) this;
        }

        public Criteria andStar5NotEqualTo(Integer value) {
            addCriterion("Star5 <>", value, "star5");
            return (Criteria) this;
        }

        public Criteria andStar5GreaterThan(Integer value) {
            addCriterion("Star5 >", value, "star5");
            return (Criteria) this;
        }

        public Criteria andStar5GreaterThanOrEqualTo(Integer value) {
            addCriterion("Star5 >=", value, "star5");
            return (Criteria) this;
        }

        public Criteria andStar5LessThan(Integer value) {
            addCriterion("Star5 <", value, "star5");
            return (Criteria) this;
        }

        public Criteria andStar5LessThanOrEqualTo(Integer value) {
            addCriterion("Star5 <=", value, "star5");
            return (Criteria) this;
        }

        public Criteria andStar5In(List<Integer> values) {
            addCriterion("Star5 in", values, "star5");
            return (Criteria) this;
        }

        public Criteria andStar5NotIn(List<Integer> values) {
            addCriterion("Star5 not in", values, "star5");
            return (Criteria) this;
        }

        public Criteria andStar5Between(Integer value1, Integer value2) {
            addCriterion("Star5 between", value1, value2, "star5");
            return (Criteria) this;
        }

        public Criteria andStar5NotBetween(Integer value1, Integer value2) {
            addCriterion("Star5 not between", value1, value2, "star5");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createdate");
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