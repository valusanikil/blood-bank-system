import { Component, OnInit } from '@angular/core';
import { Admin } from '../admin';
import { BloodbankService } from '../bloodbank.service';

@Component({
  selector: 'app-adminregistration',
  templateUrl: './adminregistration.component.html',
  styleUrls: ['./adminregistration.component.css']
})
export class AdminregistrationComponent implements OnInit {
  admin=new Admin();
  message='';

  constructor(private bloodBankService:BloodbankService) { }

  ngOnInit(): void {
  }

  adminregistration(){
    return this.bloodBankService.adminregistrationbackend(this.admin).subscribe(
      data=>{
        console.log("successfully registered");
        this.message="Registered Successfully";
      },
      error=>{
        console.log("error occurred");
      }
    )
  }
}
