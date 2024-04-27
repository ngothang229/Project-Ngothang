package com.javaweb.repository.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.RentAreaRepository;
import com.javaweb.repository.Entity.RentArea;
import com.javaweb.utils.ConnectionUtils;

@Repository
public class RentAreaRepositoryImpl implements RentAreaRepository {

	@Override
	public List<RentArea> getAllAreaById(Long id) {
		String sql = "SELECT * FROM rentarea WHERE buildingid = ?";
		List<RentArea> result = new ArrayList<RentArea>();
		try (Connection conn = ConnectionUtils.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);){
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				RentArea rentArea = new RentArea();
				rentArea.setId(rs.getLong("id"));
				rentArea.setValue(rs.getInt("value"));
				rentArea.setBuildingId(rs.getLong("buildingid"));
				rentArea.setCreatedDate(rs.getString("createddate"));
				rentArea.setModifiedDate(rs.getString("modifieddate"));
				rentArea.setCreatedBy(rs.getString("createdby"));
				rentArea.setModifiedBy(rs.getString("modifiedby"));
				result.add(rentArea);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
