package com.example.sc.datastorage.entities;

/**
 * Created by sc on 2/17/18.
 */

public class User {

    private String username;
    private String address;
    private String eamil;
    private String gender;


    public User(){

    };

    public User(String username, String address, String eamil, String gender) {
        this.username = username;
        this.address = address;
        this.eamil = eamil;
        this.gender = gender;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
