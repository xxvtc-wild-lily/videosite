package com.ysd.videosite.entity;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class FavouriteVideo {
	
	private Integer fv_id;
	private Integer v_id;
	private Integer u_id;
	private Timestamp fv_favouriteTime;
	
}
