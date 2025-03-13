import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Bloodavailability } from '../bloodavailability';
import { BloodbankService } from '../bloodbank.service';

@Component({
  selector: 'app-updateblood',
  templateUrl: './updateblood.component.html',
  styleUrls: ['./updateblood.component.css']
})
export class UpdatebloodComponent implements OnInit {
  bloodavailability:Bloodavailability=new Bloodavailability();
  baId: number | undefined

  constructor(private bloodBankService:BloodbankService, 
    private activatedRoute:ActivatedRoute
    ,private router:Router) { }

  ngOnInit(): void {
    this.baId=this.activatedRoute.snapshot.params['baId'];
    this.bloodBankService.getBloodDetailsById(this.baId).subscribe(
      data=>{
        this.bloodavailability=data;
      },
      error=>{
        console.log("error occured");        
      }
    )
  }

  updateBlood(){
    this.bloodBankService.updatebloodbackend(this.baId,this.bloodavailability).subscribe(
      data=>{
        this.router.navigate(['adminavailability']);
      },
      error=>{
        console.log("error"); 
      }
    )
  }

}
