package com.mujia.amazon_mj.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("EndDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("EndDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("EndDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("EndDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("EndDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("EndDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("EndDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("EndDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("EndDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("EndDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("EndDate not between", value1, value2, "enddate");
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