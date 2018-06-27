package com.beyondbanking.ssh.financialoverviewservice.utils;

public class ErrorResponse {
    private String message;

    /**
     * Default constructor.
     * @param message the error message
     */
    public ErrorResponse(String message) {
        this.message = message;
    }

    /**
     * Get the error message
     * @return the error messaga
     */
    public String getMessage() {
        return message;
    }
}
