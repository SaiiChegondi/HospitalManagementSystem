package com.hospital.info.entity;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Patient {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	
	private LocalDate dateofvisit;
	private String gender;
	private String prescription;
	
	private String doctorVisited;
	public Patient()
	{	
	}

	public Patient(int id, String name, int age, LocalDate dateofvisit, String gender, String prescription,
			String doctorVisited) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.dateofvisit = dateofvisit;
		this.gender = gender;
		this.prescription = prescription;
		this.doctorVisited = doctorVisited;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getPrescription() {
		return prescription;
	}




	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}




	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDateofvisit(LocalDate dateofvisit) {
		this.dateofvisit = dateofvisit;
	}

	public void setDoctorVisited(String doctorVisited) {
		this.doctorVisited = doctorVisited;
	}

	public LocalDate getDateofvisit() {
		return dateofvisit;
	}

	public String getDoctorVisited() {
		return doctorVisited;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

}
