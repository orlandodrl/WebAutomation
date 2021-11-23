package com.home.exceptions;

public enum ExceptionMessages {

    UNEXPECTED_RESULT("The result obtained from the operation is not the expected");

    private String message;

    ExceptionMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
