package com.cdac.cntr;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cdac.dto.Hospital;
import com.cdac.dto.User;
import com.cdac.service.HospitalService;

@Controller
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@RequestMapping(value = "/prep_hospital_add_form.htm",method = RequestMethod.GET)
	public String prepHospitalAddForm(ModelMap map) {
		map.put("hospital", new Hospital());
		return "hospital_add_form";
	}
	
	@RequestMapping(value = "/hospital_add.htm",method = RequestMethod.POST)
	public String hospitalAdd(Hospital hospital,HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		hospital.setUserId(userId); 
		hospitalService.addHospital(hospital);
		return "home";
	}
	
	@RequestMapping(value = "/patient_list.htm",method = RequestMethod.GET)
	public String allHospital(ModelMap map,HttpSession session) {
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<Hospital> li = hospitalService.selectAll(userId);
		map.put("hspList", li);
		return "patient_list";
	}
	
	@RequestMapping(value = "/hospital_delete.htm",method = RequestMethod.GET)
	public String hospitalDelete(@RequestParam int patientId,ModelMap map,HttpSession session) {
		
		hospitalService.removeHospital(patientId); 
		
		int userId = ((User)session.getAttribute("user")).getUserId();
		List<Hospital> li = hospitalService.selectAll(userId);
		map.put("hspList", li);
		return "patient_list";
	}
	
	@RequestMapping(value = "/hospital_update_form.htm",method = RequestMethod.GET)
	public String hospitalUpdateForm(@RequestParam int patientId,ModelMap map) {
		
		Hospital hsp = hospitalService.findHospital(patientId);
		map.put("hospital", hsp);
		
		return "hospital_update_form";
	}
	
	@RequestMapping(value = "/hospital_update.htm",method = RequestMethod.POST)
	public String hospitalUpdate(Hospital hospital,ModelMap map,HttpSession session) {
		
		int userId = ((User)session.getAttribute("user")).getUserId();
		hospital.setUserId(userId);
		hospitalService.modifyHospital(hospital);
			
		List<Hospital> li = hospitalService.selectAll(userId);
		map.put("hspList", li);
		return "patient_list";
	}
	
}
