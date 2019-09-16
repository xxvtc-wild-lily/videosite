package com.ysd.videosite.entity;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Fallow {
	
	private Integer fw_id;
	private Integer u_id;
	private Timestamp fw_followTime;
	
}
