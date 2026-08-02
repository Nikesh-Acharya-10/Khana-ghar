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
It is a program written using class method and constructor in oop .code is written in java .

A traditional Nepali restaurant "Khana Ghar" in Dharan wants to track their
daily menu items. Create "KhanaGharMenu.java":
• Attributes: itemName, price, category (Dal-Bhat, Momo, Chowmein,
Chiya-Nasta,etc), isVegetarian, isAvailable (add your own attributes)
• Create menu items like (or nicely formatted output using escape
sequences or any way you like):
   • Dal-Bhat Set (Rs. 120)
   • Masala Chiya (Rs. 15)
   • Dharane Kalo Bangur (Rs. 400)
   • Sekuwa (Rs. 200)
• Display a formatted menu.
• Find and display all vegetarian items only
• Find and display all non-vegetarian items only
• Display all non-vegetarian items with a price greater than Rs. 100 and isAvailable=true
• Display all vegetarian items with a price less than Rs. 50 and  isAvailable=true
