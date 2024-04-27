package com.javaweb.service;

import java.util.List;
import java.util.Map;

import com.javaweb.DTO.BuildingDTO;

public interface BuildingService {
	List<BuildingDTO> getAllBuilding();
	List<BuildingDTO> searchBuilding(Map<String, Object> params, List<String> code);
}
