package com.ysd.videosite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysd.videosite.dao.VideoMapper;
import com.ysd.videosite.entity.Pagination;
import com.ysd.videosite.entity.Video;
@Service
public class VideoServiceImpl implements VideoService {
	@Autowired
	private VideoMapper videomapper;
	@Override
	public Pagination<Video> selectVideoByEmpId(Pagination<Video> pag) {
		List<Video> selectVideoByEmployeeId = videomapper.SelectVideoByEmployeeId(pag);
		Integer selectVideoCountByEmployeeId = videomapper.SelectVideoCountByEmployeeId(pag);
		pag.setRows(selectVideoByEmployeeId);
		pag.setTotal(selectVideoCountByEmployeeId);
		return pag;
	}

}
