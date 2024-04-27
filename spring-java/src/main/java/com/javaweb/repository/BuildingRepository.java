package com.javaweb.repository;

import java.util.List;
import java.util.Map;

import com.javaweb.repository.Entity.Building;

public interface BuildingRepository {
	List<Building> getAllBuilding();
	List<Building> searchBuilding(Map<String, Object> params, List<String> code);
}
