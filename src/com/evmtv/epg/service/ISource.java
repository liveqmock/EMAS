package com.evmtv.epg.service;

import java.util.List;

import com.evmtv.epg.entity.TSource;
import com.evmtv.epg.entity.TSourceWithBLOBs;

/**
 * 资源
 * @author fangzhu(fangzhu@evmtv.com)
 * @time 2013-6-4 下午1:11:29
 */
public interface ISource {
	/**
	 * 保存资源信息
	 * @param source
	 * @return
	 */
	int insert(TSourceWithBLOBs source);
	/**
	 * 批量保存
	 * @param Sources
	 * @return
	 */
	int intsertBatch(List<TSourceWithBLOBs> sources);
	/**
	 * 修改
	 * @param bloBs
	 * @return
	 */
	int update(TSourceWithBLOBs bloBs);
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	int delete(List<Long> id);
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	int delete(String guid);
	/**
	 * 根据广告id删除
	 * @param advId
	 * @return
	 */
	int delete(Long advId);
	/**
	 * 根据广告id删除
	 * @param advId
	 * @return
	 */
	int deleteAdv(List<Long> advId);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	TSourceWithBLOBs queryById(Long id);
	/**
	 * 条件查询
	 * @param source
	 * @return
	 */
	List<TSourceWithBLOBs> query(TSourceWithBLOBs source);
	/**
	 * 根据基本数据索引查询source
	 * @param advId 基本数据id
	 * @return
	 */
	List<TSource> query(List<Long> advId);
	/**
	 * 根据id查询
	 * @param Id
	 * @return
	 */
	TSource selectById(Long Id);
	/**时间查询
	 * @param timesId
	 * @return
	 */
	List<TSource> queryByTimeId(List<Long> timesId);
	/**
	 * 
	 * @param source
	 * @return
	 */
	List<TSource> query(TSource source);
	
	/**
	 * 根据广告位或时间段查询
	 * @param source
	 * @return
	 */
	List<TSource> queryByAdvOrTimeperiod(TSource source);
	/**
	 * 根据分公司索引查询
	 * @param branchid
	 * @return
	 */
	List<TSourceWithBLOBs> selectByBranchidList(List<Long> branchid);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	List<TSourceWithBLOBs> selectByIdList(List<Long> id);
	
	/**
	 * 修改发布状态
	 * @param id
	 * @return
	 */
	int update(List<Long> id,Long branchid,String fflag);
	/**
	 * 查询分公司所有广告
	 * @param branchid
	 * @return
	 */
	@Deprecated
//	List<TSourceWithBLOBs> selectByBranchid(Long branchid,List<Long> badvid,String createTime);
	/**
	 * 查询发布广告
	 * @param source
	 * @return
	 */
	List<TSourceWithBLOBs> selectRelease(TSource source);
	
	/**
	 * 我的任务
	 * @param source
	 * @return
	 */
	List<TSource> selectMyTask(TSource source);
	/**
	 * 根据id查询
	 * @param ids
	 * @return
	 */
	List<String> selectByfguid(List<Long> ids);
	/**
	 * 根据时间段索引查询
	 * @param timeId
	 * @return
	 */
	List<TSource> queryByTimeId(Long timeId);
	
	
	
	/**
	 * 查询发布
	 * @param source
	 * @return
	 */
	List<TSource> selectSourceRelease(TSource source);
	
	/**
	 * 查询广告索引根据素材索引
	 * @param rid 素材索引
	 * @return
	 */
	List<Long> querySidByRid(Long rid);
}