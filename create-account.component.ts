import { Component, OnInit } from '@angular/core';
import {UserServiceService} from '../user-service.service';
import {User} from '../user';
import {UrlResolver} from '@angular/compiler';

@Component({
  selector: 'app-create-account',
  templateUrl: './create-account.component.html',
  styleUrls: ['./create-account.component.css']
})
export class CreateAccountComponent implements OnInit {
 
  user : User = new User(0," ",0,0,0);
   
  msg:any;
  constructor(private service:UserServiceService) { }

  ngOnInit(): void {
  }

  public register()
  {
     let response=this.service.doRegistration(this.user);
     response.subscribe(data => {
       this.msg=data;
      } )
  }

}
