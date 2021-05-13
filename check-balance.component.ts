import { Component, OnInit } from '@angular/core';
import {UserServiceService} from '../user-service.service';
@Component({
  selector: 'app-check-balance',
  templateUrl: './check-balance.component.html',
  styleUrls: ['./check-balance.component.css']
})
export class CheckBalanceComponent implements OnInit {

  constructor(private service:UserServiceService) { }

  ngOnInit(): void {
  }
  acc_no:any;
  amount:any;
  public balance()
  {
    console.log("hi");
    let response=this.service.checkbalance(this.acc_no);
    response.subscribe(data => {
      this.amount=data;
    })
  }

}
