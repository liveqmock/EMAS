package com.evmtv.epg.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.evmtv.epg.entity.TAdv;
import com.evmtv.epg.entity.TVersionAdv;
import com.evmtv.epg.entity.TVersionAdvExample;
import com.evmtv.epg.entity.TVersionAdvExample.Criteria;
import com.evmtv.epg.mapper.TVersionAdvMapper;
import com.evmtv.epg.response.VersionAdvResponse;
import com.evmtv.epg.service.IVersionAdv;
/**
 * 
 * TODO
 * @author fangzhu(fangzhu@evmtv.com)
 * @enclosing_type 
 * @project_name EAMS
 * @file_name VersionAdvService.java
 * @package_name com.evmtv.epg.impl
 * @date_time 2013年11月9日下午1:19:05
 * @type_name VersionAdvService
 */
@Service
public class VersionAdvService implements IVersionAdv {
	
	@Resource TVersionAdvMapper mapper;
	
	@Override
	public int insert(TVersionAdv v) {
		// TODO Auto-generated method stub
		return mapper.insertSelective(v);
	}

	@Override
	public int batchInsert(List<TVersionAdv> vs) {
		// TODO Auto-generated method stub
		return mapper.batchInsert(vs);
	}

	@Override
	public int delete(List<Long> id) {
		// TODO Auto-generated method stub
		TVersionAdvExample example = new TVersionAdvExample();
		example.createCriteria().andIdIn(id);
		return mapper.deleteByExample(example);
	}
	
	public int delete(TVersionAdv va) {
		TVersionAdvExample example = new TVersionAdvExample();
		Criteria criteria = example.createCriteria();
		if(va.getFadvid() != null){
			criteria.andFadvidEqualTo(va.getFadvid());
		}
		if(va.getFbranchid() != null){
			criteria.andFbranchidEqualTo(va.getFbranchid());
		}
		if(va.getFreleaseversionid() != null){
			criteria.andFreleaseversionidEqualTo(va.getFreleaseversionid());
		}
		return mapper.deleteByExample(example);
	}
	
	@Override
	public int update(TVersionAdv v) {
		// TODO Auto-generated method stub
		/*TVersionAdvExample example = new TVersionAdvExample();
		Criteria criteria = example.createCriteria();
		if(v.getFadvid() != null){
			criteria.andFadvidEqualTo(v.getFadvid());
		}
		if(v.getFbranchid() != null){
			criteria.andfa
		}*/
		return mapper.updateByPrimaryKeySelective(v);
	}

	@Override
	public TVersionAdv selectByKey(Long id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<TVersionAdv> selectByReleaseVersionId(Long rvid) {
		// TODO Auto-generated method stub
		TVersionAdvExample example = new TVersionAdvExample();
		example.createCriteria().andFreleaseversionidEqualTo(rvid);
		return mapper.selectByExample(example);
	}

	@Override
	public List<Long> selectAdvidByReleaseVersionId(Long rvid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TVersionAdv> selectByExample(TVersionAdv adv) {
		// TODO Auto-generated method stub
		TVersionAdvExample example = new TVersionAdvExample();
		
		return mapper.selectByExample(example);
	}

	@Override
	public List<TVersionAdv> select(List<Long> id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TVersionAdv> query(Long fbranchid) {
		// TODO Auto-generated method stub
		TVersionAdvExample example = new TVersionAdvExample();
		example.createCriteria().andFbranchidEqualTo(fbranchid);
		return mapper.selectByExample(example);
	}

	@Override
	public List<TVersionAdv> query(Long branchid, String definition) {
		// TODO Auto-generated method stub
		TVersionAdvExample example = new TVersionAdvExample();
		Criteria criteria = example.createCriteria();
		criteria.andFbranchidEqualTo(branchid);
		criteria.andFdefinitionEqualTo(definition);
		
		return mapper.selectByExample(example);
	}

	@Override
	public List<TAdv> selectAdvByMaxReleaseVersionid(VersionAdvResponse var) {
		// TODO Auto-generated method stub
		return mapper.selectAdvByMaxReleaseVersionid(var);
	}

	@Override
	public List<TAdv> selectAdvByReleaseVersionid(Long rvid) {
		// TODO Auto-generated method stub
		return mapper.selectAdvByReleaseVersionid(rvid);
	}
	
	@Override
	public TAdv selectHdVideoAdvByRvidAndPosid(Long rvid) {
		// TODO Auto-generated method stub
		return mapper.selectHdVideoAdvByRvidAndPosid(rvid);
	}
	
	@Override
	public Long selectMaxReleaseVersionid(VersionAdvResponse var) {
		// TODO Auto-generated method stub
		return mapper.selectMaxReleaseVersionid(var);
	}
}
