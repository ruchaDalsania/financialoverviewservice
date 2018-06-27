package com.beyondbanking.ssh.financialoverviewservice.model.dto;

import java.util.List;

import lombok.Data;

@Data
public class TransactionMetadata {
	
	private String narrative;
	
	private List<String> comments;
	
	private List<String> tags;
	
	private List<String> images;
	
	private TransactionWhere where;

}
