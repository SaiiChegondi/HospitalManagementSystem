package com.hospital.info.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class Doctor {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	private String gender;
	private String specialist;
	private int count=0;
	
	
	@OneToMany(fetch=FetchType.LAZY)
	private List<Patient> patients;
	public Doctor()
	{
		
	}
	public Doctor(String name, int age, String gender, String specialist) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialist = specialist;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void addPatient(Patient patient)
	{
		this.patients.add(patient);
	}
	
}
