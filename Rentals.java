/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author Mahmoud Hussein
 */
public class Rentals {
    private final int id;
    private final Vehicle vehicle;
    private final Customer customer;
    private final LocalDate rentStart;
    int daysRentNumber;
    private boolean contractStatus;
    private LocalDate actual;
    private int delayDays;
    double baseCost;
    double finalCost;
   
    public Rentals(int id, Vehicle vehicel, Customer coustomer, int Year, int Month, int Day, int daysRentNumber) {
        this.id = id;
        this.vehicle = vehicel;
        this.customer = coustomer;
        this.rentStart = LocalDate.of(Year,Month,Day);
        this.daysRentNumber = daysRentNumber;
        this.contractStatus = true;
        this.actual = null;
        this.delayDays = 0;
        this.baseCost = vehicel.calcTotalCost(daysRentNumber);
    }
    public void returnVehicle(int year,int month,int day){
        if(!contractStatus){
            return;
        }
        contractStatus = false;
        actual = LocalDate.of(year,month,day);
        vehicle.setAvailable(true);
        delayDays = (int) ChronoUnit.DAYS.between(rentStart, actual) - daysRentNumber;
        if(delayDays < 0){
            delayDays = 0;
        }
    }
    public double calcFinalCost(){
        finalCost = baseCost;
        if(customer instanceof Institution){
            finalCost -= finalCost*(customer.disCountRate()/100.0);
        }
        finalCost+= ((delayDays*(vehicle.getDailyPrice())) + delayDays*(vehicle.getDailyPrice()* 0.10));
        return finalCost;
    }
    public int getId(){
        return id;
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public int getDelayDays(){
        return delayDays;
    }
    public Customer getCustomer(){
        return customer;
    }
    public LocalDate getActual(){
        return actual;
    }
     public LocalDate getRentStart(){
        return rentStart;
    } 
    public boolean isContractStatus(){
        return contractStatus;
    } 
    public void printCheck() {
        calcFinalCost();
        System.out.println("Rental id = " + getId() 
                + "\n vehicle = " + vehicle.getBrand()+" , bordNumber ="+vehicle.getBoardNumber() 
                + "\n customer=" + customer.getName() 
                + "\n rentStart=" + rentStart + " ,daysRentNumber=" + daysRentNumber +
                "\n Contract Status"+(contractStatus ? "Active" : "finished")
                +",   return data = " +(actual != null ? actual :"Not retured yet." )
                + "\n delayDays=" + delayDays + "   baseCost=" + baseCost +"\n final cost = "+finalCost);
    }

    @Override
     public String toString() {
        return "Rentals{\n"+"id = " + id 
                + "\n vehicle=" + vehicle.getBrand()+" ,vehicle model = "+vehicle.getModel() +", bordNumber ="+vehicle.getBoardNumber()
                + ",\n customer=" + customer.getName()+" ,id customer =" + customer.getId() 
                + ",\n rentStart=" + rentStart + ",\n daysRentNumber=" + daysRentNumber 
                + "\n Contract Status ="+(contractStatus ? "Active" : "finished")
                +",   return data = " +(actual != null ? actual :"Not retured yet." )
                +",\n delayDays=" + delayDays + ",   baseCost=" + baseCost + ",\n finalCost=" + finalCost + '}';
    }
    
    
}