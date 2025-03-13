import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BloodbankService } from '../bloodbank.service';
import { Bloodrequirement } from '../bloodrequirement';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  title='Blood Bank System';
  bloodlist:Bloodrequirement[] | undefined;
  brState: any

  constructor(private bloodBankService:BloodbankService, private router:Router) { }

  ngOnInit(): void {
    this.getBloodList();
  }

  getBloodList(){
    this.bloodBankService.urgentbloodrequirement().subscribe(
      data=>{
        this.bloodlist=data;
      },
      error=>{
        console.log("error occurred");  
      }
    )
  }

  Search(){
    if(this.brState==""){
      this.getBloodList();
    }
    else{
      this.bloodlist=this.bloodlist?.filter(res=>{
        return res.brState?.toLocaleLowerCase().match(this.brState.toLocaleLowerCase());
      })
    }
  }
}
