package com.hospital.info.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.info.entity.Doctor;
import com.hospital.info.entity.Patient;
import com.hospital.info.exception.ResourceNotFoundException;
import com.hospital.info.repository.DoctorRepository;
import com.hospital.info.repository.PatientRepository;

@CrossOrigin(origins="*")
@RestController
public class PatientController {
	@Autowired
	private PatientRepository repo1;
	
	@Autowired
	private DoctorRepository repo;
	
	@GetMapping("/patients")
	public List<Patient> getAllPatients()
	{
		return repo1.findAll();
	}
	
	
	
	@PostMapping("/patients")
	public void createpatient(@RequestBody Patient patient)
	{
		repo1.save(patient);
	}
	
	
    @GetMapping("/patients/{id}")
	public ResponseEntity<Patient> getbyid(@PathVariable int id)
	{
	    Patient pat=repo1.findById(id).orElseThrow(()->new ResourceNotFoundException("not found"));
		return ResponseEntity.ok(pat);
	}
}
