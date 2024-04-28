package com.javaweb.repository.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.BuildingRentTypeRepository;
import com.javaweb.repository.Entity.BuildingRentType;
import com.javaweb.utils.ConnectionUtils;

@Repository
public class BuildingRentTypeRepositoryImpl implements BuildingRentTypeRepository {

	@Override
	public List<BuildingRentType> getBuildingRentTypeByBuildingId(Long id) {
		
		String sql = "SELECT * FROM buildingrenttype WHERE buildingid = ?";
		List<BuildingRentType> result = new ArrayList<BuildingRentType>();
		try {
			Connection conn = ConnectionUtils.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				BuildingRentType buildingRentType = new BuildingRentType();
				buildingRentType.setId(rs.getLong("id"));
				buildingRentType.setBuildingId(rs.getLong("buildingid"));
				buildingRentType.setRentTypeId(rs.getLong("renttypeid"));
				result.add(buildingRentType);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	
}
