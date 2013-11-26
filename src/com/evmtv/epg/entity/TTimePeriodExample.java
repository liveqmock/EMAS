package com.evmtv.epg.entity;

import java.util.ArrayList;
import java.util.List;

import com.evmtv.epg.request.BaseRequest;

public class TTimePeriodExample extends BaseRequest{
    /**
	 * @field serialVersionUID
	 * @field_type long
	 */
	private static final long serialVersionUID = 7267897062117266182L;

	/**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_time_period
     *
     * @mbggenerated Tue Nov 12 11:04:19 CST 2013
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_time_period
     *
     * @mbggenerated Tue Nov 12 11:04:19 CST 2013
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_time_period
     *
     * @mbggenerated Tue Nov 12 11:04:19 CST 2013
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_time_period
     *
     * @mbggenerated Tue Nov 12 11:04:19 CST 2013
     */
    public TTimePeriodExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_time_period
     *
     * @mbggenerated Tue Nov 12 11:04:19 CST 2013
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_time_period
     *
     * @mbggenerated Tue Nov 12 11:04:19 CST 2013
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_time_period
     *
     * @mbggenerated Tue Nov 12 11:04:19 CST 2013
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_time_period
     *
     * @mbggenerated Tue Nov 12 11:04:19 CST 2013
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_time_period
     *
     * @mbggenerated Tue Nov 12 11:04:19 CST 2013
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_time_period
     *
     * @mbggenerated Tue Nov 12 11:04:19 CST 2013
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_time_period
     *
     * @mbggenerated Tue Nov 12 11:04:19 CST 2013
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_time_period
     *
     * @mbggenerated Tue Nov 12 11:04:19 CST 2013
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_time_period
     *
     * @mbggenerated Tue Nov 12 11:04:19 CST 2013
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_time_period
     *
     * @mbggenerated Tue Nov 12 11:04:19 CST 2013
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_time_period
     *
     * @mbggenerated Tue Nov 12 11:04:19 CST 2013
     */
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFstarttimeIsNull() {
            addCriterion("FStartTime is null");
            return (Criteria) this;
        }

        public Criteria andFstarttimeIsNotNull() {
            addCriterion("FStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andFstarttimeEqualTo(String value) {
            addCriterion("FStartTime =", value, "fstarttime");
            return (Criteria) this;
        }

        public Criteria andFstarttimeNotEqualTo(String value) {
            addCriterion("FStartTime <>", value, "fstarttime");
            return (Criteria) this;
        }

        public Criteria andFstarttimeGreaterThan(String value) {
            addCriterion("FStartTime >", value, "fstarttime");
            return (Criteria) this;
        }

        public Criteria andFstarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("FStartTime >=", value, "fstarttime");
            return (Criteria) this;
        }

        public Criteria andFstarttimeLessThan(String value) {
            addCriterion("FStartTime <", value, "fstarttime");
            return (Criteria) this;
        }

        public Criteria andFstarttimeLessThanOrEqualTo(String value) {
            addCriterion("FStartTime <=", value, "fstarttime");
            return (Criteria) this;
        }

        public Criteria andFstarttimeLike(String value) {
            addCriterion("FStartTime like", value, "fstarttime");
            return (Criteria) this;
        }

        public Criteria andFstarttimeNotLike(String value) {
            addCriterion("FStartTime not like", value, "fstarttime");
            return (Criteria) this;
        }

        public Criteria andFstarttimeIn(List<String> values) {
            addCriterion("FStartTime in", values, "fstarttime");
            return (Criteria) this;
        }

        public Criteria andFstarttimeNotIn(List<String> values) {
            addCriterion("FStartTime not in", values, "fstarttime");
            return (Criteria) this;
        }

        public Criteria andFstarttimeBetween(String value1, String value2) {
            addCriterion("FStartTime between", value1, value2, "fstarttime");
            return (Criteria) this;
        }

        public Criteria andFstarttimeNotBetween(String value1, String value2) {
            addCriterion("FStartTime not between", value1, value2, "fstarttime");
            return (Criteria) this;
        }

        public Criteria andFendtimeIsNull() {
            addCriterion("FEndTime is null");
            return (Criteria) this;
        }

        public Criteria andFendtimeIsNotNull() {
            addCriterion("FEndTime is not null");
            return (Criteria) this;
        }

        public Criteria andFendtimeEqualTo(String value) {
            addCriterion("FEndTime =", value, "fendtime");
            return (Criteria) this;
        }

        public Criteria andFendtimeNotEqualTo(String value) {
            addCriterion("FEndTime <>", value, "fendtime");
            return (Criteria) this;
        }

        public Criteria andFendtimeGreaterThan(String value) {
            addCriterion("FEndTime >", value, "fendtime");
            return (Criteria) this;
        }

        public Criteria andFendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("FEndTime >=", value, "fendtime");
            return (Criteria) this;
        }

        public Criteria andFendtimeLessThan(String value) {
            addCriterion("FEndTime <", value, "fendtime");
            return (Criteria) this;
        }

        public Criteria andFendtimeLessThanOrEqualTo(String value) {
            addCriterion("FEndTime <=", value, "fendtime");
            return (Criteria) this;
        }

        public Criteria andFendtimeLike(String value) {
            addCriterion("FEndTime like", value, "fendtime");
            return (Criteria) this;
        }

        public Criteria andFendtimeNotLike(String value) {
            addCriterion("FEndTime not like", value, "fendtime");
            return (Criteria) this;
        }

        public Criteria andFendtimeIn(List<String> values) {
            addCriterion("FEndTime in", values, "fendtime");
            return (Criteria) this;
        }

        public Criteria andFendtimeNotIn(List<String> values) {
            addCriterion("FEndTime not in", values, "fendtime");
            return (Criteria) this;
        }

        public Criteria andFendtimeBetween(String value1, String value2) {
            addCriterion("FEndTime between", value1, value2, "fendtime");
            return (Criteria) this;
        }

        public Criteria andFendtimeNotBetween(String value1, String value2) {
            addCriterion("FEndTime not between", value1, value2, "fendtime");
            return (Criteria) this;
        }

        public Criteria andFadvclassidIsNull() {
            addCriterion("FAdvClassId is null");
            return (Criteria) this;
        }

        public Criteria andFadvclassidIsNotNull() {
            addCriterion("FAdvClassId is not null");
            return (Criteria) this;
        }

        public Criteria andFadvclassidEqualTo(Long value) {
            addCriterion("FAdvClassId =", value, "fadvclassid");
            return (Criteria) this;
        }

        public Criteria andFadvclassidNotEqualTo(Long value) {
            addCriterion("FAdvClassId <>", value, "fadvclassid");
            return (Criteria) this;
        }

        public Criteria andFadvclassidGreaterThan(Long value) {
            addCriterion("FAdvClassId >", value, "fadvclassid");
            return (Criteria) this;
        }

        public Criteria andFadvclassidGreaterThanOrEqualTo(Long value) {
            addCriterion("FAdvClassId >=", value, "fadvclassid");
            return (Criteria) this;
        }

        public Criteria andFadvclassidLessThan(Long value) {
            addCriterion("FAdvClassId <", value, "fadvclassid");
            return (Criteria) this;
        }

        public Criteria andFadvclassidLessThanOrEqualTo(Long value) {
            addCriterion("FAdvClassId <=", value, "fadvclassid");
            return (Criteria) this;
        }

        public Criteria andFadvclassidIn(List<Long> values) {
            addCriterion("FAdvClassId in", values, "fadvclassid");
            return (Criteria) this;
        }

        public Criteria andFadvclassidNotIn(List<Long> values) {
            addCriterion("FAdvClassId not in", values, "fadvclassid");
            return (Criteria) this;
        }

        public Criteria andFadvclassidBetween(Long value1, Long value2) {
            addCriterion("FAdvClassId between", value1, value2, "fadvclassid");
            return (Criteria) this;
        }

        public Criteria andFadvclassidNotBetween(Long value1, Long value2) {
            addCriterion("FAdvClassId not between", value1, value2, "fadvclassid");
            return (Criteria) this;
        }

        public Criteria andFbranchidIsNull() {
            addCriterion("FBranchId is null");
            return (Criteria) this;
        }

        public Criteria andFbranchidIsNotNull() {
            addCriterion("FBranchId is not null");
            return (Criteria) this;
        }

        public Criteria andFbranchidEqualTo(Long value) {
            addCriterion("FBranchId =", value, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidNotEqualTo(Long value) {
            addCriterion("FBranchId <>", value, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidGreaterThan(Long value) {
            addCriterion("FBranchId >", value, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidGreaterThanOrEqualTo(Long value) {
            addCriterion("FBranchId >=", value, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidLessThan(Long value) {
            addCriterion("FBranchId <", value, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidLessThanOrEqualTo(Long value) {
            addCriterion("FBranchId <=", value, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidIn(List<Long> values) {
            addCriterion("FBranchId in", values, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidNotIn(List<Long> values) {
            addCriterion("FBranchId not in", values, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidBetween(Long value1, Long value2) {
            addCriterion("FBranchId between", value1, value2, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFbranchidNotBetween(Long value1, Long value2) {
            addCriterion("FBranchId not between", value1, value2, "fbranchid");
            return (Criteria) this;
        }

        public Criteria andFdeletedIsNull() {
            addCriterion("FDeleted is null");
            return (Criteria) this;
        }

        public Criteria andFdeletedIsNotNull() {
            addCriterion("FDeleted is not null");
            return (Criteria) this;
        }

        public Criteria andFdeletedEqualTo(String value) {
            addCriterion("FDeleted =", value, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedNotEqualTo(String value) {
            addCriterion("FDeleted <>", value, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedGreaterThan(String value) {
            addCriterion("FDeleted >", value, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedGreaterThanOrEqualTo(String value) {
            addCriterion("FDeleted >=", value, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedLessThan(String value) {
            addCriterion("FDeleted <", value, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedLessThanOrEqualTo(String value) {
            addCriterion("FDeleted <=", value, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedLike(String value) {
            addCriterion("FDeleted like", value, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedNotLike(String value) {
            addCriterion("FDeleted not like", value, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedIn(List<String> values) {
            addCriterion("FDeleted in", values, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedNotIn(List<String> values) {
            addCriterion("FDeleted not in", values, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedBetween(String value1, String value2) {
            addCriterion("FDeleted between", value1, value2, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFdeletedNotBetween(String value1, String value2) {
            addCriterion("FDeleted not between", value1, value2, "fdeleted");
            return (Criteria) this;
        }

        public Criteria andFreleaseversionidIsNull() {
            addCriterion("FReleaseVersionId is null");
            return (Criteria) this;
        }

        public Criteria andFreleaseversionidIsNotNull() {
            addCriterion("FReleaseVersionId is not null");
            return (Criteria) this;
        }

        public Criteria andFreleaseversionidEqualTo(Long value) {
            addCriterion("FReleaseVersionId =", value, "freleaseversionid");
            return (Criteria) this;
        }

        public Criteria andFreleaseversionidNotEqualTo(Long value) {
            addCriterion("FReleaseVersionId <>", value, "freleaseversionid");
            return (Criteria) this;
        }

        public Criteria andFreleaseversionidGreaterThan(Long value) {
            addCriterion("FReleaseVersionId >", value, "freleaseversionid");
            return (Criteria) this;
        }

        public Criteria andFreleaseversionidGreaterThanOrEqualTo(Long value) {
            addCriterion("FReleaseVersionId >=", value, "freleaseversionid");
            return (Criteria) this;
        }

        public Criteria andFreleaseversionidLessThan(Long value) {
            addCriterion("FReleaseVersionId <", value, "freleaseversionid");
            return (Criteria) this;
        }

        public Criteria andFreleaseversionidLessThanOrEqualTo(Long value) {
            addCriterion("FReleaseVersionId <=", value, "freleaseversionid");
            return (Criteria) this;
        }

        public Criteria andFreleaseversionidIn(List<Long> values) {
            addCriterion("FReleaseVersionId in", values, "freleaseversionid");
            return (Criteria) this;
        }

        public Criteria andFreleaseversionidNotIn(List<Long> values) {
            addCriterion("FReleaseVersionId not in", values, "freleaseversionid");
            return (Criteria) this;
        }

        public Criteria andFreleaseversionidBetween(Long value1, Long value2) {
            addCriterion("FReleaseVersionId between", value1, value2, "freleaseversionid");
            return (Criteria) this;
        }

        public Criteria andFreleaseversionidNotBetween(Long value1, Long value2) {
            addCriterion("FReleaseVersionId not between", value1, value2, "freleaseversionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidIsNull() {
            addCriterion("FPositionId is null");
            return (Criteria) this;
        }

        public Criteria andFpositionidIsNotNull() {
            addCriterion("FPositionId is not null");
            return (Criteria) this;
        }

        public Criteria andFpositionidEqualTo(Integer value) {
            addCriterion("FPositionId =", value, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidNotEqualTo(Integer value) {
            addCriterion("FPositionId <>", value, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidGreaterThan(Integer value) {
            addCriterion("FPositionId >", value, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("FPositionId >=", value, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidLessThan(Integer value) {
            addCriterion("FPositionId <", value, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidLessThanOrEqualTo(Integer value) {
            addCriterion("FPositionId <=", value, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidIn(List<Integer> values) {
            addCriterion("FPositionId in", values, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidNotIn(List<Integer> values) {
            addCriterion("FPositionId not in", values, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidBetween(Integer value1, Integer value2) {
            addCriterion("FPositionId between", value1, value2, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFpositionidNotBetween(Integer value1, Integer value2) {
            addCriterion("FPositionId not between", value1, value2, "fpositionid");
            return (Criteria) this;
        }

        public Criteria andFversionadvidIsNull() {
            addCriterion("FVersionAdvId is null");
            return (Criteria) this;
        }

        public Criteria andFversionadvidIsNotNull() {
            addCriterion("FVersionAdvId is not null");
            return (Criteria) this;
        }

        public Criteria andFversionadvidEqualTo(Long value) {
            addCriterion("FVersionAdvId =", value, "fversionadvid");
            return (Criteria) this;
        }

        public Criteria andFversionadvidNotEqualTo(Long value) {
            addCriterion("FVersionAdvId <>", value, "fversionadvid");
            return (Criteria) this;
        }

        public Criteria andFversionadvidGreaterThan(Long value) {
            addCriterion("FVersionAdvId >", value, "fversionadvid");
            return (Criteria) this;
        }

        public Criteria andFversionadvidGreaterThanOrEqualTo(Long value) {
            addCriterion("FVersionAdvId >=", value, "fversionadvid");
            return (Criteria) this;
        }

        public Criteria andFversionadvidLessThan(Long value) {
            addCriterion("FVersionAdvId <", value, "fversionadvid");
            return (Criteria) this;
        }

        public Criteria andFversionadvidLessThanOrEqualTo(Long value) {
            addCriterion("FVersionAdvId <=", value, "fversionadvid");
            return (Criteria) this;
        }

        public Criteria andFversionadvidIn(List<Long> values) {
            addCriterion("FVersionAdvId in", values, "fversionadvid");
            return (Criteria) this;
        }

        public Criteria andFversionadvidNotIn(List<Long> values) {
            addCriterion("FVersionAdvId not in", values, "fversionadvid");
            return (Criteria) this;
        }

        public Criteria andFversionadvidBetween(Long value1, Long value2) {
            addCriterion("FVersionAdvId between", value1, value2, "fversionadvid");
            return (Criteria) this;
        }

        public Criteria andFversionadvidNotBetween(Long value1, Long value2) {
            addCriterion("FVersionAdvId not between", value1, value2, "fversionadvid");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_time_period
     *
     * @mbggenerated do_not_delete_during_merge Tue Nov 12 11:04:19 CST 2013
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_time_period
     *
     * @mbggenerated Tue Nov 12 11:04:19 CST 2013
     */
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
            this.condition = "t_time_period."+condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = "t_time_period."+condition;
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
            this.condition = "t_time_period."+condition;
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