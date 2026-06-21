/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public abstract class Customer {
    private int Id;
    private String name;
    private String location;
    private String phoneNumber;

    public Customer(int Id, String name, String location, String phoneNumber) {
        this.Id = Id;
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if(name == null||name.trim().isEmpty()){
             return false;
        }
            this.name = name;
                return true;
    }

    public String getLocation() {
        return location;
    }

    public boolean setLocation(String location) {
        if(location == null || location.trim().isEmpty()){
    return false;
}
        this.location = location;
        return true;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean setPhoneNumber(String phoneNumber) {
        if(phoneNumber == null || phoneNumber.length() < 8){
                System.out.println(       "\" wrong number. \"");
                return false;
            }
            for(int i=0 ; i<phoneNumber.length() ; i++){
            if(!Character.isDigit(phoneNumber.charAt(i))){
              return false;
            }
    }
        this.phoneNumber = phoneNumber;
                return true;
    }

    @Override
    public abstract String toString();
    public abstract double disCountRate();       
}
