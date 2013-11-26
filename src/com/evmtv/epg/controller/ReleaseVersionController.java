package com.evmtv.epg.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.evmtv.epg.entity.TReleaseVersion;
import com.evmtv.epg.response.PageUtils;
import com.evmtv.epg.service.IReleaseVersion;
import com.google.gson.Gson;

/**
 * 发布版本
 * TODO
 * @author fangzhu(fangzhu@evmtv.com)
 * @enclosing_type 
 * @project_name EAMS
 * @file_name ReleaseVersionController.java
 * @package_name com.evmtv.epg.controller
 * @date_time 2013年10月30日下午1:11:40
 * @type_name ReleaseVersionController
 */
@Controller
@RequestMapping("/main/releaseVersion")
public class ReleaseVersionController {
	
	@Resource IReleaseVersion iReleaseVersion;
	
	/**
	 * 查询最大版本号
	 * @param model
	 * @param fbranchid
	 * @return
	 */
	@RequestMapping("/queryDayVersion")
	public String queryDayVersion(Model model,Long fbranchid,String definition){
		
		TReleaseVersion version = iReleaseVersion.selectByBranchidAndMaxDayVersion(fbranchid,definition);
		
		Gson gson = new Gson();
		String result = gson.toJson(version);
		
		model.addAttribute("result", result);
		
		return PageUtils.json;
	}
	/**
	 * 查询分公司版本
	 * @param model
	 * @param fbranchid
	 * @return
	 */
	@RequestMapping("/query")
	public String queryByBranchid(Model model,Long fbranchid,String definition,Integer status){
		//分公司版本号
		List<TReleaseVersion> versions = iReleaseVersion.selectByBranchid(fbranchid,definition,status);
		
		Gson gson = new Gson();
		String result = gson.toJson(versions);
		
		model.addAttribute("result", result);
		
		return PageUtils.json;
	}
}