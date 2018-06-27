package com.beyondbanking.ssh.financialoverviewservice.controllers;

import com.beyondbanking.ssh.financialoverviewservice.exceptions.FinancialOverviewAPIException;
import com.beyondbanking.ssh.financialoverviewservice.model.FinancialOverviewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController @RequestMapping(path = "/v1/financialoverview") public class FinancialOverviewController {


    @Autowired FinancialOverviewModel financialOverviewModel;

    /**
     * The API providing financial overview
     *
     * @param bcnumber the search query provided as query param
     * @return financial overview
     */
    @CrossOrigin @RequestMapping(method = RequestMethod.GET) public FinancialOverviewModel search(
        @RequestParam(value = "bcnumber") String bcnumber) throws FinancialOverviewAPIException {

        if ("12345".equalsIgnoreCase(bcnumber)) {
            financialOverviewModel.setAvgIncome(3500.00);
            financialOverviewModel.setAvgExpense(3000.00);
            financialOverviewModel.setAvgSavings(500.00);
        } else {
            throw new FinancialOverviewAPIException("Customer Not found");
        }
        return financialOverviewModel;
    }
}
