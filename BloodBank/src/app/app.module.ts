import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdminregistrationComponent } from './adminregistration/adminregistration.component';
import { UserregistrationComponent } from './userregistration/userregistration.component';
import { HomeComponent } from './home/home.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { AvailabilityComponent } from './availability/availability.component';
import { RequirementComponent } from './requirement/requirement.component';
import { DonationComponent } from './donation/donation.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { AddbloodComponent } from './addblood/addblood.component';
import { UpdatebloodComponent } from './updateblood/updateblood.component';
import { BlooddetailsComponent } from './blooddetails/blooddetails.component';
import { AdminavailabilityComponent } from './adminavailability/adminavailability.component';
import {FormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';



@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
    UserloginComponent,
    AdminloginComponent,
    AdminregistrationComponent,
    UserregistrationComponent,
    HomeComponent,
    DashboardComponent,
    AvailabilityComponent,
    RequirementComponent,
    DonationComponent,
    HeaderComponent,
    FooterComponent,
    FeedbackComponent,
    AddbloodComponent,
    UpdatebloodComponent,
    BlooddetailsComponent,
    AdminavailabilityComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
