import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Doctor } from '../doctor';
import { DoctorService } from '../doctor.service';
import { Patient } from '../patient';

@Component({
  selector: 'app-create-patient',
  templateUrl: './create-patient.component.html',
  styleUrls: ['./create-patient.component.css']
})
export class CreatePatientComponent implements OnInit {

  patient:Patient=new Patient();
  doctors:Doctor[]|undefined;
  constructor(private doctorService:DoctorService,private router:Router) { }
 

  ngOnInit(): void {
    this.GetDoctors();
    
  }
    savePatient()
    {
      this.doctorService.createPatient(this.patient).subscribe(data=>{
        console.log(data);
        this.goToPatients();
      },
      error => console.log(error));
    }
    goToPatients()
  {
    this.router.navigate(['/patients']);
  }

  GetDoctors()
{
  this.doctorService.getDoctorsList().subscribe(data =>{
    this.doctors=data;
  });
}

  }
  