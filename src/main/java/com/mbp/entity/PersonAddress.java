package com.mbp.entity;

import java.io.Serializable;
import java.util.Date;

public class PersonAddress implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person_address.id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person_address.person_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer personId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person_address.name
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person_address.telephone
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private String telephone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person_address.province
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private String province;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person_address.city
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person_address.town
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private String town;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person_address.address
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person_address.post_code
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer postCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person_address.type
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person_address.delete_flag
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Integer deleteFlag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column person_address.create_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table person_address
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person_address.id
     *
     * @return the value of person_address.id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person_address.id
     *
     * @param id the value for person_address.id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person_address.person_id
     *
     * @return the value of person_address.person_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getPersonId() {
        return personId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person_address.person_id
     *
     * @param personId the value for person_address.person_id
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person_address.name
     *
     * @return the value of person_address.name
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person_address.name
     *
     * @param name the value for person_address.name
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person_address.telephone
     *
     * @return the value of person_address.telephone
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person_address.telephone
     *
     * @param telephone the value for person_address.telephone
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person_address.province
     *
     * @return the value of person_address.province
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person_address.province
     *
     * @param province the value for person_address.province
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person_address.city
     *
     * @return the value of person_address.city
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person_address.city
     *
     * @param city the value for person_address.city
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person_address.town
     *
     * @return the value of person_address.town
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public String getTown() {
        return town;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person_address.town
     *
     * @param town the value for person_address.town
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setTown(String town) {
        this.town = town == null ? null : town.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person_address.address
     *
     * @return the value of person_address.address
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person_address.address
     *
     * @param address the value for person_address.address
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person_address.post_code
     *
     * @return the value of person_address.post_code
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getPostCode() {
        return postCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person_address.post_code
     *
     * @param postCode the value for person_address.post_code
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setPostCode(Integer postCode) {
        this.postCode = postCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person_address.type
     *
     * @return the value of person_address.type
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person_address.type
     *
     * @param type the value for person_address.type
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person_address.delete_flag
     *
     * @return the value of person_address.delete_flag
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person_address.delete_flag
     *
     * @param deleteFlag the value for person_address.delete_flag
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column person_address.create_time
     *
     * @return the value of person_address.create_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column person_address.create_time
     *
     * @param createTime the value for person_address.create_time
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}