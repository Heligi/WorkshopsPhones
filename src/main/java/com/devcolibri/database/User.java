package com.devcolibri.database;

public class User {
    private String name;
    private int age;
    private String email;

    public User(){

    }

    public User(String name, int ege, String email) {
        this.name = name;
        this.age = ege;
        this.email = email;
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

    public void setAge(int ege) {
        this.age = ege;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
