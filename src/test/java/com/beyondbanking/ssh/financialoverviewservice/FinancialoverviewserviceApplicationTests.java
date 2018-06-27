package com.beyondbanking.ssh.financialoverviewservice;

import com.beyondbanking.ssh.financialoverviewservice.controllers.FinancialOverviewController;
import com.beyondbanking.ssh.financialoverviewservice.exceptions.FinancialOverviewAPIException;
import com.beyondbanking.ssh.financialoverviewservice.model.FinancialOverviewModel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

@RunWith(SpringRunner.class) @SpringBootTest public class FinancialoverviewserviceApplicationTests {

    @InjectMocks FinancialOverviewController financialOverviewController;

    @Spy FinancialOverviewModel financialOverviewModel;


    @Test public void testPositive() throws FinancialOverviewAPIException {
        FinancialOverviewModel financialOverviewModel = financialOverviewController.search("12345");
        Assert.assertNotNull(financialOverviewModel.getAvgExpense());
        Assert.assertEquals((Double) 3500.00, financialOverviewModel.getAvgIncome());
    }


    @Test(expected = FinancialOverviewAPIException.class) public void testNeg() throws FinancialOverviewAPIException {
        FinancialOverviewModel financialOverviewModel = financialOverviewController.search("1111");
    }


}
