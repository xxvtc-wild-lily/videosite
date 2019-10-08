package com.ysd.videosite.dao;

import java.util.List;

import com.ysd.videosite.entity.Examine;
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
		/**
		 * 审核通过
		 * @param examine
		 * @return
		 */
		public Integer examineTongGuo(Examine examine);
		/**
		 * 什么未通过
		 * @param examine
		 * @return
		 */
		public Integer examineWeiTongGuo(Examine examine);
		/**
		 * 查询已经审核过的视频
		 * @param pag
		 * @return
		 */
		public List<Video> selectYiExamineVideo(Pagination<Video> pag);
		/**
		 * 查询已经审核过的视频总条数
		 * @param pag
		 * @return
		 */
		public Integer selectYiExamineVideoCount(Pagination<Video> pag);
}
