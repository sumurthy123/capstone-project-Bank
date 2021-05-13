import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllUsersComponent } from './all-users/all-users.component';
import { CheckBalanceComponent } from './check-balance/check-balance.component';
import { CreateAccountComponent } from './create-account/create-account.component';
import { HomeComponent } from './home/home.component';
import { TransactionComponent } from './transaction/transaction.component';

const routes: Routes = [
  {path:"home",component:HomeComponent},
  {path:"create",component:CreateAccountComponent},
  {path:"balance",component:CheckBalanceComponent},
  {path:"transaction",component:TransactionComponent},
  {path:"all-users",component:AllUsersComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
