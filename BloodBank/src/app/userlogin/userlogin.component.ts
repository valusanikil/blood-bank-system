import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BloodbankService } from '../bloodbank.service';
import { User } from '../user';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent implements OnInit {
  user=new User();
  message='';

  constructor(private bloodBankService:BloodbankService, private router:Router) { }

  ngOnInit(): void {
  }

  userlogin(){
    return this.bloodBankService.userloginbackend(this.user).subscribe(
      data=>{
        console.log("response received");
        this.router.navigate(["home"]);
      },
      error=>{
        console.log("error");
        this.message="Invalid Credentials";
      }
    )
  }
}
