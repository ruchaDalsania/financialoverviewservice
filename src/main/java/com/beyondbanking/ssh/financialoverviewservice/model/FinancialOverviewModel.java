package com.beyondbanking.ssh.financialoverviewservice.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FinancialOverviewModel {

    private Double avgIncome;
    private Double avgExpense;
    private Double avgSavings;

    public Double getAvgIncome() {
        return avgIncome;
    }

    public void setAvgIncome(Double avgIncome) {
        this.avgIncome = avgIncome;
    }

    public Double getAvgExpense() {
        return avgExpense;
    }

    public void setAvgExpense(Double avgExpense) {
        this.avgExpense = avgExpense;
    }

    public Double getAvgSavings() {
        return avgSavings;
    }

    public void setAvgSavings(Double avgSavings) {
        this.avgSavings = avgSavings;
    }
}
