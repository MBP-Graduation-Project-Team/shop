package com.mbp.dao;

import com.mbp.entity.PersonAddress;

public interface PersonAddressMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_address
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_address
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int insert(PersonAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_address
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int insertSelective(PersonAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_address
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    PersonAddress selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_address
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int updateByPrimaryKeySelective(PersonAddress record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_address
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int updateByPrimaryKey(PersonAddress record);
}