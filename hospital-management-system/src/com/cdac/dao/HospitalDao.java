package com.cdac.dao;

import java.util.List;

import com.cdac.dto.Hospital;

public interface HospitalDao {
	void insertHospital(Hospital hospital);
	void deleteHospital(int hospitalId);
	Hospital selectHospital(int hospitalId);
	void updateHospital(Hospital hospital);
	List<Hospital> selectAll(int userId);
}
