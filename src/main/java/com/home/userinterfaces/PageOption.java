package com.home.userinterfaces;

public enum PageOption {

    CALCULATOR_PAGE("calculator.page");

    private final String url;

    PageOption(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}
