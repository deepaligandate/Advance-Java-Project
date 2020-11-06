package com.cdac.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hospital")
public class Hospital {
	@Id
	@Column(name = "patient_id")
	@GeneratedValue
	private int patientId;
	@Column(name = "patient_name")
	private String patientName;
	private float contactno;
	@Column(name = "admit_date")
	private String admitDate;
	private int userId;
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Hospital(int patientId) {
		super();
		this.patientId = patientId;
	}

	public int getPatientId() {
		return patientId;
	}
	public void setpatientName(int patientName) {
		this.patientId = patientId;
	}
	public String getpatientName() {
		return patientName;
	}
	public void setpatientName(String patientName) {
		this.patientName = patientName;
	}
	public float getcontactno() {
		return contactno;
	}
	public void setcontactno(float contactno) {
		this.contactno = contactno;
	}
	public String getadmitDate() {
		return admitDate;
	}
	public void setadmitDate(String admitDate) {
		this.admitDate = admitDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
