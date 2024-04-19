package com.javaweb.api;

import com.javaweb.DTO.BuildingDTO;
import com.javaweb.customeexception.FieldRequireException;
import com.javaweb.service.BuildingService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BuildingAPI {

	@Autowired
	private BuildingService buildingService;
	
	@GetMapping(value = "/api/building")
	@ResponseBody
	public List<BuildingDTO> findBuilding(@RequestParam(value = "name", required = false) String name,
			@RequestParam(value = "numberofbasement", required = false) Long numberOfBasement) {
		
		List<BuildingDTO> result = buildingService.findAll(name, numberOfBasement);
		return result;
	}

	public void validateData(BuildingDTO building) {
		
	}

	@PostMapping(value = "/api/building")
	@ResponseBody
	public BuildingDTO createBuilding(@RequestBody BuildingDTO building) {
		return null;
	}

	@DeleteMapping(value = "/api/building/{ids}/{name}")
	public void deleteBuilding(@PathVariable long[] ids, @PathVariable String name) {

	}
}
