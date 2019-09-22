package com.ysd.videosite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.ysd.videosite.entity.Pagination;
import com.ysd.videosite.entity.Video;
import com.ysd.videosite.service.VideoService;

@RestController
public class VideoConteoller {
	@Autowired
	private VideoService videoService;
	@RequestMapping(value="/index",method = RequestMethod.POST)
	public Pagination<Video> selectVideo(@RequestParam("rows") Integer pageSize,Pagination<Video> fenye){
		fenye.setPageSize(pageSize);
		fenye.setPage((fenye.getPage()-1)*fenye.getPageSize());
		Pagination<Video> selectVideoByEmpId = videoService.selectVideoByEmpId(fenye);
		return selectVideoByEmpId;
		
	}

}
