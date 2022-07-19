import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Doctor } from '../doctor';
import { DoctorService } from '../doctor.service';

@Component({
  selector: 'app-show-doctor',
  templateUrl: './show-doctor.component.html',
  styleUrls: ['./show-doctor.component.css']
})
export class ShowDoctorComponent implements OnInit {

  
  doctors:Doctor[]|undefined;
  doctor:Doctor=new Doctor();
  doctor1:Doctor=new Doctor();
  name:String|undefined;
  constructor(private doctorService:DoctorService) {}
  
  ngOnInit(): void {
    this.GetDoctors();
    
  }
  GetDoctors()
{
  this.doctorService.getDoctorsList().subscribe(data =>{
    this.doctors=data;
  });
}
  // Access formcontrols getter
  showDoctorDetails(){
    if(this.doctor.name){
      console.warn(this.doctor.name);
      this.doctorService.getDoctor(this.doctor.name).subscribe({
        next: (data)=>{
          console.warn(data);
          this.doctor1 = data;
        }
        
      })
    }
  }
}