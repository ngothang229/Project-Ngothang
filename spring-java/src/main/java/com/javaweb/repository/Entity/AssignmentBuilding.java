package com.javaweb.repository.Entity;

public class AssignmentBuilding {
	
	private Long id;
	private Long staffId;
	private Long buildingId;
	private String createdDate;
	private String modifiedDate;
	private String creaetdBy;
	private String modifiedBy;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getStaffId() {
		return staffId;
	}
	public void setStaffId(Long staffId) {
		this.staffId = staffId;
	}
	public Long getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(Long buildingId) {
		this.buildingId = buildingId;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getCreaetdBy() {
		return creaetdBy;
	}
	public void setCreaetdBy(String creaetdBy) {
		this.creaetdBy = creaetdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	@Override
	public String toString() {
		return "AssignmentBuilding [id=" + id + ", staffId=" + staffId + ", buildingId=" + buildingId + ", createdDate="
				+ createdDate + ", modifiedDate=" + modifiedDate + ", creaetdBy=" + creaetdBy + ", modifiedBy="
				+ modifiedBy + "]";
	}
	
	
	

}
