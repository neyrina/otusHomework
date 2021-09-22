package com.kukunina.dz1;

public enum Commands {
    ADD("add"),
    LIST("list"),
    EXIT("exit");

    private String value;

    Commands() {
    }

    Commands(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
