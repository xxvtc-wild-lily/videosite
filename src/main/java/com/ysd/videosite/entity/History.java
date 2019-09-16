package com.ysd.videosite.entity;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class History {
	
	private Integer h_id;
	private Integer u_id;
	private Integer v_id;
	private Timestamp h_watchTime;
	private String h_ext1;
	private Integer h_ext2;
	
}
