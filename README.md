# Khana Ghar Menu Management System (Java)

A lightweight Java application designed to model, filter, and display menu items for a local restaurant (**Khana Ghar**). This project demonstrates fundamental Object-Oriented Programming (OOP) concepts, object array manipulation, and conditional filtering logic in Java.

---

## 📌 Project Overview

This program creates a blueprint for restaurant menu items (`Khanaghar` class) and executes custom searches over an array of menu objects (`KhanaGharMenu` class). It allows management to view items based on specific requirements, such as dietary preferences, price points, and item availability.

---

## ✨ Features

* **Custom Blueprint (`Khanaghar` Class):** Attributes include item name, price, category, vegetarian status, and availability status.
* **Formatted String Output:** Overridden `toString()` method for clean data representation.
* **Custom Filtering Queries:**
  * View complete restaurant menu.
  * Filter purely Vegetarian vs. Non-Vegetarian items.
  * Filter available Non-Vegetarian items priced over **NPR 100**.
  * Filter available Vegetarian items within budget ranges.

---

## 🛠️ Code Structure

| File / Class | Description |
| :--- | :--- |
| `Khanaghar` | Model class representing individual menu items with private properties and constructor initialization. |
| `KhanaGharMenu` | Main executable class holding the menu array and loop-filtering algorithms. |

---

## 📋 Sample Menu Data

The system initializes with popular traditional Nepalese menu items:

* **Khana Sets:** Dal Bhat Set, Chicken Khana, Mutton Khana
* **MOMO & Snacks:** Veg Chowmein, Chicken MOMO, Veg MOMO, Buff MOMO
* **Chiya-Nasta:** Milk Tea, Lemon Tea

---

## 🚀 How to Run

1. **Clone the Repository:**
   ```bash
   git clone [https://github.com/YOUR-USERNAME/KhanaGhar-Menu-System.git](https://github.com/YOUR-USERNAME/KhanaGhar-Menu-System.git)# Khana-ghar
   Navigate to Project Directory:
   Bash
   
   cd KhanaGhar-Menu-System
   
   Compile the Java Files:
   Bash
   
   javac KhanaGharMenu.java
   
   Run the Program:
   Bash
   
   java KhanaGharMenu
This is a simple demo for the java program with its class and object with perfect example
