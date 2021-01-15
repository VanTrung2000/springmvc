package com.codegym.model;

public class Department {
    private Long id;
    private String name;
    private Long amuon;

    public Department(){
    }
    public Department(Long id, String name, Long amuon) {
        this.id = id;
        this.name = name;
        this.amuon = amuon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAmuon() {
        return amuon;
    }

    public void setAmuon(Long amuon) {
        this.amuon = amuon;
    }
}
