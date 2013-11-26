package com.evmtv.epg.mapper;

import com.evmtv.epg.entity.TUserMenu;
import com.evmtv.epg.entity.TUserMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserMenuMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_menu
     *
     * @mbggenerated
     */
    int countByExample(TUserMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_menu
     *
     * @mbggenerated
     */
    int deleteByExample(TUserMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_menu
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_menu
     *
     * @mbggenerated
     */
    int insert(TUserMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_menu
     *
     * @mbggenerated
     */
    int insertSelective(TUserMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_menu
     *
     * @mbggenerated
     */
    List<TUserMenu> selectByExample(TUserMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_menu
     *
     * @mbggenerated
     */
    TUserMenu selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_menu
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") TUserMenu record, @Param("example") TUserMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_menu
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") TUserMenu record, @Param("example") TUserMenuExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_menu
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(TUserMenu record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user_menu
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(TUserMenu record);
}