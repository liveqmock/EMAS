package com.evmtv.epg.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.evmtv.epg.entity.TChannels;
import com.evmtv.epg.entity.TChannelsExample;
import com.evmtv.epg.entity.TChannelsExample.Criteria;
import com.evmtv.epg.mapper.TChannelsMapper;
import com.evmtv.epg.request.ChannelRequest;
import com.evmtv.epg.service.IChannels;
import com.evmtv.epg.utils.CollectionUtills;

/**
 * 频点管理
 * 
 * @author fangzhu(fangzhu@evmtv.com)
 * @time 2013-6-17 上午9:34:37
 */
@Service
public class ChannelsService implements IChannels {

	@Resource
	TChannelsMapper mapper;

	@Override
	public int insert(TChannels channels) {
		return mapper.insertSelective(channels);
	}

	@Override
	public int delete(List<Long> id) {
		TChannelsExample example = new TChannelsExample();
		example.createCriteria().andIdIn(id);
		return mapper.deleteByExample(example);
	}

	@Override
	public int update(TChannels channels) {
		return mapper.updateByPrimaryKeySelective(channels);
	}

	@Override
	public TChannels selectByKey(Long id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<TChannels> selectByExample(TChannels channels) {
		TChannelsExample example = new TChannelsExample();
		if (channels != null) {
			Criteria criteria = example.createCriteria();
			if(channels.getFbranchid() != null){
				criteria.andFbranchidEqualTo(channels.getFbranchid());
			}
			
			if(channels.getFreleaseversionid() != null){
				criteria.andFreleaseversionidEqualTo(channels.getFreleaseversionid());
			}
			
			example.setLimit(channels.getLimit());
			example.setStart(channels.getStart());
			if (channels.getHolder() != null)
				channels.getHolder().value = mapper.countByExample(example);
		}
		List<TChannels> tChannels = mapper.selectBranchChannelByExample(example);
		if(!CollectionUtills.hasElements(tChannels) && channels.getStart() > 1){
			int start = channels.getStart()-channels.getLimit();
			channels.setStart(start);
			example.setStart(start);
			tChannels = mapper.selectBranchChannelByExample(example);
		}
		return tChannels;
	}

	@Override
	public List<TChannels> queryByBranchId(Long fbranchid,Long rvid) {
		TChannelsExample example = new TChannelsExample();
		Criteria criteria = example.createCriteria();
		if(fbranchid != null){
			criteria.andFbranchidEqualTo(fbranchid);
		}
		if(rvid != null)
			criteria.andFreleaseversionidEqualTo(rvid);
		return mapper.selectByExample(example);
	}

	@Override
	public List<TChannels> queryByIdList(List<Long> id) {
		// TODO Auto-generated method stub
		TChannelsExample example = new TChannelsExample();
		example.createCriteria().andIdIn(id);
		return mapper.selectByExample(example);
	}

	@Override
	public int batchInsert(List<TChannels> channels) {
		// TODO Auto-generated method stub
		return mapper.insertBatchSelective(channels);
	}

	@Override
	public int delete(Long fbranchid) {
		TChannelsExample example = new TChannelsExample();
		example.createCriteria().andFbranchidEqualTo(fbranchid);
		return mapper.deleteByExample(example);
	}

	@Override
	public int updateLevel(String level, List<Long> id) {
		TChannelsExample example = new TChannelsExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdIn(id);
		
		TChannels record = new TChannels();
		record.setFlevel(level);
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	public List<Long> selectBranchid() {
		// TODO Auto-generated method stub
		return mapper.selectBranchid();
	}

	@Override
	public List<TChannels> queryByBranchIdAndBetweenServiceId(ChannelRequest request) {
		return mapper.queryByBranchIdAndBetweenServiceId(request);
	}

	@Override
	public int updateGroup(String level, List<String> serviceids) {
		// TODO Auto-generated method stub
		
		TChannelsExample example = new TChannelsExample();
		Criteria criteria = example.createCriteria();
		criteria.andFserviceidIn(serviceids);
		
		TChannels record = new TChannels();
		record.setFlevel(level);
		
		return mapper.updateByExampleSelective(record, example);
	}

	@Override
	@Deprecated
	public int updateLevel(String flevel, Long fbranchid) {
		// TODO Auto-generated method stub
		TChannelsExample example = new TChannelsExample();
		Criteria criteria = example.createCriteria();
		criteria.andFbranchidEqualTo(fbranchid);
		criteria.andFlevelEqualTo(flevel);
		
		TChannels c = new TChannels();
		c.setFlevel(flevel);
		
		return mapper.updateByExampleSelective(c, example);
	}

	@Override
	public Long selectMaxRvIdByBranchid(Long fbranchid) {
		// TODO Auto-generated method stub
		return mapper.selectMaxRvIdByBranchid(fbranchid);
	}

}
