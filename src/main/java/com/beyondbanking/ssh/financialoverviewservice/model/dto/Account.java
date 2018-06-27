package com.beyondbanking.ssh.financialoverviewservice.model.dto;

import java.util.List;

import lombok.Data;

@Data
public class Account {

	private String id;
	
	private List<Holder> holders;
	
	private Routing bank_routing;
	
	private Routing account_routing;
	
	private Metadata metadata;
}
