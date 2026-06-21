# 🚗 Car Rental Management System (Java OOP Project)

## 📌 Overview

This project is a console-based Car Rental Management System developed using Java and Object-Oriented Programming (OOP) principles.

It simulates a real-world rental company system that manages:

- Vehicles
- Customers
- Rental contracts
- Revenue reports

The system is fully interactive using a menu-driven console interface.

---

## 🧠 Key Features

### 🚙 Vehicle Management

- Add new vehicles (Car, Motorcycle, Truck)
- Delete vehicle (only if not currently rented)
- Search vehicle by board number
- Display all vehicles
- Display available vehicles only

---

### 👤 Customer Management

- Add customers (Person / Institution)
- Search customer by ID
- Display all customers
- Modify customer information (name, location, phone number)

---

### 📄 Rental Management

- Create rental contracts
- Return vehicles with date tracking
- Prevent renting already rented vehicles
- Track delay days automatically
- View:
  - Active contracts
  - Finished contracts
  - Late rentals
  - Rentals by customer
  - Rentals by date range
  - Institution rentals

---

### 📊 Reports

- Total revenue (active + finished rentals)
- Most rented vehicle
- VIP customers (frequent renters)

---

## 🏗️ System Architecture

The project is built using OOP principles:

### 🔹 Abstraction

- Vehicle (abstract class)
- Customer (abstract class)

### 🔹 Inheritance

- Vehicle → Car, Motorcycle, Truck
- Customer → Person, Institution

### 🔹 Polymorphism

- calcTotalCost()
- toString()

### 🔹 Encapsulation

- Private fields with getters/setters

---

## 📦 Technologies Used

- Java SE
- Object-Oriented Programming (OOP)
- LocalDate API
- ArrayList Collections

---
## 📁 Project Structure

com.example
│
├── Vehicle (abstract)
├── Car
├── Motorcycle
├── Truck
│
├── Customer (abstract)
├── Person
├── Institution
│
├── VehiclesManagement
├── CustomerManager
├── Rentals
├── RentalsManager
│
└── Main

---

## ⚙️ How It Works

1. Run the program
2. Choose from main menu:
   - Vehicle Management
   - Customer Management
   - Rentals Management
   - Reports
3. Perform operations interactively via console input

---

## 💡 Business Logic Highlights

- Vehicles cannot be deleted if currently rented
- Customers cannot rent unavailable vehicles
- Delay fees are automatically calculated
- Institution customers receive discount rates
- Revenue is separated into active and finished contracts

---

## 📈 What I Learned

This project helped me improve:

- Object-Oriented Design
- System structuring
- Real-world business logic implementation
- Input validation
- Java Collections (ArrayList)
- Date handling using LocalDate

---

## 🚀 Future Improvements

- Add database (MySQL / PostgreSQL)
- Add GUI (JavaFX / Swing)
- Add login system (Admin / User roles)
- Export reports to files
- Exception handling improvements

---

## 👨‍💻 Author

Developed by: Mahmoud Hussein

---
