package com.ysd.videosite.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ysd.videosite.entity.Zone;
import com.ysd.videosite.service.ZoneService;

@RestController
public class ZoneController {
	
	@Autowired
	private ZoneService zoneService;
	
	@PostMapping("/initZone")
	public List<HashMap<String,Object>> initZone() {
		return zoneService.selectAllZone();
	}
	
	@PostMapping("/autoComplete")
	public List<Zone> autoComplete(String z_name) {
		return zoneService.selectAutoCompleteZone(z_name);
	}
	
	@PostMapping("/insertParentZone")
	public Integer insertParentZone(Zone zone) {
		return zoneService.insertNewParentZone(zone);
	}
	
	@PostMapping("/lockZone")
	public Integer lockZone(@RequestParam(value = "array") String array) {
		return zoneService.updateZoneLockStatus(array);
	}
	
	@PostMapping("/unlockZone")
	public Integer unlockZone(Integer z_id) {
		return zoneService.updateZoneUnlockStatus(z_id);
	}
	
	@PostMapping("/getParentNode")
	public List<Zone> getParentNode() {
		return zoneService.selectAllParentZone();
	}
	
	@PostMapping("/editZone")
	public Integer editZone(Zone zone) {
		return zoneService.updateZone(zone);
	}
	
	@PostMapping("/insertChildrenZone")
	public Integer insertChildrenZone(Zone zone) {
		return zoneService.insertChildrenZone(zone);
	}
	
}
