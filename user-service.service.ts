import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

constructor(private http:HttpClient) {}

public doRegistration(user)
{
  return this.http.post("http://localhost:8090/user",user,{responseType :"text" as "json"});
}

public checkbalance(acc_no)
{
   return this.http.get("http://localhost:8090/user/"+acc_no);
}

public doPayment(tr)
{
   console.log("hello");
   return this.http.put("http://localhost:8090/transaction",tr);
}
public doadmin()
{
  return this.http.get("http://localhost:8090/user");
}

public doremove(acc_no)
{
  console.log("this is delete");
  return this.http.delete("http://localhost:8090/user/"+acc_no);
}

public viewtransaction(sender_acc_no)
{
  return this.http.get("http://localhost:8090/"+sender_acc_no);
}

}
