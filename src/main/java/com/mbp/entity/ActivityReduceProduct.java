package com.mbp.entity;

import java.io.Serializable;

public class ActivityReduceProduct implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_reduce_product.produc_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer producId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity_reduce_product.activity_reduce_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer activityReduceId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table activity_reduce_product
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_reduce_product.produc_id
     *
     * @return the value of activity_reduce_product.produc_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getProducId() {
        return producId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_reduce_product.produc_id
     *
     * @param producId the value for activity_reduce_product.produc_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setProducId(Integer producId) {
        this.producId = producId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity_reduce_product.activity_reduce_id
     *
     * @return the value of activity_reduce_product.activity_reduce_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getActivityReduceId() {
        return activityReduceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity_reduce_product.activity_reduce_id
     *
     * @param activityReduceId the value for activity_reduce_product.activity_reduce_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setActivityReduceId(Integer activityReduceId) {
        this.activityReduceId = activityReduceId;
    }
}