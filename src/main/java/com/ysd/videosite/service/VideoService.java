package com.ysd.videosite.service;

import java.util.List;

import com.ysd.videosite.entity.Examine;
import com.ysd.videosite.entity.Pagination;
import com.ysd.videosite.entity.Video;

public interface VideoService {
		/**
		 * 多条件查询归自己管理的未审核的视频
		 * @param pag
		 * @return
		 */
	public Pagination<Video> selectVideoByEmpId(Pagination<Video> pag);
	/**
	 * 审核通过
	 * @param examine
	 * @return
	 */
	public Integer examineVideoTongGuo(Examine examine);
	/**
	 * 审核未通过
	 * @param examine
	 * @return
	 */
	public Integer examineVideoWeiTongGuo(Examine examine);
	/**
	 * 多条件查询归自己管理的已审核的视频
	 * @param pag
	 * @return
	 */
	public Pagination<Video> selectVideoYiExamineByid(Pagination<Video> pag);
}
