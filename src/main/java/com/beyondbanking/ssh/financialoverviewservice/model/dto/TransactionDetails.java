package com.beyondbanking.ssh.financialoverviewservice.model.dto;

import java.util.Date;

import lombok.Data;

@Data
public class TransactionDetails {
	
	private String type;
	
	private String description;
	
	private Date posted;
	
	private Date completed;
	
	private Balance new_balance;
	
	private Balance value;

}
