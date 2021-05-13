import { Component, OnInit } from '@angular/core';
import { UserServiceService } from '../user-service.service';

@Component({
  selector: 'app-all-users',
  templateUrl: './all-users.component.html',
  styleUrls: ['./all-users.component.css']
})
export class AllUsersComponent implements OnInit {

  constructor(private service:UserServiceService) { }
  name="";
  password:any
  users:any;

  ngOnInit(): void {
  }
  public validate()
  {
    if((this.name=="satya")&&(this.password=="ThinkPad@66"))
    {
      let response=this.service.doadmin();
      response.subscribe(data => {
        this.users=data;
      })
           
    }
    else{
      alert("enter correct details");
    }
  }
  msg:any
  public remove(acc_no)
  {  
    console.log(acc_no);
    let response=this.service.doremove(acc_no);
    response.subscribe(data => {
      this.msg=data;
    })
  }

}
