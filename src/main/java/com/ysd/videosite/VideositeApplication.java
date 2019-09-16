package com.ysd.videosite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ysd.videosite.dao")
public class VideositeApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideositeApplication.class, args);
	}

}
