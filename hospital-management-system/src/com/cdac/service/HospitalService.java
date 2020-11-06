package com.cdac.service;

import java.util.List;

import com.cdac.dto.Hospital;

public interface HospitalService {
	void addHospital(Hospital hospital);
	void removeHospital(int patientId);
	Hospital findHospital(int patientId);
	void modifyHospital(Hospital hospital);
	List<Hospital> selectAll(int userId);
}
