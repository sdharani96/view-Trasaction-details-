package com.transaction.details.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction_details")
public class TransactionDetails {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private long id;
	
	@Column(name = "account_number")
	private long accountNumber;
	
	@Column(name = "acc_name")
	private String accName;
	
	@Column(name = "bank_id")
	private long bankId;
	
	@Column(name = "bank_name")
	private String bankName;
	
	//@OneToMany()
	@Column(name = "transaction_id")
	private long transactionId;
	
	@Column(name = "amount")
	private double amount;
	
	@Column(name = "recei_accnum")
	private long receiverAccNumber;
	
	@Column(name = "recei_accname")
	private String receiverAccName;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "date")
	private Date date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public long getBankId() {
		return bankId;
	}

	public void setBankId(long bankId) {
		this.bankId = bankId;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(long transactionId) {
		this.transactionId = transactionId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public long getReceiverAccNumber() {
		return receiverAccNumber;
	}

	public void setReceiverAccNumber(long receiverAccNumber) {
		this.receiverAccNumber = receiverAccNumber;
	}

	public String getReceiverAccName() {
		return receiverAccName;
	}

	public void setReceiverAccName(String receiverAccName) {
		this.receiverAccName = receiverAccName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public TransactionDetails() {
		super();
	}
	
}
