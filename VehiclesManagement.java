/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class VehiclesManagement {
    ArrayList <Vehicle> vehicles = new ArrayList<>();
   public void addVaiechel(Vehicle obj , boolean print){
        boolean found=false;
       for(Vehicle i : vehicles){
           if(i.getBoardNumber()==obj.getBoardNumber()){
               found=true;
               break;
           }
       }
       if(!found){
       vehicles.add(obj);
       if(print){
        System.out.println("Done added your vaiechel succesfully .");
       }
               }
       else
           System.out.println("sorry the board number is already exists ");
   }
   public void removeVaiechel( int boardNumber){
       boolean f=true;
       for(int i=0;i<vehicles.size();i++){
           if(vehicles.get(i).getBoardNumber()==boardNumber){
               if(!vehicles.get(i).isAvailable()){
                   System.out.println("Cannot delete vehicle is current rented .");
                   return;
               }
       vehicles.remove(i);
       f=false;
       break;
           }
            }
       if(!f){
           System.out.println("Done delet a vaiechel succesfully .");
       }
       else{
            System.out.println(" not found the vaiechel .");
       }
   }
    public void search(int boardNumber){
       boolean f=true;
       for(Vehicle i : vehicles){
           if(i.getBoardNumber()==boardNumber){
               System.out.println(i);
       f=false;
       break;
           }
       }
       if(f) {
            System.out.println(" not found the vaiechel .");
       }
    }
    public void showVehicles(){
       boolean f=true;
       for(Vehicle i : vehicles){
           System.out.println(i); 
           f=false;
       }
       if(f) {
            System.out.println(" not vehicles found.");
       }
    }
    public void show_Available_Vehicles(){
       boolean f=true;
       for(Vehicle i : vehicles){
           if(i.isAvailable()){
               System.out.println(i); 
               f=false;
           }
       }
       if(f) {
            System.out.println(" not available vehicles found.");
       }
    }
    public Vehicle get_Vehicle_By_BoardNumber(int boardNumber){
    for(Vehicle i : vehicles){
        if(i.getBoardNumber() == boardNumber){
            return i;
        }
    }
    return null;
}
}
    
