package com.mbp.entity;

import java.io.Serializable;

public class ActivityReduce implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_reduce.activity_reduce_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer activityReduceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_reduce.activity_name
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private String activityName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_reduce.activity_type
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer activityType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_reduce.full_money
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer fullMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_reduce.reduce_money
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer reduceMoney;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_reduce.delete_flag
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer deleteFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_reduce.start_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private String startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_reduce.end_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private String endTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table activity_reduce
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_reduce.activity_reduce_id
     *
     * @return the value of activity_reduce.activity_reduce_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getActivityReduceId() {
        return activityReduceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_reduce.activity_reduce_id
     *
     * @param activityReduceId the value for activity_reduce.activity_reduce_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setActivityReduceId(Integer activityReduceId) {
        this.activityReduceId = activityReduceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_reduce.activity_name
     *
     * @return the value of activity_reduce.activity_name
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_reduce.activity_name
     *
     * @param activityName the value for activity_reduce.activity_name
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_reduce.activity_type
     *
     * @return the value of activity_reduce.activity_type
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getActivityType() {
        return activityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_reduce.activity_type
     *
     * @param activityType the value for activity_reduce.activity_type
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_reduce.full_money
     *
     * @return the value of activity_reduce.full_money
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getFullMoney() {
        return fullMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_reduce.full_money
     *
     * @param fullMoney the value for activity_reduce.full_money
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setFullMoney(Integer fullMoney) {
        this.fullMoney = fullMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_reduce.reduce_money
     *
     * @return the value of activity_reduce.reduce_money
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getReduceMoney() {
        return reduceMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_reduce.reduce_money
     *
     * @param reduceMoney the value for activity_reduce.reduce_money
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setReduceMoney(Integer reduceMoney) {
        this.reduceMoney = reduceMoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_reduce.delete_flag
     *
     * @return the value of activity_reduce.delete_flag
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_reduce.delete_flag
     *
     * @param deleteFlag the value for activity_reduce.delete_flag
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_reduce.start_time
     *
     * @return the value of activity_reduce.start_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_reduce.start_time
     *
     * @param startTime the value for activity_reduce.start_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_reduce.end_time
     *
     * @return the value of activity_reduce.end_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_reduce.end_time
     *
     * @param endTime the value for activity_reduce.end_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }
}