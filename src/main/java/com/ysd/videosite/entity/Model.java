package com.ysd.videosite.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Model {
	
	private Integer m_id;
	private String m_content;
	private Integer m_weight;
	
}
