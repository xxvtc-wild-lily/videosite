package com.ysd.videosite.entity;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Fans {
	
	private Integer fs_id;
	private Integer u_id;
	private Timestamp fs_followTime;
	
}
