import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Bloodavailability } from '../bloodavailability';
import { BloodbankService } from '../bloodbank.service';

@Component({
  selector: 'app-availability',
  templateUrl: './availability.component.html',
  styleUrls: ['./availability.component.css']
})
export class AvailabilityComponent implements OnInit {
  bloodDetails:Bloodavailability[] | undefined;
   baState:any;

  constructor(private bloodBankService:BloodbankService,private router:Router) { }

  ngOnInit(): void {
    this.getAllBloodDetails();
  }

  getAllBloodDetails(){
    this.bloodBankService.getBloodDetails().subscribe(
      data=>{
        this.bloodDetails=data;
      },
      error=>{
        console.log("errors");
        
      }
    )
  }

  bloodinfo(baId:number|undefined){
    this.router.navigate(['blooddetails',baId]);
  }

  Search(){
    if(this.baState==""){
      this.getAllBloodDetails();
    }
    else {
      this.bloodDetails=this.bloodDetails?.filter(res=>{
        return res.baState?.toLocaleLowerCase().match(this.baState.toLocaleLowerCase());
      })
    }
  }

}
