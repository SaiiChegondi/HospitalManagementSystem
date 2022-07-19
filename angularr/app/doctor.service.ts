import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Doctor} from './doctor';
import { Observable } from 'rxjs';
import { Patient } from './patient';

@Injectable({
  providedIn: 'root'
})
export class DoctorService {
  private baseUrl="http://localhost:8080/doctors";
  constructor(private httpClient:HttpClient) { }
  getDoctorsList():Observable<Doctor[]>
  {
     return this.httpClient.get<Doctor[]>(`${this.baseUrl}`);
  }
  createDoctor(doctor:Doctor):Observable<Object>
  {
    return this.httpClient.post(`${this.baseUrl}`,doctor);
  }

  createPatient(patient:Patient):Observable<Object>
  {
return this.httpClient.post(`${"http://localhost:8080/patients"}`,patient);
  }
  getDoctor(name:string):Observable<Doctor>

  {
    let Url="http://localhost:8080/doctors"
    return this.httpClient.get<Doctor>(`${Url}/${name}`);
  }
  getPatient(id:number):Observable<Patient>
  {
    return this.httpClient.get<Patient>(`${"http://localhost:8080/patients"}/${id}`);
  }
}
