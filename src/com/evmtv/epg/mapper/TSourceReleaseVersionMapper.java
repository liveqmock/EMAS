package com.evmtv.epg.mapper;

import com.evmtv.epg.entity.TSourceReleaseVersion;
import com.evmtv.epg.entity.TSourceReleaseVersionExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface TSourceReleaseVersionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_source_release_version
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    int countByExample(TSourceReleaseVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_source_release_version
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    int deleteByExample(TSourceReleaseVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_source_release_version
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_source_release_version
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    int insert(TSourceReleaseVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_source_release_version
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    int insertSelective(TSourceReleaseVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_source_release_version
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    List<TSourceReleaseVersion> selectByExample(TSourceReleaseVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_source_release_version
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    TSourceReleaseVersion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_source_release_version
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    int updateByExampleSelective(@Param("record") TSourceReleaseVersion record, @Param("example") TSourceReleaseVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_source_release_version
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    int updateByExample(@Param("record") TSourceReleaseVersion record, @Param("example") TSourceReleaseVersionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_source_release_version
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    int updateByPrimaryKeySelective(TSourceReleaseVersion record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_source_release_version
     *
     * @mbggenerated Thu Oct 31 12:02:06 CST 2013
     */
    int updateByPrimaryKey(TSourceReleaseVersion record);
    /**
     * 批量新增
     * @param record
     * @return
     */
    int insertBatchSelective(List<TSourceReleaseVersion> record);
    /**
     * 查询广告索引
     * @param example
     * @return
     */
	List<Long> selectSourceIdByReleaseVersionId(TSourceReleaseVersionExample example);
}