package com.hospital.info;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import javax.transaction.Transactional;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.hospital.info.controller.DoctorController;
import com.hospital.info.controller.PatientController;
import com.hospital.info.entity.Doctor;
import com.hospital.info.entity.Patient;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InfoApplicationTests 
{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    PatientController patientController;

    @Autowired
     DoctorController doctorController;


    @Test
    public void test(){
        assertTrue(true);
    }
    @Test
    public void  showPatientInformationTest(){
        ResponseEntity<Patient> patient =patientController.getbyid(6);
        assertEquals(((Logger) patient).getName(),"raam");
    }

    @Test
    public void showDoctorInformationTest(){
        ResponseEntity<Doctor> doc = doctorController.getbyname("saii chegondi"); 
      
         logger.info(doc.toString());
    }

    @Test
    @DirtiesContext
    @Transactional
    public void saveDoctorInformation(){
        Doctor doc = new Doctor("hello", 12, "male", "ent");
        doctorController.CreateDoctor(doc);
        logger.info(doc.toString());
        
    }

    @Test
    @DirtiesContext
    @Transactional
    public void savePatientInformation(){
        Patient patient = new Patient(1001,"hello", 30,LocalDate.now(), "male", "xyz","saii chegondi");
        patientController.createpatient(patient);
        logger.info(patient.toString());
    }
}
