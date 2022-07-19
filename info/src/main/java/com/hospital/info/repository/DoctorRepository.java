package com.hospital.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hospital.info.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Integer>{

}
