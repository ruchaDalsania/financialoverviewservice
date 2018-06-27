package com.beyondbanking.ssh.financialoverviewservice.controllers;

import com.beyondbanking.ssh.financialoverviewservice.exceptions.FinancialOverviewAPIException;
import com.beyondbanking.ssh.financialoverviewservice.utils.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class AdviceController {

    /**
     * Handles http 401.
     *
     * @param e the original exception thrown
     * @return the error response for the ui
     */
    @ExceptionHandler(FinancialOverviewAPIException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public Object notAuthenticated(Exception e) {
        return new ErrorResponse("Customer record not found");
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Object notHandled(Exception e) {
       // log the exception
        return new ErrorResponse("Server is down!");
    }
}
