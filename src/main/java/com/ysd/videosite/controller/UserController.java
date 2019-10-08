package com.ysd.videosite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ysd.videosite.entity.Pagination;
import com.ysd.videosite.entity.User;
import com.ysd.videosite.service.UserService;

@RestController
public class UserController {
		@Autowired
		private UserService userservice;
		//多条件查询用户
		@RequestMapping(value="selectuser" , method = RequestMethod.POST)
		public Pagination<User> selectAllUser(@RequestParam("rows") Integer pageSize, Pagination<User> fenye) {
			fenye.setPageSize(pageSize);
			fenye.setPage((fenye.getPage()-1)*fenye.getPageSize());
			Pagination<User> selectDuoTiaoJianUser = userservice.selectDuoTiaoJianUser(fenye);
			return selectDuoTiaoJianUser;
		}
		//根据用户ID锁定用户
		@RequestMapping(value="lockinguser" , method = RequestMethod.POST)
		public Integer clockingUserById(Integer u_id) {
			Integer slockingUserById = userservice.slockingUserById(u_id);
			return slockingUserById;
		}
		//根据用户ID解锁用户
		@RequestMapping(value="unlockuser" , method = RequestMethod.POST)
		public Integer cunlockUserById(Integer u_id) {
			Integer sunlockUserById = userservice.sunlockUserById(u_id);
			return sunlockUserById;
			}
		
}
