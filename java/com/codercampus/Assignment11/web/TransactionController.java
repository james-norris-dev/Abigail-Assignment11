package com.codercampus.Assignment11.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.codercampus.Assignment11.service.TransactionService;

@Controller
public class TransactionController {
	@Autowired 
	TransactionService service;
	@GetMapping("/transactionsDemo")
		public String getTransactionsDemo() {
			return "transactions";
		}
	

	
	@GetMapping("/transactions")
	public String getRealTransactions() {
		
		service.importTransactions();
		return "transactions";
		
	}
}
