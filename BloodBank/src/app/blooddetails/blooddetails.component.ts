import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { Bloodavailability } from '../bloodavailability';
import { BloodbankService } from '../bloodbank.service';

@Component({
  selector: 'app-blooddetails',
  templateUrl: './blooddetails.component.html',
  styleUrls: ['./blooddetails.component.css']
})
export class BlooddetailsComponent implements OnInit {

  baId:number|undefined
  bloodavailability:Bloodavailability=new Bloodavailability();

  constructor(private router:Router, private bloodBankService:BloodbankService,
    private activatedRoute:ActivatedRoute) { }

  ngOnInit(): void {
    this.baId=this.activatedRoute.snapshot.params['baId'];
    this.bloodBankService.getBloodDetailsById(this.baId).subscribe(
      data=>{
        console.log("success");
        this.bloodavailability=data;
      },
      error=>{
        console.log("exception");
        
      }
    )
  }

  back(){
    this.router.navigate(['availability']);
  }

}
