package com.javaweb.repository.Entity;

public class Building {
	
	private Long id;
	private String name;
	private String street;
	private String ward;
	private Long districId;
	private String structure;
	private int numberOfbasement;
	private int floorArea;
	private String direction;
	private String level;
	private int rentPrice;
	private String rentPriceDescription;
	private String serviceFee;
	private String carFee;
	private String motorbikeFee;
	private String overtimeFee;
	private String waterFee;
	private String electricityFee;
	private String deposit;
	private String payment;
	private String rentTime;
	private String decorationTime;
	private String brokerageFee;
	private String note;
	private String linkOfBuilding;
	private String map;
	private String image;
	private String createDate;
	private String modifieddate;
	private String createdBy;
	private String modifiedBy;
	private String managerName;
	private String managerPhoneNumber;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	public Long getDistricId() {
		return districId;
	}
	public void setDistricId(Long districId) {
		this.districId = districId;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	public int getNumberOfbasement() {
		return numberOfbasement;
	}
	public void setNumberOfbasement(int numberOfbasement) {
		this.numberOfbasement = numberOfbasement;
	}
	public int getFloorArea() {
		return floorArea;
	}
	public void setFloorArea(int floorArea) {
		this.floorArea = floorArea;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getRentPrice() {
		return rentPrice;
	}
	public void setRentPrice(int rentPrice) {
		this.rentPrice = rentPrice;
	}
	public String getRentPriceDescription() {
		return rentPriceDescription;
	}
	public void setRentPriceDescription(String rentPriceDescription) {
		this.rentPriceDescription = rentPriceDescription;
	}
	public String getServiceFee() {
		return serviceFee;
	}
	public void setServiceFee(String serviceFee) {
		this.serviceFee = serviceFee;
	}
	public String getCarFee() {
		return carFee;
	}
	public void setCarFee(String carFee) {
		this.carFee = carFee;
	}
	public String getMotorbikeFee() {
		return motorbikeFee;
	}
	public void setMotorbikeFee(String motorbikeFee) {
		this.motorbikeFee = motorbikeFee;
	}
	public String getOvertimeFee() {
		return overtimeFee;
	}
	public void setOvertimeFee(String overtimeFee) {
		this.overtimeFee = overtimeFee;
	}
	public String getWaterFee() {
		return waterFee;
	}
	public void setWaterFee(String waterFee) {
		this.waterFee = waterFee;
	}
	public String getElectricityFee() {
		return electricityFee;
	}
	public void setElectricityFee(String electricityFee) {
		this.electricityFee = electricityFee;
	}
	public String getDeposit() {
		return deposit;
	}
	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	public String getRentTime() {
		return rentTime;
	}
	public void setRentTime(String rentTime) {
		this.rentTime = rentTime;
	}
	public String getDecorationTime() {
		return decorationTime;
	}
	public void setDecorationTime(String decorationTime) {
		this.decorationTime = decorationTime;
	}
	public String getBrokerageFee() {
		return brokerageFee;
	}
	public void setBrokerageFee(String brokerageFee) {
		this.brokerageFee = brokerageFee;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getLinkOfBuilding() {
		return linkOfBuilding;
	}
	public void setLinkOfBuilding(String linkOfBuilding) {
		this.linkOfBuilding = linkOfBuilding;
	}
	public String getMap() {
		return map;
	}
	public void setMap(String map) {
		this.map = map;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(String modifieddate) {
		this.modifieddate = modifieddate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerPhoneNumber() {
		return managerPhoneNumber;
	}
	public void setManagerPhoneNumber(String managerPhoneNumber) {
		this.managerPhoneNumber = managerPhoneNumber;
	}
	@Override
	public String toString() {
		return "Building [id=" + id + ", name=" + name + ", street=" + street + ", ward=" + ward + ", districId="
				+ districId + ", structure=" + structure + ", numberOfbasement=" + numberOfbasement + ", floorArea="
				+ floorArea + ", direction=" + direction + ", level=" + level + ", rentPrice=" + rentPrice
				+ ", rentPriceDescription=" + rentPriceDescription + ", serviceFee=" + serviceFee + ", carFee=" + carFee
				+ ", motorbikeFee=" + motorbikeFee + ", overtimeFee=" + overtimeFee + ", waterFee=" + waterFee
				+ ", electricityFee=" + electricityFee + ", deposit=" + deposit + ", payment=" + payment + ", rentTime="
				+ rentTime + ", decorationTime=" + decorationTime + ", brokerageFee=" + brokerageFee + ", note=" + note
				+ ", linkOfBuilding=" + linkOfBuilding + ", map=" + map + ", image=" + image + ", createDate="
				+ createDate + ", modifieddate=" + modifieddate + ", createdBy=" + createdBy + ", modifiedBy="
				+ modifiedBy + ", managerName=" + managerName + ", managerPhoneNumber=" + managerPhoneNumber + "]";
	}
	
	
	
	
	
}
