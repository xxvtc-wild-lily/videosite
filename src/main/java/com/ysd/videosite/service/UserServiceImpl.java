package com.ysd.videosite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysd.videosite.dao.UserMapper;
import com.ysd.videosite.entity.Pagination;
import com.ysd.videosite.entity.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper usermapper;
	@Override
	//查询所有的用户
	public Pagination<User> selectDuoTiaoJianUser(Pagination<User> p) {
		// TODO Auto-generated method stub
		List<User> selectDuoTiaoJianPaginationUser = usermapper.selectDuoTiaoJianPaginationUser(p);
		Integer selectDuoTiaoJianPaginationUserCount = usermapper.selectDuoTiaoJianPaginationUserCount(p);
		p.setRows(selectDuoTiaoJianPaginationUser);
		p.setTotal(selectDuoTiaoJianPaginationUserCount);
		return p;
	}
	@Override
	//根据用户ID锁定用户
	public Integer slockingUserById(Integer u_id) {
		// TODO Auto-generated method stub
		Integer lockingUserById = usermapper.lockingUserById(u_id);
		return lockingUserById;
	}
	@Override
	//根据用户ID解锁用户
	public Integer sunlockUserById(Integer u_id) {
		// TODO Auto-generated method stub
		Integer unlockUserById = usermapper.unlockUserById(u_id);
		return unlockUserById;
	}

}
