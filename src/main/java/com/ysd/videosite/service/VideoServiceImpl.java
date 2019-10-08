package com.ysd.videosite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysd.videosite.dao.VideoMapper;
import com.ysd.videosite.entity.Examine;
import com.ysd.videosite.entity.Pagination;
import com.ysd.videosite.entity.Video;
@Service
public class VideoServiceImpl implements VideoService {
	@Autowired
	private VideoMapper videomapper;
	@Override
	//查询分配给自己的未审核的视频
	public Pagination<Video> selectVideoByEmpId(Pagination<Video> pag) {
		List<Video> selectVideoByEmployeeId = videomapper.SelectVideoByEmployeeId(pag);
		Integer selectVideoCountByEmployeeId = videomapper.SelectVideoCountByEmployeeId(pag);
		pag.setRows(selectVideoByEmployeeId);
		pag.setTotal(selectVideoCountByEmployeeId);
		return pag;
	}
	@Override
	//审核通过
	public Integer examineVideoTongGuo(Examine examine) {
		Integer examineTongGuo = videomapper.examineTongGuo(examine);
		return examineTongGuo;
	}
	@Override
	//审核未通过
	public Integer examineVideoWeiTongGuo(Examine examine) {
		Integer examineWeiTongGuo = videomapper.examineWeiTongGuo(examine);
		return examineWeiTongGuo;
	}
	@Override
	//查询分配给自己的已审核的视频
	public Pagination<Video> selectVideoYiExamineByid(Pagination<Video> pag) {
		List<Video> selectYiExamineVideo = videomapper.selectYiExamineVideo(pag);
		Integer selectYiExamineVideoCount = videomapper.selectYiExamineVideoCount(pag);
		pag.setRows(selectYiExamineVideo);
		pag.setTotal(selectYiExamineVideoCount);
		return pag;
	}

}
