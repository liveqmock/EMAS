package com.evmtv.epg.service;

import java.util.List;

import com.evmtv.epg.entity.TTimePeriod;

public interface ITimePeriod {
	
	/**
	 * 保存
	 * @param period
	 * @return
	 */
	int insert(TTimePeriod period);
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	int delete(List<Long> id);
	/**
	 * 修改
	 * @param period
	 * @return
	 */
	int update(TTimePeriod period);
	/**
	 * 查询
	 * @param period
	 * @return
	 */
	List<TTimePeriod> query(TTimePeriod period);
	/**
	 * 查询
	 * @param period
	 * @param advIds
	 * @return
	 */
	List<TTimePeriod> query(List<Long> vaIds);
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	TTimePeriod queryById(Long id);
	/**
	 * 
	 * @param period 时间段
	 * @param fbranchids 分公司id
	 * @return
	 */
//	List<TTimePeriod> query(TTimePeriod period, List<Long> fbranchids);
	/**
	 * 根据分公司查询
	 * @param branchid
	 * @return
	 */
	List<TTimePeriod> query(Long branchid,Long fadvid);
	/**
	 * 根据id
	 * @param id
	 * @return
	 */
	List<TTimePeriod> queryByIdList(List<Long> id);
	/**
	 * 检查时间是否重复
	 * @param period
	 * @return
	 */
	int selectCheckRepeat(TTimePeriod period);
	/**
	 * 根据id删除
	 * @param id
	 * @return
	 */
	int delete(Long id);
	/**
	 * 根据广告位索引查询时间段
	 * @param fadvid
	 * @param rvid 
	 * @return
	 */
	List<TTimePeriod> queryByAdvid(Long fadvid, Long rvid,Long vaid);
}