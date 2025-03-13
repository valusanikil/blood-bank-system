import { Component, OnInit } from '@angular/core';
import { BloodbankService } from '../bloodbank.service';
import { User } from '../user';

@Component({
  selector: 'app-userregistration',
  templateUrl: './userregistration.component.html',
  styleUrls: ['./userregistration.component.css']
})
export class UserregistrationComponent implements OnInit {
  user=new User();
  message='';

  constructor(private bloodBankService:BloodbankService) { }

  ngOnInit(): void {
  }

  userregistration(){
    return this.bloodBankService.userregistrationbackend(this.user).subscribe(
      data=>{
        console.log("registered successfully");
        this.message="Registered Successfully";
      },
      error=>{
        console.log("erorr occurred");
      }
    )
  }

}
