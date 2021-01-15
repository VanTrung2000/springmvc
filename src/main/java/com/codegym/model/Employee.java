package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Employlee")
public class Employee {
    private Long id;
    private String name;
    private int age;
    private String phone;
    private String adrress;
    private String gender;
    private Long salary;
    private String job;
    public  Employee(){

    }
    public  Employee(Long id, String name, int age, String phone, String adrress, String gender, Long salary, String job) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.adrress = adrress;
        this.gender = gender;
        this.salary = salary;
        this.job = job;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

