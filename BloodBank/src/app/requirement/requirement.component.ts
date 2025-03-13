import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BloodbankService } from '../bloodbank.service';
import { Bloodrequirement } from '../bloodrequirement';

@Component({
  selector: 'app-requirement',
  templateUrl: './requirement.component.html',
  styleUrls: ['./requirement.component.css']
})
export class RequirementComponent implements OnInit {
  bloodrequirement=new Bloodrequirement();


  constructor(private bloodBankService:BloodbankService,
    private router:Router) { }

  ngOnInit(): void {
  }

  bloodRequirementMethod(){
    return this.bloodBankService.bloodrequirementbackend(this.bloodrequirement).subscribe(
      data=>{
        console.log("Your blood requirements are posted successfully");
        this.router.navigate(['home']);
      },
      error=>{
        console.log("error occurred");
      }
    )
  }

}
