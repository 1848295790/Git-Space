package com.sun.entity;

public class User {
    private Integer id;
    private String username;
    private Integer sex;

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    private String phone;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public User() {
    }

    public User(Integer id, String username, Integer sex, String phone) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.phone = phone;
    }
}
