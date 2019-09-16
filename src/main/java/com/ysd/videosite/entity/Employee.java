package com.ysd.videosite.entity;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Employee {
	
	private Integer e_id;
	private String e_name;
	private String e_passWord;
	private Integer e_age;
	private Integer e_sex;
	private Integer e_lockStatus;
	private Date e_lockTime;
	private Date e_lastLoginTime;
	private Timestamp e_createTime;
	private Integer e_pwdWrongTimes;
	private String e_protectEmail;
	private String e_protectMTel;
	private String e_fingerpringNum;
	private String e_ext1;
	private Integer e_ext2;
	
}
