package com.evmtv.epg.mapper;

import com.evmtv.epg.entity.TAdv;
import com.evmtv.epg.entity.TVersionAdv;
import com.evmtv.epg.entity.TVersionAdvExample;
import com.evmtv.epg.response.VersionAdvResponse;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TVersionAdvMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_version_adv
     *
     * @mbggenerated Sat Nov 09 13:07:32 CST 2013
     */
    int countByExample(TVersionAdvExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_version_adv
     *
     * @mbggenerated Sat Nov 09 13:07:32 CST 2013
     */
    int deleteByExample(TVersionAdvExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_version_adv
     *
     * @mbggenerated Sat Nov 09 13:07:32 CST 2013
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_version_adv
     *
     * @mbggenerated Sat Nov 09 13:07:32 CST 2013
     */
    int insert(TVersionAdv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_version_adv
     *
     * @mbggenerated Sat Nov 09 13:07:32 CST 2013
     */
    int insertSelective(TVersionAdv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_version_adv
     *
     * @mbggenerated Sat Nov 09 13:07:32 CST 2013
     */
    List<TVersionAdv> selectByExample(TVersionAdvExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_version_adv
     *
     * @mbggenerated Sat Nov 09 13:07:32 CST 2013
     */
    TVersionAdv selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_version_adv
     *
     * @mbggenerated Sat Nov 09 13:07:32 CST 2013
     */
    int updateByExampleSelective(@Param("record") TVersionAdv record, @Param("example") TVersionAdvExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_version_adv
     *
     * @mbggenerated Sat Nov 09 13:07:32 CST 2013
     */
    int updateByExample(@Param("record") TVersionAdv record, @Param("example") TVersionAdvExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_version_adv
     *
     * @mbggenerated Sat Nov 09 13:07:32 CST 2013
     */
    int updateByPrimaryKeySelective(TVersionAdv record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_version_adv
     *
     * @mbggenerated Sat Nov 09 13:07:32 CST 2013
     */
    int updateByPrimaryKey(TVersionAdv record);
    /**
     * 批量新增
     * @param vs
     * @return
     */
	int batchInsert(List<TVersionAdv> vs);
	/**
	 * 广告位
	 * @param bid
	 * @return
	 */
	List<TAdv> selectAdvByMaxReleaseVersionid(@Param("var")VersionAdvResponse var);
	/**
	 * 
	 * @param fbranchid
	 * @return
	 */
	List<TAdv> selectAdvByReleaseVersionid(@Param("freleaseversionid")Long freleaseversionid);
	/**
	 * 广告位
	 * @param bid
	 * @return
	 */
	Long selectMaxReleaseVersionid(@Param("var")VersionAdvResponse var);
}