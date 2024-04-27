package com.javaweb.api;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaweb.DTO.BuildingDTO;
import com.javaweb.service.BuildingService;

@RestController
public class BuildingAPI {
	
	@Autowired
	private BuildingService buildingService;
	
	@GetMapping(value = "/api/building")
	public List<BuildingDTO> getAllBuilding(){
		List<BuildingDTO> list = buildingService.getAllBuilding();
		return list;
		
	}
	
	@GetMapping(value = "/api/building/search")
	public List<BuildingDTO> findBuilding(@RequestParam Map<String, Object> params, @RequestParam(value = "code", required = false) List<String> code){
		List<BuildingDTO> list = buildingService.searchBuilding(params, code);
		return list;
	}
	

}
