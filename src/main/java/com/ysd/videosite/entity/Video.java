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
	
}
