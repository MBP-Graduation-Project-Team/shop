package com.mbp.dao;

import com.mbp.entity.OrderTable;

public interface OrderTableMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_table
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    int deleteByPrimaryKey(String orderNumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_table
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    int insert(OrderTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_table
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    int insertSelective(OrderTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_table
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    OrderTable selectByPrimaryKey(String orderNumber);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_table
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    int updateByPrimaryKeySelective(OrderTable record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_table
     *
     * @mbg.generated Fri Dec 27 14:52:45 CST 2019
     */
    int updateByPrimaryKey(OrderTable record);
}