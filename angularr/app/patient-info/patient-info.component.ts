import { Component, OnInit } from '@angular/core';
import { DoctorService } from '../doctor.service';
import { Patient } from '../patient';

@Component({
  selector: 'app-patient-info',
  templateUrl: './patient-info.component.html',
  styleUrls: ['./patient-info.component.css']
})
export class PatientInfoComponent implements OnInit {
  patient:Patient=new Patient();
  id:any;
  errorMessage:any;

  constructor(private doctorService:DoctorService) { }

  ngOnInit(): void {
    
  }
  showPatientInfo(){
    if(this.id == null){
    
    }
    else if(this.id){
      this.doctorService.getPatient(this.id).subscribe({
        next : (data)=>{
          this.patient = data;
        },
        error : (e)=>{
          
          this.errorMessage = " Id not present in database";
          alert(this.errorMessage);
        }

      });
    }
    }
}
