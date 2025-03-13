import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { BloodbankService } from '../bloodbank.service';
import { Bloodfeedback } from '../bloodfeedback';

@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css']
})
export class FeedbackComponent implements OnInit {
  bloodfeedback=new Bloodfeedback();


  constructor(private bloodBankService:BloodbankService, private router:Router) { }

  ngOnInit(): void {
  }

  feedbackdone(){
    return this.bloodBankService.bloodfeedbackbackend(this.bloodfeedback).subscribe(
      data=>{
        console.log("feedback submitted");
        this.router.navigate(['home']);
      },
      error=>{
        console.log("error occurred");
        
      }
    )
  }

}
