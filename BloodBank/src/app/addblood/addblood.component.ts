import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Bloodavailability } from '../bloodavailability';
import { BloodbankService } from '../bloodbank.service';

@Component({
  selector: 'app-addblood',
  templateUrl: './addblood.component.html',
  styleUrls: ['./addblood.component.css']
})
export class AddbloodComponent implements OnInit {
  bloodavailability= new Bloodavailability();


  constructor(private bloodBankService:BloodbankService, private router:Router) { }

  ngOnInit(): void {
  }

  addBlood(){
    this.bloodBankService.addbloodbackend(this.bloodavailability).subscribe(
      data=>{
        console.log("added successfully");
        this.router.navigate(['adminavailability']);
      },
      error=>{
        console.log("error occurred");
        }
    )
}

}
