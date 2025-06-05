package com.codercampus.Assignment11;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransactionApplication {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SpringApplication.run(TransactionApplication.class, args);
	}
}
// create a transaction controller with a /transaction endpoint done
// make sure all 100 transactions are loaded besides 1,38,50,100- a loop might be good for that

//I need to serialize the transaction objects and then deserialize them. This sounds like extra steps
//then sort them by Id and make a clickable link  for ids that 
// leads to a view that will give the details of the transaction