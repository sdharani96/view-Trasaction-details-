package com.transaction.details.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.transaction.details.entity.TransactionDetails;
import com.transaction.details.service.TransactionDetailsService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/api")
public class TransactionController {
	
	private static final Logger LOGGER = LogManager.getLogger(TransactionController.class);
	
	@Autowired
	private TransactionDetailsService transactionDetailsService;
	
	@GetMapping(value = "/viewPage")
	public ModelAndView viewAllPage(ModelAndView modelAndView) {
		LOGGER.info("Entered jsp view page method");
		modelAndView.setViewName("viewall");
		return modelAndView;
	}
	
	@ApiOperation(value = "get all transactions")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success", response = TransactionDetails.class),
			@ApiResponse(code = 401, message = "Unauthorized"),
	        @ApiResponse(code = 403, message="Forbidden"),
	        @ApiResponse(code = 404, message = "Not Found"),
	        @ApiResponse(code = 500, message = "Failure")
	})
	@GetMapping(value = "/getalltransactions", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<TransactionDetails>> viewAllDetailed() {
		LOGGER.info("Entered allTransaction API method");
		List<TransactionDetails> allTransactions = transactionDetailsService.viewTransactions();
		return new ResponseEntity<>(allTransactions, HttpStatus.OK) ;
	}
	
	@ApiOperation(value = "add transaction")
	@ApiResponses(value = {
			@ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 401, message = "Unauthorized"),
	        @ApiResponse(code = 403, message="Forbidden"),
	        @ApiResponse(code = 404, message = "Not Found"),
	        @ApiResponse(code = 500, message = "Failure")
	})
	@PostMapping(value = "/addTransaction", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Map<String, String>> createClient(@RequestBody TransactionDetails transactionDetails) {
		LOGGER.info("Entered save Rest API method");
		String status = transactionDetailsService.saveTrans(transactionDetails);
		Map<String, String> result = new HashMap<>();
		result.put("Status", status);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

}
