WTC AI Curriculum - Design Pattern 

Implementation Challenge

Overview

This repository contains refactored code examples demonstrating different software design patterns.

The goal of this exercise was to identify problems in existing code and improve maintainability by applying appropriate design patterns.



1. Strategy Pattern - Shipping Calculator

File:
Strategy_shipping.js

Problem:
The original code contained many conditional statements for different shipping methods and countries.

Solution:
Implemented the Strategy pattern by separating each shipping calculation into its own strategy.

Benefits:
- Easier to add new shipping methods
- Reduced complex if/else statements
- Improved code readability
- Better separation of responsibilities



2. Factory Pattern - Database Connections

File:
Factory_database.py

Problem:
Creating different database connections required complex initialization logic.

Solution:
Implemented the Factory pattern to handle object creation.

Benefits:
- Simplifies object creation
- Makes adding new database types easier
- Keeps creation logic in one place



3. Adapter Pattern - Payment Processing

File:
adapter_payments.ts

Problem:
Different payment APIs had incompatible interfaces.

Solution:
Implemented the Adapter pattern to make external payment systems work with the application's interface.

Benefits:
- Allows integration with different payment providers
- Reduces changes to existing code
- Improves flexibility and maintainability



Reflection

Implementing design patterns improved the structure and readability of the code.

Future changes will be easier because new features can be added without modifying large sections of existing code.

The main challenge was understanding where each pattern was useful and applying it without changing the original behavior.
