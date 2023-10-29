package com.nekoding;

public class Person {
    private String name;

    private Asset asset;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Asset asset) {
        this.name = name;
        this.asset = asset;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
