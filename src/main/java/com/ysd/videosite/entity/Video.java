package com.ysd.videosite.entity;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Video {

	private Integer v_id;
	private String v_name;
	private String v_introduce;
	private String v_videoUrl;
	private String v_imgUrl;
	private Timestamp v_uploadTime;
	private Time v_totalTime;
	private Integer v_playNum;
	private Integer v_barrageNum;
	private Integer v_commentNum;
	private Integer v_collectNum;
	private Integer v_likeNum;
	private Integer v_unlikeNum;
	private Integer u_id;
	private Integer v_lockStatus;
	private Date v_lockTime;
	private Integer e_id;
	private Integer v_examineStatus;
	private Integer z_id;
	private Integer ex_id;
	private String v_ext1;
	private Integer v_ext2;
	private Employee employee;
	private Zone zone;
	private Examine examine;
	public Video(Integer v_id, String v_name, String v_introduce, String v_videoUrl, String v_imgUrl,
			Timestamp v_uploadTime, Time v_totalTime, Integer v_playNum, Integer v_barrageNum, Integer v_commentNum,
			Integer v_collectNum, Integer v_likeNum, Integer v_unlikeNum, Integer u_id, Integer v_lockStatus,
			Date v_lockTime, Integer e_id, Integer v_examineStatus, Integer z_id, Integer ex_id, String v_ext1,
			Integer v_ext2, Employee employee, Zone zone, Examine examine) {
		super();
		this.v_id = v_id;
		this.v_name = v_name;
		this.v_introduce = v_introduce;
		this.v_videoUrl = v_videoUrl;
		this.v_imgUrl = v_imgUrl;
		this.v_uploadTime = v_uploadTime;
		this.v_totalTime = v_totalTime;
		this.v_playNum = v_playNum;
		this.v_barrageNum = v_barrageNum;
		this.v_commentNum = v_commentNum;
		this.v_collectNum = v_collectNum;
		this.v_likeNum = v_likeNum;
		this.v_unlikeNum = v_unlikeNum;
		this.u_id = u_id;
		this.v_lockStatus = v_lockStatus;
		this.v_lockTime = v_lockTime;
		this.e_id = e_id;
		this.v_examineStatus = v_examineStatus;
		this.z_id = z_id;
		this.ex_id = ex_id;
		this.v_ext1 = v_ext1;
		this.v_ext2 = v_ext2;
		this.employee = employee;
		this.zone = zone;
		this.examine = examine;
	}
	public Video() {
		super();
	}
	

}
