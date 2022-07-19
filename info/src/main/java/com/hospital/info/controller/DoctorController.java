package com.hospital.info.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.info.entity.Doctor;
import com.hospital.info.exception.ResourceNotFoundException;
import com.hospital.info.repository.DoctorRepository;

@CrossOrigin(origins="*")
@RestController
public class DoctorController {

	@Autowired
	private DoctorRepository repo;
	
	@GetMapping("/doctors")
	public List<Doctor> DoctorDetails()
	{
		return repo.findAll();
	}
	
	@PostMapping("/doctors")
	public void CreateDoctor(@RequestBody Doctor doctor )
	{
		repo.save(doctor);
	}
	
	@GetMapping("/doctors/{name}")
	public ResponseEntity<Doctor> getbyname(@PathVariable String name)
	{
		int id =0;
		List<Doctor> doctors=repo.findAll();
		
		for(Doctor doct:doctors)
		{
			if(doct.getName().compareTo(name)==0)
			{
				id=doct.getId();
			}
		}
		
		Doctor doc=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("not found"));
		return ResponseEntity.ok(doc);
	}
	
}
