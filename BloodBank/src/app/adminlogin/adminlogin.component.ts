import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Admin } from '../admin';
import { BloodbankService } from '../bloodbank.service';

@Component({
  selector: 'app-adminlogin',
  templateUrl: './adminlogin.component.html',
  styleUrls: ['./adminlogin.component.css']
})
export class AdminloginComponent implements OnInit {
  admin=new Admin();
  message='';


  constructor(private bloodBankService:BloodbankService, private router:Router) { }

  ngOnInit(): void {
  }

  adminlogin(){
    return this.bloodBankService.adminloginbackend(this.admin).subscribe(
      data=>{
        console.log("response received");
        this.router.navigate(["adminavailability"]);
      },
      error=>{
        console.log("exception occured");
        this.message="Invalid Credentials";
      }
    )
  }
}
