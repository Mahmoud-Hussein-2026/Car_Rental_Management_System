/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.main;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
/**
 *
 * @author Mahmoud Hussein
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        VehiclesManagement manager = new VehiclesManagement();
        CustomerManager management = new CustomerManager();
        RentalsManager rentalsManager = new RentalsManager();
   Vehicle car1 = new Car(55212, "BMW", "M4",200,true,"electric",true,5);
        manager.addVaiechel(car1 , false);
   Vehicle motor1 = new Motors(2757, "PART","desert",100, true, 180, false);
        manager.addVaiechel(motor1 , false);
   Vehicle truck1 = new Truck(301, "Volvo", "F1", 100, true, 20000, true);
        manager.addVaiechel(truck1 , false);
   Customer person1 = new Person(1,2007,12,8, 2, "MAHMOUD OMAR HUSSEIN", "Damascus", "0992080972");
        management.addCustomer(person1 , false);
   Customer inst1 = new Institution(2001, 10, 3, "TechCorp", "Damascus", "0911234567");
       management.addCustomer(inst1 , false);
        while (true) {
            System.out.println("\n    \" SYSTEM CAR RENTAL COMPANY :\" \n\n ");
            System.out.println("please choice number :\n"
                    + " 1 _ vehicles managment.\n"
                    + " 2 _ Customers managment.\n"
                    + " 3 _ rentals managment.\n"
                    + " 4 _ Reports .\n"
                    + " 5 _ To Exit .\n");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    boolean flag = true;
        while (flag) {
            System.out.println(" \n  Vehicel Managment \n"
                    + " 1 _ add viechel.\n"
                    + " 2 _ delete viechel.\n"
                    + " 3 _ search to viechel by board number.\n"
                    + " 4 _ view viechels.\n"
                    + " 5 _ view available viechels.\n"
                    + " 6 _ exit to main screen.");
            int choiceCase1 = in.nextInt();
            in.nextLine();
            switch (choiceCase1) {
                case 1:
                    int type;
                    while(true){
            System.out.println("Choose type your vehicel:\n"
                    + " 1 - Car .\n"
                    + " 2 - Motor .\n"
                    + " 3 - Truck .");
              type = in.nextInt();
            if( type==1 || type==2 || type==3){
                break;
            }
            else{
                System.out.println("please choice into the list ethir 1 or 2 or 3 .");
            }
                    }
            int boardNumber;
            while (true) {
                System.out.print("Please enter board number your vehicel : ");
                boardNumber = in.nextInt();
                in.nextLine();
                if (boardNumber >= 10 && boardNumber <= 999999) {
                    break;
                } else {
                    System.out.println("the board number must be 6 numbers or less .");
                }
            }
            System.out.print("Please enter Brand your vehicel: ");
            String brand = in.nextLine();
            System.out.print("Please enter Model your vehicel: ");
            String model = in.nextLine();
            int price;
            while(true){
            System.out.print("Please enter Daily Price: ");
            price = in.nextInt();
            if(price<=0){
                System.out.print("pleas enter daily price greater than 0");
            }
            else{
                break;
            }
            }
            in.nextLine();
            boolean available = true;
            if (type == 1) {
                String fuelType;
                while (true) {
                    System.out.print("Please enter Fuel Type your car : \n"
                            + " 1 - petrol .\n"
                            + " 2 - diesel.\n"
                            + " 3 - electric.");
                    int typeFuel = in.nextInt();
                    if (typeFuel == 1) {
                        fuelType = "petrol";
                        break;
                    } else if (typeFuel == 2) {
                        fuelType = "diesel";
                        break;
                    } else if (typeFuel == 3) {
                        fuelType = "electric";
                        break;
                    } else {
                        System.out.println("Please choice Number into list 1 or 2 or 3 .");
                    }
                }
                boolean ac = false;
                while (true) {
                    System.out.print("Please choice is your car Conditioner or not : \n"
                            + " 1 _ True .\n"
                            + " 2 _ False .");
                    int condition = in.nextInt();
                    if (condition == 1) {
                        ac = true;
                        break;
                    } else if (condition == 2) {
                        ac = false;
                        break;
                    } else {
                        System.out.println("Please choice Number into list 1 or 2.");
                    }
                }
                System.out.print("Please enter Seats Number your car : ");
                int seats = in.nextInt();
                Car car = new Car(boardNumber, brand, model, price, available, fuelType, ac, seats);
                manager.addVaiechel(car ,true);
            }
            else if (type == 2) {
                System.out.print("Please enter Capacity engain your motor : ");
                int capacity = in.nextInt();
                boolean sideCar = false;
                while (true) {
                    System.out.print("Please choice is your motor contain a sidecar or not : \n"
                            + " 1 _ True .\n"
                            + " 2 _ False .");
                    int side = in.nextInt();
                    if (side == 1) {
                        sideCar = true;
                        break;
                    } else if (side == 2) {
                        sideCar = false;
                        break;
                    } else {
                        System.out.println("Please choice Number into list 1 or 2.");
                    }
                }
                Motors motor = new Motors(boardNumber, brand, model, price, available, capacity, sideCar);
                manager.addVaiechel(motor ,true);
            }
            else if (type == 3) {
                System.out.print("Please enter Payload your truk : ");
                int payload = in.nextInt();
                boolean cooler = false;
                while (true) {
                    System.out.print("Please choice is your truk cooler or not : \n"
                            + " 1 _ True .\n"
                            + " 2 _ False .");
                    int cool = in.nextInt();
                    if (cool == 1) {
                        cooler = true;
                        break;
                    } else if (cool == 2) {
                        cooler = false;
                        break;
                    } else {
                        System.out.println("Please choice Number into list 1 or 2.");
                    }
                }
                Truck truck = new Truck(boardNumber, brand, model, price, available, payload, cooler);
                manager.addVaiechel(truck ,true);
            }
            
            break;
                case 2:
                    System.out.println("please enter board number the vehicel that you want delet it :");
                    int boardRemove = in.nextInt();
                    manager.removeVaiechel(boardRemove);
                    break;
                case 3:
                    System.out.println("please enter board number the vehicel that you want search on it :");
                    int boardSearch = in.nextInt();
                    manager.search(boardSearch);
                    break;
                case 4:
                    System.out.println("All vehicels are :");
                    manager.showVehicles();
                    break;
                case 5:
                    System.out.println("All available vehicels are :");
                    manager.show_Available_Vehicles();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    System.out.print("please choice into the numbers list");
                    break;

            }
        }
        break;
    case 2:
        boolean fla = true;
        while (fla) {
            System.out.print("  \n  Customers Managment \n"
                    + " 1 _ add Customer.\n"
                    + " 2 _ search to customer by his ID.\n"
                    + " 3 _ view all customers.\n"
                    + " 4 _ Chang customer information.\n"
                    + " 5 _ exit to main screen.");
            int choiceCase2 = in.nextInt();
            in.nextLine();
            switch (choiceCase2) {
                case 1:
            System.out.println("Choose type the customer:\n"
                    + " 1 - person .\n"
                    + " 2 - Institution.");
            int typeCustomer = in.nextInt();
            System.out.println("Please enter customer ID : ");
            int customerID = in.nextInt();
            in.nextLine();
            System.out.println("Please enter customer name: ");
            String customerName = in.nextLine();
            System.out.println("Please enter customer location: ");
            String location = in.nextLine();
           String phone = null;
                while(true){
            System.out.println("Please enter customer phone number : ");
             phone = in.next();
            in.nextLine();
            boolean num = true;
            for(int i=0 ; i<phone.length() ; i++){
            if(!Character.isDigit(phone.charAt(i))){
              num = false;
                break;
            }
    }
                if(phone.length() < 8 || !num){
                System.out.println(       "\" wrong number. \"");
            }
                else{
                    break;
                }
            }
            if (typeCustomer == 1) {
                System.out.println("please enter your license number: ");
                int license = in.nextInt();
                while(true){
                    int birthYear;
                    int birthMonth;
                    int birthDay;
                    while(true){
                System.out.println("please enter your birth year: ");
                 birthYear = in.nextInt();
                if(birthYear>1930&&birthYear<=2026){
                    break;
                }
                    }
                    while(true){
                System.out.println("please enter your birth month: ");
                birthMonth = in.nextInt();
                if(birthMonth>0&&birthMonth<=12){
                    break;
                }
                    }
                    while(true){
                System.out.println("please enter your birth day: ");
                birthDay = in.nextInt();
                if(birthDay>0&&birthDay<=31){
                    break;
                }
                    }
                Person person = new Person(license, birthYear, birthMonth, birthDay, customerID, customerName, location, phone);
                int age = (int) ChronoUnit.YEARS.between(person.getBirtDay(),LocalDate.now());
                if(age<18){
                    System.out.print("Age Customer must be bigger 18");
                }
                else{
                management.addCustomer(person , true);
                break;
                }
                }
            } else if (typeCustomer == 2) {
                System.out.println("please enter register Number: ");
                int register = in.nextInt();
               int rate;
               while(true){
                   System.out.println("please enter the discount Rate (0-100): ");
                   rate = in.nextInt();
                   if(rate >= 0 && rate <= 100){
                       break;
                   }
                   System.out.println("Discount rate must be between 0 and 100.");
               }
                Institution institution = new Institution(register, rate, customerID, customerName, location, phone);
                management.addCustomer(institution , true);
            } else {
                System.out.println("please choice into the list ethir 1 or 2 .");
            }
            break;
                case 2:
                    System.out.println("please enter customer ID that you want search on him:");
                    int Id = in.nextInt();
                    management.search(Id);
                    break;
                case 3:
                    System.out.println("All customers thim :\n");
                    management.showCustomers();
                    break;
                case 4:
                    System.out.println("please enter customr ID that you want chang his information :");
                    int customerChang = in.nextInt();
                    in.nextLine();
                    System.out.println("please enter customr Name that you want chang his information :");
                    String nameChang = in.nextLine();
                    System.out.println("   Changing customer information \n"
                            + " 1 _ chang customer name .\n"
                            + " 2 _ chang customer location .\n"
                            + " 3 _ chang customer phone number .");
                    int n = in.nextInt();
                    in.nextLine();
                    management.changInfo(customerChang,nameChang, n);
                    break;
                case 5:
                    fla = false;
                    break;
                default:
                    System.out.print("please choice into the numbers list");
                    break;
            }
        }
        break;
    case 3:
        boolean rentalFlag = true;
        while (rentalFlag) {
            System.out.println("\n Rentals Management\n\n"
                    + "1 - Add Rental\n"
                    + "2 - Return Vehicle\n"
                    + "3 - Show Active Contracts\n"
                    + "4 - Show Finished Contracts\n"
                    + "5 - Show Rented Vehicles\n"
                    + "6 - Show Late Rentals\n"
                    + "7 - Search Rentals By Date Range\n" 
                    + "8 - Search Rentals By Customer name\n"
                    + "9 _ Show Institution Rentals\n"
                    + "10 _Show Customers by vehicle \n"
                    + "11 _ Exit to main screen .\n");
            int rentalChoice = in.nextInt();
            switch (rentalChoice) {
                case 1:
                    System.out.print("Please Enter Rental ID: ");
                    int rentalId = in.nextInt();
                    System.out.print("Please Enter Vehicle Board Number: ");
                    int board = in.nextInt();
                    Vehicle vehicle = manager.get_Vehicle_By_BoardNumber(board);
                    if (vehicle == null) {
                        System.out.println("Vehicle not found.");
                        break;
                    }
                    else{
                        System.out.print(vehicle);
                    }
                    System.out.print("Please Enter Customer ID: ");
                    int customerId = in.nextInt();
                    Customer customer = management.get_Customer_By_Id(customerId);
                    if (customer == null) {
                        System.out.println("Customer not found.");
                        break;
                    }
                    else{
                        System.out.print(customer);
                    }
                    System.out.print("Please Enter current Year: ");
                    int year = in.nextInt();
                    System.out.print("Please Enter current Month: ");
                    int month = in.nextInt();
                    System.out.print("Please Enter current Day: ");
                    int day = in.nextInt();
                    int rentalDays;
                    while(true){
                    System.out.print("Please Enter Rental Days: ");
                      rentalDays = in.nextInt();
                      if(rentalDays <= 0){
                       System.out.println("Rental days must be greater than 0.");
                           }
                      else{
                          break;
                      }
                    }
             Rentals rental = new Rentals(rentalId,vehicle,customer,year, month,day,rentalDays);
                    rentalsManager.addRental(rental);
                    break;
                case 2:
                    System.out.print("Please Enter Rental ID: ");
                    int returnRentalId = in.nextInt();
                 Rentals returnedRental = rentalsManager.search_Rental_ById(returnRentalId);
                    if(returnedRental == null){
                        System.out.println("Rental not found.");
                        break;
                    }
                    if(!returnedRental.isContractStatus()){
                   System.out.println("This rental is already closed.");
                    break;
                       }
                    int returnYear;
                    int returnMonth;
                    int returnDay;
                    while(true){
                    System.out.println("Please Enter Return Year: ");
                            returnYear = in.nextInt();
                            System.out.println("please Enter Return Month: ");
                             returnMonth = in.nextInt();
                            System.out.println("please Enter Return Day: ");
                             returnDay = in.nextInt();
                            LocalDate returnData =LocalDate.of(returnYear,returnMonth,returnDay);
                            if(returnData.isBefore(returnedRental.getRentStart())){
                                System.out.print("impossible , the return Data befor rent start data .");
                            }
                            else{
                                break;
                            }
                    }
                            returnedRental.returnVehicle(returnYear, returnMonth, returnDay);
                            System.out.println("Vehicle returned successfully.");
                            returnedRental.printCheck();
                            break;
                    case 3:
                           System.out.println("\n Active Contracts :\n");
                            rentalsManager.show_Active_Contracts();
                            break;
                    case 4:
                           System.out.println("\n Finished Contracts :\n");
                            rentalsManager.show_Finished_Contracts();
                            break;
                    case 5:
                            System.out.println("\n Rented Vehicles :\n");
                            rentalsManager.show_Rented_Vehicles();
                            break;
                    case 6:
                    System.out.println("\n Late Rentals :\n");
                    rentalsManager.show_Late_Rentals();
                             break;
                    case 7:
                        int searchType;
                        while(true){
                        System.out.println("Choose Type:\n\n"
                           +"1 - Motors Only\n"
                           +"2 - All Vehicles");
                         searchType = in.nextInt();
                        if(searchType==1||searchType==2){
                            break;
                        }
                        }
                        System.out.print("please enter Start Year: ");
                        int startYear = in.nextInt();
                        System.out.print("please enter Start Month: ");
                        int startMonth = in.nextInt();
                        System.out.print("please enter Start Day: ");
                        int startDay = in.nextInt();
                        System.out.print("please enter End Year: ");
                        int endYear = in.nextInt();
                        System.out.print("please enter End Month: ");
                        int endMonth = in.nextInt();
                        System.out.print("please enter End Day: ");
                        int endDay = in.nextInt();
                   rentalsManager.show_vehicle_byDataRang(searchType,startYear,startMonth,startDay,endYear,endMonth,endDay);
                        break;
                    case 8:
                        System.out.print("Please Enter Customer Name: ");
                          in.nextLine();
                          String searchName = in.nextLine();
                          rentalsManager.show_Rentals_ByCustomerName(searchName);
                         break;
                    case 9:
                        rentalsManager.show_Rentals_ByInstitution();
                         break;
                    case 10:
                       System.out.print("Please Enter Vehicle Board Number: ");
                       int searchBoard = in.nextInt();
                       rentalsManager.showCustomersByVehicle(searchBoard);
                         break;
                    case 11:
                          rentalFlag = false;
                        break;
                    default :
                        System.out.print("please choice into the numbers list");
                    break;
                          }
                    }
                  break;
               case 4:
                   boolean reportFLAG = true;
                   while(reportFLAG){
                  System.out.println("\n Reports\n"
                       + "1 - Total Revenue\n"
                       + "2 - Most Rented Vehicle\n"
                       + "3 - VIP Customers\n"
                       + "4 - Exit to main screen.");
                       int reportChoice = in.nextInt();
                       switch(reportChoice){
                        case 1:
                       rentalsManager.totalRevenue();
                       break;
                        case 2:
                        rentalsManager.mostRentedVehicle();
                            break;
                        case 3:
                           rentalsManager.showVIP();
                            break;
                       case 4:
                         reportFLAG = false;
                       break;
                       default :
                       System.out.println("please chois into the number list.");
                       break;
                       }
                   }
                          break;
                case 5: 
                         System.out.print(" THANK YOU ");
                          return;
                 default:
                      System.out.print("please choice into the numbers list");
                    break;
            }
        }
    }
}
