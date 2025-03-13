import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { WelcomeComponent } from './welcome/welcome.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { AdminregistrationComponent } from './adminregistration/adminregistration.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { AddbloodComponent } from './addblood/addblood.component';
import { AdminavailabilityComponent } from './adminavailability/adminavailability.component';
import { AvailabilityComponent } from './availability/availability.component';
import { BlooddetailsComponent } from './blooddetails/blooddetails.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { DonationComponent } from './donation/donation.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { HomeComponent } from './home/home.component';
import { RequirementComponent } from './requirement/requirement.component';
import { UpdatebloodComponent } from './updateblood/updateblood.component';
import { UserregistrationComponent } from './userregistration/userregistration.component';

const routes: Routes = [
  {path:"", component:WelcomeComponent},
  {path:"adminlogin", component:AdminloginComponent},
  {path:"adminregistration", component:AdminregistrationComponent},
  {path:"userlogin",component:UserloginComponent},
  {path:"userregistration",component:UserregistrationComponent},
  {path:"home",component:HomeComponent},
  {path:"dashboard",component:DashboardComponent},
  {path:"availability",component:AvailabilityComponent},
  {path:"adminavailability",component:AdminavailabilityComponent},
  {path:"requirement",component:RequirementComponent},
  {path:"donation",component:DonationComponent},
  {path:"feedback",component:FeedbackComponent},
  {path:"addblood",component:AddbloodComponent},
  {path:"blooddetails/:baId",component:BlooddetailsComponent},
  {path:"updateblood/:baId",component:UpdatebloodComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
