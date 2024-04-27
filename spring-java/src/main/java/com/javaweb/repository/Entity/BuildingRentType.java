package com.javaweb.repository.Entity;

public class BuildingRentType {
	private Long id;
	private Long buildingId;
	private Long rentTypeId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(Long buildingId) {
		this.buildingId = buildingId;
	}
	public Long getRentTypeId() {
		return rentTypeId;
	}
	public void setRentTypeId(Long rentTypeId) {
		this.rentTypeId = rentTypeId;
	}
	@Override
	public String toString() {
		return "BuildingRentType [id=" + id + ", buildingId=" + buildingId + ", rentTypeId=" + rentTypeId + "]";
	}
	
	
	
}
