import { Component, OnInit } from '@angular/core';
import { UserServiceService } from '../user-service.service';
import {Transaction} from '../transaction';

@Component({
  selector: 'app-transaction',
  templateUrl: './transaction.component.html',
  styleUrls: ['./transaction.component.css']
})
export class TransactionComponent implements OnInit {

  tr:Transaction=new Transaction(0,0,0,0);

  constructor(private service:UserServiceService) { }

  ngOnInit(): void {
  }
  msg:any;
  views:any
  public payment()
  {
    console.log("hi");
    let response=this.service.doPayment(this.tr);
    response.subscribe(data => {
      this.msg=data;
    })
   // alert("payment done successfully");
  }

  public viewpayment()
  {
    let response=this.service.viewtransaction(this.tr.sender_acc_no);
    response.subscribe(data => {
      this.views=data;
    })
  }

}
