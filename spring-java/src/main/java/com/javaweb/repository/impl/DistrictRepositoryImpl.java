package com.javaweb.repository.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.DistrictRepository;
import com.javaweb.repository.Entity.District;
import com.javaweb.utils.ConnectionUtils;

@Repository
public class DistrictRepositoryImpl implements DistrictRepository {
	
	
	@Override
	public District getDistricByID(Long id) {
	    String sql = "SELECT * FROM district WHERE id = ?";
	    District district = null;
	    try (Connection conn = ConnectionUtils.getConnection();
	         PreparedStatement stm = conn.prepareStatement(sql)) {
	        stm.setLong(1, id);
	        try (ResultSet rs = stm.executeQuery()) {
	            if (rs.next()) {
	                district = new District();
	                district.setId(rs.getLong("id"));
	                district.setCode(rs.getString("code"));
	                district.setName(rs.getString("name"));
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return district;
	}


}
