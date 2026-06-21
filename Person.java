/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.time.LocalDate;
/**
 *
 * @author Admin
 */
public class Person extends Customer {
    private int licenseNumber;
    private LocalDate birtDay ;
    
    public Person(int licenseNumber, int birtYear, int birthMonth, int birhtDay, int Id, String name, String location, String phoneNumber) {
        super(Id, name, location, phoneNumber);
        this.licenseNumber = licenseNumber;
       this.birtDay = LocalDate.of(birtYear,birthMonth,birhtDay);
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }

    public LocalDate getBirtDay() {
        return birtDay;
    }

    @Override
    public String toString() {
        return "person{\n" + "Id = " + super.getId() + ",  name = " + super.getName() + ", location = " + super.getLocation() + ", phoneNumber=" + super.getPhoneNumber() +
                  ",  licenseNumber = " + licenseNumber + ", birtDay = " + birtDay + "}\n";
    }
    @Override  
   public double disCountRate(){
       return 0;
   }
}
