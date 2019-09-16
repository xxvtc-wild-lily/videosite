package com.ysd.videosite.entity;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Comment {
	
	private Integer c_id;
	private String c_count;
	private Integer u_id;
	private Integer v_id;
	private Timestamp c_sendTime;
	private Integer c_lockStatus;
	private Date c_lockTime;
	private Integer c_likeNum;
	private Integer c_unlikeNum;
	private Integer c_floorNum;
	private Integer c_parentFloorId;
	private Integer c_replyNum;
	private Integer c_replyUserId;
	private String c_ext1;
	private Integer c_ext2;
	
}
