package com.ysd.videosite.entity;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Examine {
	
	private Integer ex_id;
	private Integer e_id;
	private Integer ex_examineStatus;
	private Timestamp ex_examineTime;
	private Date ex_examinePassTime;
	private String ex_examineSuggestion;
	private String ex_ext1;//视频id
	private Integer ex_ext2;
	
}
