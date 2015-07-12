package com.springapp.mvc.dto;

/**
 * Created by Aiden on 2015-07-12.
 */
public class Person {
    private String name;
    private int age;
    private String adress;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ name : ").append(name).append(", ");
        sb.append("age : ").append(age).append(", ");
        sb.append("address : ").append(adress).append("]");
        return sb.toString();
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
