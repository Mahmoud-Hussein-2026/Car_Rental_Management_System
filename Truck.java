/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class Truck extends Vehicle{
    private int PayLoad;
    private boolean isCooler;

    public Truck( int boardNumber,String brand, String model, int DailyPrice, boolean avaliable , int PayLoad, boolean isCooler) {
        super(boardNumber,brand, model, DailyPrice, avaliable);
        this.PayLoad = PayLoad;
        this.isCooler = isCooler;
    }

    @Override
    public String toString() {
        return "Truck{\n" + "boardNumber =" + super.getBoardNumber() +",   brand =" + super.getBrand()+ ",   model =" + super.getModel() + "  ,   DailyPrice =" + super.getDailyPrice() + ",   available =" + super.isAvailable() +
                 ",  PayLoad =" + PayLoad + ", isCooler =" + isCooler + "}\n";
    }
     @Override
     public double calcTotalCost(int rentalDays){
    double cost = getDailyPrice()*rentalDays;
    if(isCooler){
        cost+=cost*0.05;
    }
    return cost;
}       
}
