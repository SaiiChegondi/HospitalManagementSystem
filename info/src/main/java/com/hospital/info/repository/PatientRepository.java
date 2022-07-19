package com.hospital.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.info.entity.Doctor;
import com.hospital.info.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer>{

}
