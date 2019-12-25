package com.mbp.entity;

import java.io.Serializable;
import java.util.Date;

public class OrderShopCart implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shop_cart.order_number
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private String orderNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shop_cart.shop_cart_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer shopCartId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shop_cart.evaluate
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private String evaluate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_shop_cart.create_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table order_shop_cart
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shop_cart.order_number
     *
     * @return the value of order_shop_cart.order_number
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public String getOrderNumber() {
        return orderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shop_cart.order_number
     *
     * @param orderNumber the value for order_shop_cart.order_number
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber == null ? null : orderNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shop_cart.shop_cart_id
     *
     * @return the value of order_shop_cart.shop_cart_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getShopCartId() {
        return shopCartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shop_cart.shop_cart_id
     *
     * @param shopCartId the value for order_shop_cart.shop_cart_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setShopCartId(Integer shopCartId) {
        this.shopCartId = shopCartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shop_cart.evaluate
     *
     * @return the value of order_shop_cart.evaluate
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public String getEvaluate() {
        return evaluate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shop_cart.evaluate
     *
     * @param evaluate the value for order_shop_cart.evaluate
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate == null ? null : evaluate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_shop_cart.create_time
     *
     * @return the value of order_shop_cart.create_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_shop_cart.create_time
     *
     * @param createTime the value for order_shop_cart.create_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}