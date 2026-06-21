/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Admin
 */
public class Institution extends Customer {
    private int registerNumber;
    private int discountRate;

    public Institution(int registerNumber, int discountRate, int Id, String name, String location, String phoneNumber) {
        super(Id, name, location, phoneNumber);
        this.registerNumber = registerNumber;
        this.discountRate = discountRate;
    }

    @Override
    public String toString() {
        return "institution{\n" + "Id = " + super.getId() + ", name = " + super.getName() + ", location = " + super.getLocation() + ",  phoneNumber=" + super.getPhoneNumber() +
                 " ,  registerNumber = " + registerNumber + ", discountRate = " + discountRate + "}\n";
    }
    
     @Override  
   public double disCountRate(){
       return discountRate;
   }
}
