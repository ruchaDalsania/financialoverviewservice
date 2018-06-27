package com.beyondbanking.ssh.financialoverviewservice.model.dto;

import java.util.Date;

import lombok.Data;

@Data
public class TransactionWhere {
	
	private float latitude;
	
	private float longitude;
	
	private Date date;
	
	private WhereUser user;

}
