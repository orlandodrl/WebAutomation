package com.home.exceptions;

public class OperationAssertion extends AssertionError {

    public OperationAssertion(String s, Throwable throwable) {
        super(s, throwable);
    }

}
