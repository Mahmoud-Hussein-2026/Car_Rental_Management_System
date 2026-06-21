/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class CustomerManager {
    ArrayList <Customer> customers = new ArrayList<>();
    Scanner in = new Scanner(System.in);
   public void addCustomer(Customer obj , boolean print){
        boolean found=false;
        for(Customer i : customers){
            if(i.getId()==obj.getId()){
                found = true;
            }
        }
        if(!found){
       customers.add(obj);
       if(print){
         System.out.println("Done added customer succfully.");
       }
        }
        else{
            System.out.println("Sorry this id customer is already exists");
        }
   }
   public void search(int id){
       boolean f=true;
       for(Customer i : customers){
           if(i.getId()==id){
               System.out.println(i);
       f=false;
       break;
           }
       }
       if(f) {
            System.out.println(" not found the customer .");
       }
    }
    public void showCustomers(){
       boolean f=true;
       for(Customer i : customers){
           System.out.println(i); 
           f=false;
       }
       if(f) {
            System.out.println(" not customers found.");
       }
    }
    public Customer get_Customer_By_Id(int id){
    for(Customer i : customers){
        if(i.getId() == id){
            return i;
        }
    }
    return null;
}
    public void changInfo(int customerID ,String name, int n){
            in.nextLine();
         boolean f=true;
        Customer current=null;
       for(Customer i : customers){
           if(i.getId()==customerID&&i.getName().equalsIgnoreCase(name)){
            current=i;
            System.out.println(current);
           f=false;
           }
       }
        if(f){
           System.out.println(" not customer found that you search his .");
        }
        else{
            if(n==1){
                System.out.println("please enter new customer Name:");
                String newCustomerName=in.nextLine();
                if(current.setName(newCustomerName)){
                    System.out.println("Done chang customer name succfully.");
            }
                else{
                    System.out.println("please enter correct name");
                }
            }
            else if(n==2){
                System.out.println("please enter new customer location:");
                String newCustomerLocation=in.nextLine();
                if(current.setLocation(newCustomerLocation)){
                    System.out.println("Done chang customer location succfully.");
                }
                else{
                    System.out.println("please enter correct location");
                }
            }
            else if(n==3){
                System.out.println("please enter new customer phone number:");
                String newCustomerphone=in.next();
            in.nextLine();
                if(current.setPhoneNumber(newCustomerphone)){
                    System.out.println("Done chang customer phone number succfully.");
                }
                else{
                    System.out.println("please enter correct number.");
                }
            }
    }
    }
}
