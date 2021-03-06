package com.mbp.entity;

import java.io.Serializable;
import java.util.Date;

public class ShopCart implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_cart.shop_cart_id
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    private Integer shopCartId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_cart.person_id
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    private Integer personId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_cart.product_id
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    private Integer productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_cart.product_color
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    private Integer productColor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_cart.product_standard
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    private Integer productStandard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_cart.product_number
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    private Integer productNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shop_cart.create_time
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table shop_cart
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_cart.shop_cart_id
     *
     * @return the value of shop_cart.shop_cart_id
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    public Integer getShopCartId() {
        return shopCartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_cart.shop_cart_id
     *
     * @param shopCartId the value for shop_cart.shop_cart_id
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    public void setShopCartId(Integer shopCartId) {
        this.shopCartId = shopCartId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_cart.person_id
     *
     * @return the value of shop_cart.person_id
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    public Integer getPersonId() {
        return personId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_cart.person_id
     *
     * @param personId the value for shop_cart.person_id
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_cart.product_id
     *
     * @return the value of shop_cart.product_id
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_cart.product_id
     *
     * @param productId the value for shop_cart.product_id
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_cart.product_color
     *
     * @return the value of shop_cart.product_color
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    public Integer getProductColor() {
        return productColor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_cart.product_color
     *
     * @param productColor the value for shop_cart.product_color
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    public void setProductColor(Integer productColor) {
        this.productColor = productColor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_cart.product_standard
     *
     * @return the value of shop_cart.product_standard
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    public Integer getProductStandard() {
        return productStandard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_cart.product_standard
     *
     * @param productStandard the value for shop_cart.product_standard
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    public void setProductStandard(Integer productStandard) {
        this.productStandard = productStandard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_cart.product_number
     *
     * @return the value of shop_cart.product_number
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    public Integer getProductNumber() {
        return productNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_cart.product_number
     *
     * @param productNumber the value for shop_cart.product_number
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shop_cart.create_time
     *
     * @return the value of shop_cart.create_time
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shop_cart.create_time
     *
     * @param createTime the value for shop_cart.create_time
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}