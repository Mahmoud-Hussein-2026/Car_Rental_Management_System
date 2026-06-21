/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class Motors extends Vehicle {
    private int capacity;
    private boolean sideCar;

    public Motors(int boardNumber,String brand, String model, int DailyPrice, boolean avaliable ,int capacity, boolean sideCar) {
        super(boardNumber,brand, model, DailyPrice, avaliable);
        this.capacity = capacity;
        this.sideCar = sideCar;
    }

    @Override
    public String toString() {
        return "Motor{\n" + "boardNumber =" + super.getBoardNumber() + ",   brand =" + super.getBrand() + ",   model =" + super.getModel() + "  ,   DailyPrice =" + super.getDailyPrice() + ",   available =" + super.isAvailable()+
                 ",  capacity =" + capacity + ", sideCar =" + sideCar + "}\n";
    }
     @Override
     public double calcTotalCost(int rentalDays){
    double cost = getDailyPrice()*rentalDays;
    if(sideCar){
        cost+=cost*0.02;
    }
    return cost;
}
}
