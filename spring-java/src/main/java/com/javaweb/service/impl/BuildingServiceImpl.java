package com.javaweb.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaweb.DTO.BuildingDTO;
import com.javaweb.repository.BuildingRentTypeRepository;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.DistrictRepository;
import com.javaweb.repository.RentAreaRepository;
import com.javaweb.repository.RentTypeRepository;
import com.javaweb.repository.Entity.Building;
import com.javaweb.repository.Entity.BuildingRentType;
import com.javaweb.repository.Entity.District;
import com.javaweb.repository.Entity.RentArea;
import com.javaweb.service.BuildingService;

@Service
public class BuildingServiceImpl implements BuildingService {

	@Autowired
	private BuildingRepository buildingRepository;
	@Autowired
	private DistrictRepository districtRepository;
	@Autowired
	private RentAreaRepository rentAreaRepository;
	@Autowired
	private BuildingRentTypeRepository buildingRentTypeRepository;
	@Autowired
	private RentTypeRepository rentTypeRepository;

	@Override
	public List<BuildingDTO> getAllBuilding() {
		List<Building> building = buildingRepository.getAllBuilding();
		List<BuildingDTO> result = new ArrayList<BuildingDTO>();

		for (Building item : building) {
			BuildingDTO bDTO = new BuildingDTO();
			bDTO.setName(item.getName());
			Long districtId = item.getDistricId();
			District district = districtRepository.getDistricByID(districtId);
			bDTO.setAddress(item.getStreet() + " " + item.getWard() + " " + district.getName());
			bDTO.setManagerName(item.getManagerName());
			bDTO.setManagerPhoneNumber(item.getManagerPhoneNumber());
			bDTO.setNumberOfBasement(item.getNumberOfbasement());
			bDTO.setFloorarea(item.getFloorArea());
			Long buildingId = item.getId();
			List<RentArea> listRentArea = rentAreaRepository.getAllAreaById(buildingId);
			String rentArea = "";
			for (RentArea area : listRentArea) {
				if (!rentArea.equals("")) {
					rentArea += ", ";
				}
				rentArea += area.getValue();
			}
			bDTO.setRentArea(rentArea);
			bDTO.setServiceFee(item.getServiceFee());
			result.add(bDTO);
		}
		return result;
	}

	@Override
	public List<BuildingDTO> searchBuilding(Map<String, Object> params, List<String> code) {
		List<Building> building = buildingRepository.searchBuilding(params, code);
		List<BuildingDTO> result = new ArrayList<BuildingDTO>();
		for (Building item : building) {
			BuildingDTO bDTO = new BuildingDTO();
			bDTO.setName(item.getName());
			Long districtId = item.getDistricId();
			District district = districtRepository.getDistricByID(districtId);
			bDTO.setAddress(item.getStreet() + " " + item.getWard() + " " + district.getName());
			bDTO.setManagerName(item.getManagerName());
			bDTO.setManagerPhoneNumber(item.getManagerPhoneNumber());
			bDTO.setNumberOfBasement(item.getNumberOfbasement());
			bDTO.setFloorarea(item.getFloorArea());
			Long buildingId = item.getId();
			List<RentArea> listRentArea = rentAreaRepository.getAllAreaById(buildingId);
			String rentArea = "";
			for (RentArea area : listRentArea) {
				if (!rentArea.equals("")) {
					rentArea += ", ";
				}
				rentArea += area.getValue();
			}
			List<BuildingRentType> listBuildingRentType = buildingRentTypeRepository.getBuildingRentTypeByBuildingId(buildingId);
			String rentType = "";
			for (BuildingRentType buildingRentType : listBuildingRentType) {
				if (!rentType.equals("")) {
					rentType += ", ";
				}
				rentType += rentTypeRepository.getRentTypeById(buildingRentType.getRentTypeId()).getName();
			}
			bDTO.setRentType(rentType);
			bDTO.setRentArea(rentArea);
			bDTO.setServiceFee(item.getServiceFee());
			result.add(bDTO);
		}
		return result;
	}

}
