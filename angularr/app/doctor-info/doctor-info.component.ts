import { Component, OnInit } from '@angular/core';
import {Doctor} from '../doctor';
import { DoctorService } from '../doctor.service';
@Component({
  selector: 'app-doctor-info',
  templateUrl: './doctor-info.component.html',
  styleUrls: ['./doctor-info.component.css']
})
export class DoctorInfoComponent implements OnInit {

  doctors:Doctor[]|undefined;
  constructor(private doctorService:DoctorService) { }

  ngOnInit(): void {
    this.GetDoctors();
    
  }
GetDoctors()
{
  this.doctorService.getDoctorsList().subscribe(data =>{
    this.doctors=data;
  });
}
}
