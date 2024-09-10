package org.example.domain;

public abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getRole();

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
