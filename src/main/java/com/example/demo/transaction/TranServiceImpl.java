package com.example.demo.transaction;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Transaction;
import com.example.demo.entity.User;
import com.example.demo.repository.TransactionRepository;
import com.example.demo.repository.UserRepository;

@Service(value="tService")
public class TranServiceImpl implements TranService {
	
	@Autowired
	public TransactionRepository  tRepo;
	@Autowired
	public UserRepository urepo;

	@Override
	public void dotransaction(Transaction t) {
		this.tRepo.save(t);
		
	}

	@Override
	public List<Transaction> dogetusers() {
		
		return this.tRepo.findAll();
	}

	@Override
	public Transaction dopayment(Transaction t) {
		List<Transaction> list=this.tRepo.findAll();
		
		          List<User> l1=this.urepo.findAll();
		          for(User u:l1)
		          {
		        	 if(u.getAcc_no()==t.getSender_acc_no())
		        	 {
		        		 u.setCash(u.getCash()-t.getAmount());
		        		 
		        	 this.urepo.save(u);
		        	    
		        	 }
		          }
		          
		          for(User u1:l1)
		          {
		        	  if(u1.getAcc_no()==t.getReceiver_acc_no())
		        	  {
		        		  u1.setCash(u1.getCash()+t.getAmount());
		        		  this.urepo.save(u1);
		        	  }
		          }
		          
			this.tRepo.save(t);
			return t;
			
		
		
	}

	@Override
	public Optional<Transaction> getoneuser(int sender_acc_no) {
		 return this.tRepo.findById(sender_acc_no);
		
	}

}
