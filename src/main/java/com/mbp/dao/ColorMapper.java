package com.mbp.dao;

import com.mbp.entity.Color;

public interface ColorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int deleteByPrimaryKey(Integer colorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int insert(Color record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int insertSelective(Color record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    Color selectByPrimaryKey(Integer colorId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int updateByPrimaryKeySelective(Color record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table color
     *
     * @mbg.generated Wed Dec 25 17:55:57 CST 2019
     */
    int updateByPrimaryKey(Color record);
}