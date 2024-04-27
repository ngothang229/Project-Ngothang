package com.javaweb.repository.Impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import java.sql.Statement;

import com.javaweb.repository.BuildingRepository;
import com.javaweb.repository.Entity.Building;
import com.javaweb.utils.ConnectionUtils;
import com.javaweb.utils.NumberUtils;
import com.javaweb.utils.StringUtitls;

@Repository
public class BuildingRepositoryImpl implements BuildingRepository {

	@Override
	public List<Building> getAllBuilding() {
		String sql = "SELECT * FROM building";
		String where = " WHERE 1 = 1 ";
		sql += where;
		List<Building> list = new ArrayList<Building>();
		try {
			Connection conn = ConnectionUtils.getConnection();
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				Building building = new Building();
				building.setId(rs.getLong("id"));
				building.setName(rs.getString("name"));
				building.setDistricId(rs.getLong("districtid"));
				building.setStreet(rs.getString("street"));
				building.setWard(rs.getString("ward"));
				building.setStructure(rs.getString("structure"));
				building.setNumberOfbasement(rs.getInt("numberofbasement"));
				building.setFloorArea(rs.getInt("floorarea"));
				building.setManagerName(rs.getString("managername"));
				building.setManagerPhoneNumber(rs.getString("managerphonenumber"));
				building.setServiceFee(rs.getString("servicefee"));
				building.setRentPriceDescription(rs.getString("rentpricedescription"));
				list.add(building);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Connect database failed!!!");
		}
		for (Building building : list) {
			System.out.println(building);
		}

		return list;
	}

	public void queryJoin(Map<String, Object> params, List<String> code, StringBuilder sql) {
		String rentAreaFrom = (String) params.get("areaFrom");
		String rentAreaTo = (String) params.get("areaTo");
		if (rentAreaFrom != null && !rentAreaFrom.equals("") || rentAreaTo != null && rentAreaTo.equals("")) {
			sql.append(" JOIN rentarea r ON r.buildingid = b.id ");
		}
		String staffId = (String) params.get("staffId");
		if (staffId != null && !staffId.equals("")) {
			sql.append("JOIN assignmentbuilding asm  ON asm.buildingid = b.id ");
		}
		if (code != null && !code.isEmpty()) {
			sql.append(
					" JOIN buildingrenttype brt ON b.id = brt.buildingid JOIN renttype rt ON brt.renttypeid = rt.id");
		}

	}

	public void queryWhereNomal(Map<String, Object> params, StringBuilder where) {
		for (Map.Entry<String, Object> item : params.entrySet()) {
			if (!item.getKey().equals("staffId") && !item.getKey().equals("code") && !item.getKey().startsWith("area")
					&& !item.getKey().startsWith("rentPrice")) {
				String data = item.getValue().toString();
				if (StringUtitls.checkString(data)) {
					if (NumberUtils.checkNumber(data)) {
						where.append(" AND b." + item.getKey().toLowerCase() + " =  " + data);
					} else {
						where.append(" AND b." + item.getKey().toLowerCase() + " like '%" + data + "%' ");
					}
				}
			}
		}
	}

	@Override
	public List<Building> searchBuilding(Map<String, Object> params, List<String> code) {
		StringBuilder sql = new StringBuilder("SELECT DISTINCT building.*\r\n" + "FROM building b\r\n");
		StringBuilder where = new StringBuilder("WHERE 1 = 1 ");
		queryJoin(params, code, sql);
		queryWhereNomal(params, where);
		List<Building> list = new ArrayList<>();
		try {
			Connection conn = ConnectionUtils.getConnection();
			Statement stm = conn.createStatement();
			ResultSet rs = stm.executeQuery(sql.toString());
			while (rs.next()) {
				Building building = new Building();
				building.setId(rs.getLong("id"));
				building.setName(rs.getString("name"));
				building.setDistricId(rs.getLong("districtid"));
				building.setStreet(rs.getString("street"));
				building.setWard(rs.getString("ward"));
				building.setStructure(rs.getString("structure"));
				building.setNumberOfbasement(rs.getInt("numberofbasement"));
				building.setFloorArea(rs.getInt("floorarea"));
				building.setManagerName(rs.getString("managername"));
				building.setManagerPhoneNumber(rs.getString("managerphonenumber"));
				building.setServiceFee(rs.getString("servicefee"));
				building.setRentPriceDescription(rs.getString("rentpricedescription"));
				list.add(building);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Connect database failed!!!");
		}
		for (Building building : list) {
			System.out.println(building);
			System.out.println("");
		}

		return list;
	}

}
