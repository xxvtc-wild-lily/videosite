package com.ysd.videosite.service;

import com.ysd.videosite.entity.Pagination;
import com.ysd.videosite.entity.User;

public interface UserService {
		/**
		 * 多条件查询用户
		 * @param p
		 * @return
		 */
		Pagination<User> selectDuoTiaoJianUser(Pagination<User> p);
		/**
		 * 根据用户ID锁定用户
		 * @param u_id
		 * @return
		 */
		Integer slockingUserById(Integer u_id);
		/**
		 * 根据用户ID解锁用户
		 * @param u_id
		 * @return
		 */
		Integer sunlockUserById(Integer u_id);
}
