package com.ysd.videosite.dao;

import java.util.List;

import com.ysd.videosite.entity.Zone;

public interface ZoneMapper {
	
	/**
	 * 查询全部分区
	 * @return 查询到的分区集合
	 */
	List<Zone> selectAllZone();
	
	/**
	 * 分区管理的搜索自动补全查询
	 * @param z_name 模糊查询关键字
	 * @return 查询到的分区集合
	 */
	List<Zone> selectAutoCompleteZone(String z_name);
	
	/**
	 * 添加新的父分区
	 * @param zone 包含分区信息的分区类
	 * @return 受影响的行数
	 */
	Integer insertNewParentZone(Zone zone);
	
	/**
	 * 修改分区锁定状态
	 * @param z_id 分区id
	 * @return 受影响的行数
	 */
	Integer updateZoneLockStatus(Integer z_id);
	
	/**
	 * 修改分区锁定状态（未锁定）
	 * @param z_id 分区id
	 * @return 受影响的行数
	 */
	Integer updateZoneUnlockStatus(Integer z_id);
	
	/**
	 * 获取全部父节点信息
	 * @return 查询到的分区集合
	 */
	List<Zone> selectAllParentZone();
	
	/**
	 * 修改分区信息
	 * @param zone 包含修改信息的分区类
	 * @return 受影响的行数
	 */
	Integer updateZone(Zone zone);
	
	/**
	 * 添加子分区
	 * @param zone 包含修改信息的分区类
	 * @return 受影响的行数
	 */
	Integer insertChildrenZone(Zone zone);
	
	
}
