package com.ysd.videosite.dao;

import java.util.List;

import com.ysd.videosite.entity.Pagination;
import com.ysd.videosite.entity.Video;

public interface VideoMapper {
		/**
		 * 多条件查询自己分区下的分配给自己的视频
		 * @return
		 */
		public List<Video> SelectVideoByEmployeeId(Pagination<Video> pag);
		/**
		 * 多条件查询自己分区下的分配给自己的视频的数量
		 * @param pag
		 * @return
		 */
		public Integer SelectVideoCountByEmployeeId(Pagination<Video> pag);
}
