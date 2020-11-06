package com.cdac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.dao.HospitalDao;
import com.cdac.dto.Hospital;

@Service
public class HospitalServiceImple implements HospitalService {
	
	@Autowired
	private HospitalDao hospitalDao;

	@Override
	public void addHospital(Hospital hospital) {
		hospitalDao.insertHospital(hospital);
	}

	@Override
	public void removeHospital(int patientId) {
		hospitalDao.deleteHospital(patientId);
	}

	@Override
	public Hospital findHospital(int patientId) {
		return hospitalDao.selectHospital(patientId);
	}

	@Override
	public void modifyHospital(Hospital hospital) {
		hospitalDao.updateHospital(hospital);
	}

	@Override
	public List<Hospital> selectAll(int userId) {
		return hospitalDao.selectAll(userId);
	}

}
