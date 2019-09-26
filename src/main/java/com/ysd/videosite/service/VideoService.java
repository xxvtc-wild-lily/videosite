package com.ysd.videosite.service;

import java.util.List;

import com.ysd.videosite.entity.Pagination;
import com.ysd.videosite.entity.Video;

public interface VideoService {
		/**
		 * 多条件查询归自己管理的视频
		 * @param pag
		 * @return
		 */
	Pagination<Video> selectVideoByEmpId(Pagination<Video> pag);
}
