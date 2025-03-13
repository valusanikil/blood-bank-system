import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Bloodavailability } from '../bloodavailability';
import { BloodbankService } from '../bloodbank.service';

@Component({
  selector: 'app-adminavailability',
  templateUrl: './adminavailability.component.html',
  styleUrls: ['./adminavailability.component.css']
})
export class AdminavailabilityComponent implements OnInit {
  bloodDetails:Bloodavailability[] | undefined;
  baState:any;

  constructor(private router:Router, private bloodBankService:BloodbankService) { }

  ngOnInit(): void {
    this.getAllBloodDetails();

  }

  getAllBloodDetails(){
    this.bloodBankService.getBloodDetails().subscribe(
      data=>{
        this.bloodDetails=data; 
      },
      error=>{
        console.log("error occurred");  
      }
    )
  }

  addBloodDetails(){
    this.router.navigate(['addblood']);
  }

  updateBloodDetails(baId:number|undefined){
    console.log(baId);
    this.router.navigate(['updateblood',baId]);
  }
  
  deleteblood(baId:number|undefined){
    this.bloodBankService.deletebloodbackend(baId).subscribe(
      data=>{
        console.log("deleted");
        this.bloodBankService.getBloodDetails().subscribe(
          data=>{
            this.bloodDetails=data;
          },
          error=>{
            console.log("error");  
          }
        )
      },
      error=>{
        console.log("error");
        
      }
    )
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
