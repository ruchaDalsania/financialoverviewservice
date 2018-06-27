package com.beyondbanking.ssh.financialoverviewservice.model.dto;

import lombok.Data;

@Data
public class Transaction {

	private String id;
	
	private Account this_account;
	
	private Account other_account;
	
	private TransactionDetails details;
	
	private TransactionMetadata metadata;
}
