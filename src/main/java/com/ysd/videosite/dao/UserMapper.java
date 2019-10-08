package com.ysd.videosite.dao;

import java.util.List;

import com.ysd.videosite.entity.Pagination;
import com.ysd.videosite.entity.User;

public interface UserMapper {
		/**
		 * 多条件分页查询用户
		 * @param p
		 * @return
		 */
		public List<User> selectDuoTiaoJianPaginationUser(Pagination<User> p);
		/**
		 * 多条件分页查询用户总条数
		 * @param p
		 * @return
		 */
		public Integer selectDuoTiaoJianPaginationUserCount(Pagination<User> p);
		/**
		 * 根据用户ID锁定用户
		 * @param u_id
		 * @return
		 */
		public Integer lockingUserById(Integer u_id);
		/**
		 * 根据用户ID解锁用户
		 * @param u_id
		 * @return
		 */
		public Integer unlockUserById(Integer u_id);
}
