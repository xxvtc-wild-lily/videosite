package com.ysd.videosite.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ysd.videosite.entity.Examine;
import com.ysd.videosite.entity.Pagination;
import com.ysd.videosite.entity.Video;
import com.ysd.videosite.service.VideoService;

@RestController
public class VideoConteoller {
	@Autowired
	private VideoService videoService;
	//查询属于我的未审批的视频
	@RequestMapping(value="/index",method = RequestMethod.POST)
	public Pagination<Video> selectVideo(@RequestParam("rows") Integer pageSize,Pagination<Video> fenye){
		fenye.setPageSize(pageSize);
		fenye.setPage((fenye.getPage()-1)*fenye.getPageSize());
		Pagination<Video> selectVideoByEmpId = videoService.selectVideoByEmpId(fenye);
		return selectVideoByEmpId;
		
	}
	//审批通过
	@RequestMapping(value="/examinetongguo",method = RequestMethod.POST)
	public Integer TongGuo(Examine examine) {
		Integer examineVideoTongGuo = videoService.examineVideoTongGuo(examine);
		return examineVideoTongGuo;
		
	}
	//审批未通过
	@RequestMapping(value="/examineweitongguo",method = RequestMethod.POST)
	public Integer WeiTongGuo(Examine examien) {
		Integer examineVideoWeiTongGuo = videoService.examineVideoWeiTongGuo(examien);
		return examineVideoWeiTongGuo;
	  
		
	}
	@RequestMapping(value="/yiexaminevideo",method = RequestMethod.POST)
	public Pagination<Video> selectYiExamineVideoById(@RequestParam("rows") Integer pageSize,Pagination<Video> fenye){
		fenye.setPageSize(pageSize);
		fenye.setPage((fenye.getPage()-1)*fenye.getPageSize());
		Pagination<Video> selectVideoYiExamineByid = videoService.selectVideoYiExamineByid(fenye);
		return selectVideoYiExamineByid;
		
	}
}
