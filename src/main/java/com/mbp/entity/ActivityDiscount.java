package com.mbp.entity;

import java.io.Serializable;

public class ActivityDiscount implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_discount.activity_discount_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer activityDiscountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_discount.activity_name
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private String activityName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_discount.activity_type
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer activityType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_discount.activity_discount
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer activityDiscount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_discount.start_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private String startTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_discount.end_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private String endTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_discount.delete_flag
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer deleteFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table activity_discount
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_discount.activity_discount_id
     *
     * @return the value of activity_discount.activity_discount_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getActivityDiscountId() {
        return activityDiscountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_discount.activity_discount_id
     *
     * @param activityDiscountId the value for activity_discount.activity_discount_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setActivityDiscountId(Integer activityDiscountId) {
        this.activityDiscountId = activityDiscountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_discount.activity_name
     *
     * @return the value of activity_discount.activity_name
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_discount.activity_name
     *
     * @param activityName the value for activity_discount.activity_name
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_discount.activity_type
     *
     * @return the value of activity_discount.activity_type
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getActivityType() {
        return activityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_discount.activity_type
     *
     * @param activityType the value for activity_discount.activity_type
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_discount.activity_discount
     *
     * @return the value of activity_discount.activity_discount
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getActivityDiscount() {
        return activityDiscount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_discount.activity_discount
     *
     * @param activityDiscount the value for activity_discount.activity_discount
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setActivityDiscount(Integer activityDiscount) {
        this.activityDiscount = activityDiscount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_discount.start_time
     *
     * @return the value of activity_discount.start_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_discount.start_time
     *
     * @param startTime the value for activity_discount.start_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_discount.end_time
     *
     * @return the value of activity_discount.end_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_discount.end_time
     *
     * @param endTime the value for activity_discount.end_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_discount.delete_flag
     *
     * @return the value of activity_discount.delete_flag
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_discount.delete_flag
     *
     * @param deleteFlag the value for activity_discount.delete_flag
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}