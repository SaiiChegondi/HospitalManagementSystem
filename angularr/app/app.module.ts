import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DoctorInfoComponent } from './doctor-info/doctor-info.component';
import { CreateDoctorComponent } from './create-doctor/create-doctor.component';
import { ShowDoctorComponent } from './show-doctor/show-doctor.component';
import { CreatePatientComponent } from './create-patient/create-patient.component';
import { PatientInfoComponent } from './patient-info/patient-info.component';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    DoctorInfoComponent,
    CreateDoctorComponent,
    ShowDoctorComponent,
    CreatePatientComponent,
    PatientInfoComponent,
    HomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
