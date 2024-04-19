package com.javaweb.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.entity.BuildingEntity;
import com.javaweb.utils.ConnectionUtil;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository {


	@Override
	public List<BuildingEntity> findAll(String name, Long numberOfBasement) {
		String sql = "SELECT * FROM building";
		String where = " where 1 = 1 ";
		if (name != null && !name.equals("")) {
			where += "AND name LIKE '%" + name + "%' ";
		}
		if (numberOfBasement != null) {
			where += "AND numberofbasement = " + numberOfBasement;
		}
		sql += where;
		List<BuildingEntity> list = new ArrayList<BuildingEntity>();
		try (Connection conn = ConnectionUtil.getConnection();
				Statement stm = conn.createStatement();
				ResultSet rs = stm.executeQuery(sql)) {
			while (rs.next()) {
				BuildingEntity building = new BuildingEntity();
				building.setName(rs.getString("name"));
				building.setDistrictId(rs.getLong("districtId"));
				building.setStreet(rs.getString("street"));
				building.setWard(rs.getString("ward"));
				list.add(building);
			}
			System.out.print("Connect database Successfully!!!");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Connect database failed!!!");
		}
		System.out.println(list);
		return list;

	}

}
