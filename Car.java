/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class Car extends Vehicle {
    private String fuelType;
    private boolean conditioner;
    private int seatsNumber;

    public Car( int boardNumber, String brand, String model, int DailyPrice, boolean avaliable ,String fuelType, boolean conditioner, int seatsNumber) {
        super(boardNumber, brand, model, DailyPrice, avaliable);
        this.fuelType = fuelType;
        this.conditioner = conditioner;
        this.seatsNumber = seatsNumber;
    }
    @Override
    public String toString() {
 return "car {\n" + "boardNumber = " + super.getBoardNumber() + ",   brand =" + super.getBrand() +",  model =" + super.getModel() + "  ,   DailyPrice =" + super.getDailyPrice() + ",   available =" + super.isAvailable()
      + ",  fuelType =" + fuelType + ", conditioner =" + conditioner + ", seatsNumber =" + seatsNumber + "}\n";
    }
    @Override
   public double calcTotalCost(int rentalDays){
    double cost = getDailyPrice()*rentalDays;
    if(fuelType.equalsIgnoreCase("electric")){
        cost+=cost*0.05;
    }
    if(seatsNumber > 5){
        cost+=cost*0.04;
    }
    return cost;
   }
}
