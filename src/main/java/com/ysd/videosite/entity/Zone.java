package com.ysd.videosite.entity;

import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Zone {
	
	private Integer z_id;
	private String z_name;
	private Integer z_parentId;
	private Integer z_lockStatus;
	private Date z_lockTime;
	private Integer z_weight;
	private String z_ext1;
	private Integer z_ext2;
	
}
