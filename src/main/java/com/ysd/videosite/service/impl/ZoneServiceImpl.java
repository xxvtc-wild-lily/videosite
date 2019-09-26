package com.ysd.videosite.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ysd.videosite.dao.ZoneMapper;
import com.ysd.videosite.service.ZoneService;
import com.ysd.videosite.entity.Zone;

@Service
public class ZoneServiceImpl implements ZoneService {
	
	@Autowired
	private ZoneMapper zoneMapper;

	@Override
	public List<HashMap<String,Object>> selectAllZone() {
		// TODO Auto-generated method stub
		List<Zone> zoneList = zoneMapper.selectAllZone();
		return getTree(zoneList);
	}
	
	public List<HashMap<String,Object>> getTree(List<Zone> zoneList) {
        // 查询出的树结构数据
        List<HashMap<String,Object>> treeData = new ArrayList<HashMap<String,Object>>();
        
        for (int i = 0;i < zoneList.size();i++) {
            if (zoneList.get(i).getZ_parentId().equals(0)) {
               
                HashMap<String,Object> map = new HashMap<String, Object>();
                map.put("z_id",zoneList.get(i).getZ_id());
                map.put("z_name",zoneList.get(i).getZ_name());
                map.put("state","closed");
                map.put("z_weight",zoneList.get(i).getZ_weight());
                map.put("z_lockStatus",zoneList.get(i).getZ_lockStatus());
                map.put("z_lockTime",zoneList.get(i).getZ_lockTime());
                map.put("children",getChildren(zoneList.get(i).getZ_id(),zoneList));
                
                treeData.add(map);
            }
            
        }
        
        return treeData;
    }
    
    public List<HashMap<String,Object>> getChildren(Integer z_id,List<Zone> list) {
        // 查询出的children结构数据
        List<HashMap<String,Object>> treeData = new ArrayList<HashMap<String,Object>>();
        
        for (int i = 0;i < list.size();i++) {
        	
            if (list.get(i).getZ_parentId().equals(z_id)) {
            	HashMap<String,Object> map = new HashMap<String, Object>();
                map.put("z_id",list.get(i).getZ_id());
                map.put("z_name",list.get(i).getZ_name());
                map.put("z_parentId", list.get(i).getZ_parentId());
                map.put("state","open");
                for (int j = 0;j< list.size();j++) {
                    if (list.get(j).getZ_parentId().equals(list.get(i).getZ_id())) {
                        map.put("children",getChildren(list.get(j).getZ_id(),list));
                    } else {
                    	 map.put("z_weight",list.get(i).getZ_weight());
                         map.put("z_lockStatus",list.get(i).getZ_lockStatus());
                         map.put("z_lockTime",list.get(i).getZ_lockTime());
                    }
                }
                treeData.add(map);
            }
        }
        
        return treeData;
    }

	@Override
	public List<Zone> selectAutoCompleteZone(String z_name) {
		// TODO Auto-generated method stub
		return zoneMapper.selectAutoCompleteZone(z_name);
	}

	@Override
	public Integer insertNewParentZone(Zone zone) {
		// TODO Auto-generated method stub
		return zoneMapper.insertNewParentZone(zone);
	}

	@Override
	@Transactional
	public Integer updateZoneLockStatus(String array) {
		// TODO Auto-generated method stub
		
		Integer code = 0;
		String[] arr = array.split(",");
		
		for (int i = 0;i < arr.length;i++) {
			Integer j = zoneMapper.updateZoneLockStatus(Integer.parseInt(arr[i]));
			code += j;
		}
		
		return code;
	}

	@Override
	public Integer updateZoneUnlockStatus(Integer z_id) {
		// TODO Auto-generated method stub
		return zoneMapper.updateZoneUnlockStatus(z_id);
	}

	@Override
	public List<Zone> selectAllParentZone() {
		// TODO Auto-generated method stub
		return zoneMapper.selectAllParentZone();
	}

	@Override
	public Integer updateZone(Zone zone) {
		// TODO Auto-generated method stub
		return zoneMapper.updateZone(zone);
	}

	@Override
	public Integer insertChildrenZone(Zone zone) {
		// TODO Auto-generated method stub
		return zoneMapper.insertChildrenZone(zone);
	}
	
}
