package com.mbp.dao;

import com.mbp.entity.ActivityType;

public interface ActivityTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_type
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int deleteByPrimaryKey(Integer activityTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_type
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int insert(ActivityType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_type
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int insertSelective(ActivityType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_type
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    ActivityType selectByPrimaryKey(Integer activityTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_type
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int updateByPrimaryKeySelective(ActivityType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table activity_type
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int updateByPrimaryKey(ActivityType record);
}