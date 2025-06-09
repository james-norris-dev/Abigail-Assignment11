package com.codercampus.Assignment11.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.service.TransactionService;

@Controller
public class TransactionController {
	@Autowired 
	TransactionService service;
//	@GetMapping("/transactionsDemo")
//		public String getTransactionsDemo() {
//			return "transactions";
//		}
//	

	
	@GetMapping("/showTransactions")
	public String getTransactions(ModelMap model) {
	List<Transaction> transactions=	service.importTransactions();
		model.put("transactions", transactions);
		return "transactionsView";
		
	}
	
	
	
	
	@GetMapping("/showTransactions/{transactionId}")
	
	public String retrieveTransactions(ModelMap model,Long id) {
		List<Transaction> specificTransaction= service.findTransactionById(id);
		
		model.put("specific", specificTransaction);
	
		return "transactionsView/{transactionId}";
		
		
		
		
		
		
	}
	
}
 