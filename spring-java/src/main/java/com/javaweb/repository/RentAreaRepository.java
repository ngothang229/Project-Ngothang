package com.javaweb.repository;


import java.util.List;

import com.javaweb.repository.Entity.RentArea;
public interface RentAreaRepository {
	List<RentArea> getAllAreaById(Long id);

}
