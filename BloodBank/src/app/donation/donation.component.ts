import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BloodbankService } from '../bloodbank.service';
import { Blooddonation } from '../blooddonation';

@Component({
  selector: 'app-donation',
  templateUrl: './donation.component.html',
  styleUrls: ['./donation.component.css']
})
export class DonationComponent implements OnInit {
  blooddonation=new Blooddonation();

  constructor(private bloodBankService:BloodbankService, private router:Router) { }

  ngOnInit(): void {
  }

  donateBloodMethod(){
    return this.bloodBankService.blooddonationbackend(this.blooddonation).subscribe(
      data=>{
        console.log("Donated successfully");
        this.router.navigate(['feedback']);
      },
      error=>{
        console.log("error occured");
      }
    )
  }

}
