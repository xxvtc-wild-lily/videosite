package com.ysd.videosite.entity;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class User {
	
	private Integer u_id;
	private String u_name;
	private String u_passWord;
	private String u_img;
	private Integer u_sex;
	private Date u_birthday;
	private String u_introduce;
	private Integer u_iconNum;
	private Timestamp u_registerTime;
	private Date u_lastLoginTime;
	private Integer u_lockStatus;
	private Date u_lockTime;
	private Integer u_pwdWrongTimes;
	private String u_protectEmail;
	private String u_protectMTel;
	private String u_fingerprintNum;
	private String u_ext1;
	private Integer u_ext2;
	
}
