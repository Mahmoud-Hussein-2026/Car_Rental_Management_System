/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public abstract class Vehicle {
    private int boardNumber;
    private String brand;
    private String model;
    private int DailyPrice;
    private boolean available;

    public Vehicle(int boardNumber,String brand, String model, int DailyPrice, boolean avaliable) {
        this.boardNumber = boardNumber;
        this.brand = brand;
        this.model = model;
        this.DailyPrice = DailyPrice;
        this.available = avaliable;
    }

    public int getBoardNumber() {
        return boardNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
    public int getDailyPrice() {
        return DailyPrice;
    }

    public void setDailyPrice(int DailyPrice) {
        this.DailyPrice = DailyPrice;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean avaliable) {
        this.available = avaliable;
    }

    @Override
    public abstract String toString();
    public abstract double calcTotalCost(int rentalDays);
    
}
