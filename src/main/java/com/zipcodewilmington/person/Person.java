package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name = "";
    private int age = Integer.MAX_VALUE;

    public Person() {
    }

    //can't use same variable as class field, personally would rather change incoming var then name inside class
    //public Person(int age) {}
    public Person(int newAge) {
        age = newAge;
    }

    //can't use same variable as class field
    //public Person(String name) {}
    public Person(String newName) {
        name = newName;
    }

    //can't use same variable as class field
    //public Person(String name, int age) {}
    public Person(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    //can't use same variable as class field
    //public void setName(String name) {}
    public void setName(String newName) { name = newName; }

    //can't use same variable as class field
    //public void setAge(int age) {}
    public void setAge(int newAge) { age = newAge; }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
