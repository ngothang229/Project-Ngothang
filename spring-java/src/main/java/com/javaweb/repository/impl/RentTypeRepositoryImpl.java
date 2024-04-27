package com.javaweb.repository.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.javaweb.repository.RentTypeRepository;
import com.javaweb.repository.Entity.RentType;
import com.javaweb.utils.ConnectionUtils;

@Repository
public class RentTypeRepositoryImpl implements RentTypeRepository{

	@Override
	public RentType getRentTypeById(Long id) {
		String sql = "SELECT * FROM renttype WHERE id = ?";
		try {
			Connection conn = ConnectionUtils.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				RentType rentType = new RentType();
				rentType.setId(rs.getLong("id"));
				rentType.setCode(rs.getString("code"));
				rentType.setName(rs.getString("name"));
				return rentType;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
