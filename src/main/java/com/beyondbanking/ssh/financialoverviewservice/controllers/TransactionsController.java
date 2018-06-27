package com.beyondbanking.ssh.financialoverviewservice.controllers;


import com.beyondbanking.ssh.financialoverviewservice.model.dto.Transactions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping(path = "/v1/transactions")
public class TransactionsController {


    private Object getResponse(String uri, Class object) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("Authorization", "DirectLogin token=" + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyIiOiIifQ.PGJ_3bcN4nOdNpE4AvCBwQVgIyQTiJ9LhYMfRDiudP8");
        HttpEntity<?> entity = new HttpEntity<>(headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity exchange = restTemplate.exchange(uri, HttpMethod.GET, entity, object);
        return exchange.getBody();
    }

    @RequestMapping(method = RequestMethod.GET)
    @CrossOrigin
    public Transactions getTransactions(
            @RequestParam(value = "accountID", required = true) String accountID,@RequestParam(value = "viewID", required = true) String viewID) {
        String obpTransactions = "https://beyondbanking.openbankproject.com/obp/v3.0.0/banks/bb.01.nl.nl/accounts/{ACCOUNT_ID}/{VIEW_ID}/transactions";
        UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(obpTransactions);
        Map<String, String> uriParams = new HashMap<>();
        uriParams.put("ACCOUNT_ID", accountID);
        uriParams.put("VIEW_ID", viewID);
        return (Transactions) getResponse(builder.buildAndExpand(uriParams).toUriString(), Transactions.class);

    }

}