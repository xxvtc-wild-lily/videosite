package com.ysd.videosite.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
public class Pagination<T> {
	private Integer page;
	private Integer pageSize;
	private Integer total;
	private List<T> rows;
	private Integer e_id;

	

}
