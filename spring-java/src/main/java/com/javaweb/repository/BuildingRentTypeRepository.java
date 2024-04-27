package com.javaweb.repository;

import java.util.List;

import com.javaweb.repository.Entity.BuildingRentType;

public interface BuildingRentTypeRepository {
	List<BuildingRentType> getBuildingRentTypeByBuildingId(Long id);

}
