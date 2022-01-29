package com.transaction.details.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transaction.details.entity.TransactionDetails;
import com.transaction.details.repository.TransactionDetailsRepository;

@Service
public class TransactionDetailsService {
	
	@Autowired
	TransactionDetailsRepository transactionDetailsRepository;
	
	public List<TransactionDetails> viewTransactions() {
		return transactionDetailsRepository.findAll();
	}

	public String saveTrans(TransactionDetails transactionDetails) {
		TransactionDetails details = transactionDetailsRepository.save(transactionDetails);
		return details != null ? "Success" : "Failed";
	}
}
