package com.mbp.dao;

import com.mbp.entity.PersonAccount;

public interface PersonAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_account
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int insert(PersonAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table person_account
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int insertSelective(PersonAccount record);

    PersonAccount selectByPersonAccount(PersonAccount personAccount);

}