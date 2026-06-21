/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author Admin
 */
public class RentalsManager  {
    ArrayList <Rentals> rentals = new ArrayList<>();
    public void addRental(Rentals rental){
        for(Rentals i : rentals){
            if(i.getId() == rental.getId()){
                 System.out.println(" Rental ID already exists. ");
                 return;
            }
        }
        if(!rental.getVehicle().isAvailable()){
            System.out.println(" Vehicle already rented .");
            return;
        }
        rental.getVehicle().setAvailable(false);
        rentals.add(rental);
        System.out.println(" Done added contract rent successfully .");
    }
    public void show_Active_Contracts(){
         boolean found = false;
        for(Rentals i : rentals){
            if(i.isContractStatus()){
                System.out.println(i);
                found = true;
            }
        }
         if(!found){
            System.out.println("NO Active contracts found .");
        }
    } 
    public void show_Finished_Contracts(){
        boolean found = false;
        for(Rentals i : rentals){
            if(!i.isContractStatus()){
                System.out.println(i);
                found = true;
            }
        }
        if(!found){
            System.out.println("NO finished contracts found .");
        }
    }
    public void show_Rented_Vehicles(){
          boolean found = false;
        for(Rentals i : rentals){
            if(i.isContractStatus()){
                System.out.println(i.getVehicle());
                 found = true;
            }
        }
         if(!found){
            System.out.println("NO rented vehicles found .");
        }
    }
    public void show_Late_Rentals(){
        boolean found = false;
        for(Rentals i : rentals){
            if(i.getDelayDays()>0){
                System.out.println(i);
                 found = true;
            }
        }
        if(!found){
            System.out.println("NO Late rentals found .");
        }
    }
    public void show_vehicle_byDataRang(int type,int year,int month,int day,int year2,int month2,int day2){
        LocalDate start = LocalDate.of(year,month,day);
        LocalDate end = LocalDate.of(year2,month2,day2);
        for(Rentals i : rentals){
            if(type == 1){
                if(i.getVehicle()instanceof Motors){
                if(!i.getRentStart().isBefore(start)&&!i.getRentStart().isAfter(end)){
              System.out.println(i);
            }
            }
            }
            else if(type == 2){
            if(!i.getRentStart().isBefore(start)&&!i.getRentStart().isAfter(end)){
              System.out.println(i);
            }
        }
        }
    }
    public Rentals search_Rental_ById(int id){
         for(Rentals i : rentals){
            if(i.getId()==id){
               return i;
            }
        }
        return null;
    }
    public void showCustomersByVehicle(int boardNumber){
    boolean found = false;
    for(Rentals i : rentals){
        if(i.getVehicle().getBoardNumber() == boardNumber){
            System.out.println(i.getCustomer());
            found = true;
        }
    }
    if(!found) System.out.println("No customers found for this vehicle.");
}
    public void show_Rentals_ByCustomerName(String name){
    boolean found = false;
    for(Rentals i : rentals){
        if(i.getCustomer().getName().equalsIgnoreCase(name)){
            System.out.println(i);
            found = true;
        }
    }
    if(!found) System.out.println("No rentals found.");
}

    public void show_Rentals_ByInstitution(){
    boolean found = false;
    for(Rentals i : rentals){
        if(i.getCustomer() instanceof Institution){
            System.out.println(i);
            found = true;
        }
    }
    if(!found){
        System.out.println("No rentals found.");
    }
 }
    public void totalRevenue(){
    double total = 0.0;
    double activ = 0.0;
    double finished = 0.0;
    for(Rentals i : rentals){
        if(i.isContractStatus()){
            activ += i.calcFinalCost();
        }
        if(!i.isContractStatus()){
            finished += i.calcFinalCost();
        }
    }
    total = activ + finished;
    System.out.println("Active Rentals Revenue = " + activ);
    System.out.println("Finished Rentals Revenue = " + finished);
    System.out.println("Total Revenue = " + total);
}

public void mostRentedVehicle(){
    Vehicle most = null;
    int max = 0;
    int count = 0;
    for(Rentals i : rentals){
        count = 0;
        for(Rentals j : rentals){
            if(j.getVehicle().getBoardNumber() == i.getVehicle().getBoardNumber()){
                count++;
            }
        }
        if(count > max){
            max = count;
            most = i.getVehicle();
        }
    }
    if(most != null){
        System.out.println("Most Rented Vehicle:\n" + most);
        System.out.println("Number of times it has been rented : "+ max );
    }
    else
        System.out.println("No rentals found.");
}

public void showVIP(){
    boolean found = false;
    ArrayList<Integer> printed = new ArrayList<>();
    for(Rentals i : rentals){
        int id = i.getCustomer().getId();
        if(printed.contains(id))
            continue;
        int count = 0;
        for(Rentals j : rentals){
            if(j.getCustomer().getId() == id && !j.isContractStatus()){
                count++;
            }
        }
        if(count >= 5){
            System.out.println(i.getCustomer());
             System.out.println("Number of times rented : "+ count);
            printed.add(id);
            found = true;
        }
    }
    if(!found) System.out.println("No VIP customers found.");
}
}
