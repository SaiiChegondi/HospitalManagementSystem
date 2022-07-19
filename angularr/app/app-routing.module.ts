import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreateDoctorComponent } from './create-doctor/create-doctor.component';
import { CreatePatientComponent } from './create-patient/create-patient.component';
import { DoctorInfoComponent } from './doctor-info/doctor-info.component';
import { HomeComponent } from './home/home.component';
import { PatientInfoComponent } from './patient-info/patient-info.component';
import { ShowDoctorComponent } from './show-doctor/show-doctor.component';

const routes: Routes = [{path:'doctors',component:DoctorInfoComponent},
{path:'home',component:HomeComponent},
{path:'create-doctor',component:CreateDoctorComponent},
{path:'show-doctor',component:ShowDoctorComponent},
{path:'create-patient',component:CreatePatientComponent},
{path:'patients',component:PatientInfoComponent},
{path:'',redirectTo:'home',pathMatch:'full'}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
