package com.devcolibri.database;

import javax.persistence.*;

@Entity
@Table(name = "wp_schema")
public class UsersTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idUssers;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    @Column(name = "email")
    private String email;

    public UsersTable() {
    }

    public UsersTable(String name, int age, String email) {
        this.name = name;
        this.age = age;
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

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UsersTable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
