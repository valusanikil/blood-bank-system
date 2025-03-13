import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Admin } from './admin';
import { Bloodavailability } from './bloodavailability';
import { Blooddonation } from './blooddonation';
import { Bloodfeedback } from './bloodfeedback';
import { Bloodrequirement } from './bloodrequirement';
import { User } from './user';


@Injectable({
  providedIn: 'root'
})
export class BloodbankService {

  constructor(private httpClient:HttpClient) { }

  public adminloginbackend(admin : Admin):Observable<any>{
    return this.httpClient.post<any>("http://localhost:8080/loginadmin",admin);
  }

  public userloginbackend(user:User):Observable<any>{
    return this.httpClient.post<any>("http://localhost:8080/loginuser",user);
  }

  public adminregistrationbackend(admin:Admin):Observable<any>{
    return this.httpClient.post<any>("http://localhost:8080/registeradmin",admin)
  }

  public userregistrationbackend(user:User):Observable<any>{
    return this.httpClient.post<any>("http://localhost:8080/registeruser",user);
  }

  public bloodrequirementbackend(bloodrequirement:Bloodrequirement):Observable<any>{
    return this.httpClient.post<any>("http://localhost:8090/bloodrequirement",bloodrequirement);
  }

  public blooddonationbackend(blooddonation:Blooddonation):Observable<any>{
    return this.httpClient.post<any>("http://localhost:8090/blooddonation",blooddonation);
  }

  public bloodfeedbackbackend(bloodfeedback:Bloodfeedback):Observable<any>{
    return this.httpClient.post<any>("http://localhost:8090/bloodfeedback",bloodfeedback);
  }

  public urgentbloodrequirement():Observable<any>{
    return this.httpClient.get("http://localhost:8090/bloodrequirement/getall");
  }
  
  public getBloodDetails():Observable<any>{
    return this.httpClient.get("http://localhost:8080/admin/bloodavailable/getallbloodavailable");
  }

  public addbloodbackend(bloodavailability:Bloodavailability):Observable<any>{
    return this.httpClient.post<any>("http://localhost:8080/admin/bloodavailable/add",bloodavailability);
  }

  public getBloodDetailsById(baId:number|undefined):Observable<any>{
    return this.httpClient.get("http://localhost:8080/admin/bloodavailable/"+baId);
  }

  public updatebloodbackend(baId:number|undefined, bloodavailability:Bloodavailability):Observable<any>{
    return this.httpClient.put<any>("http://localhost:8080/admin/bloodavailable/update/"+bloodavailability.baId,bloodavailability);
  }

  public deletebloodbackend(baId:number |undefined):Observable<any>{
    return this.httpClient.delete("http://localhost:8080/admin/bloodavailable/delete/"+baId);
  }
  
}
