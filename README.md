# 🚗 Car Rental Management System 
<p align="center">
  <b>English</b> • 
  <a href="./README_AR.md">🔤 النسخة العربية</a>
</p>

---
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
  * 📄 **[Main.java](./Main.java)**: The main execution gateway managing the interactive multi-level console menus.
* 📂 **Models (Domain Domain Layer):**
  * 📄 **[Vehicle.java](./Vehicle.java)**: Abstract base class representing core vehicle metadata.
  * 📄 **[Car.java](./Car.java)**: Handles standard vehicle specifications, including fuel and comfort features.
  * 📄 **[Motors.java](./Motors.java)**: Manages motorcycle profiles and sidecar additions.
  * 📄 **[Truck.java](./Truck.java)**: Manages heavy transport vehicle profiles and refrigeration capabilities.
  * 📄 **[Customer.java](./Customer.java)**: Abstract representation of a system client with built-in regex-like validations.
  * 📄 **[Person.java](./Person.java)**: Subclass for individual renters tracking legal age and driver licenses.
  * 📄 **[Institution.java](./Institution.java)**: Subclass for business entities tracking commercial registration and custom discount rates.
* 📂 **Services (Business Logic Layer):**
  * 📄 **[VehiclesManagement.java](./VehiclesManagement.java)**: Controls data operations and inventory constraints for the fleet.
  * 📄 **[CustomerManager.java](./CustomerManager.java)**: Controls client directories and profile mutation logic.
  * 📄 **[Rentals.java](./Rentals.java)**: The core transaction entity storing rental timelines, state, and base billing.
  * 📄 **[RentalsManager.java](./RentalsManager.java)**: The primary workflow coordinator handling rental lifecycle, check-ins, reporting, and analytic calculations.
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
- This repository is a reflection of my learning journey. I am aware that the current code can be further optimized, and I am actively working on refactoring and adding new features to improve its performance and structure
---
## 👨‍💻 About the Author

| Profile | Details |
| :--- | :--- |
| **Full Name** | Mahmoud Hussain |
| **Academic Role** | Informatics Engineering Student |
| **University** | Damascus University |
| **Focus Areas** | Backend Development • Software Architecture • Algorithmic Problem Solving |
| **Connect With Me** | [📩 Official LinkedIn Profile](https://linkedin.com/in/mahmoud-hussein-dev) |  


---
