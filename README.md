# OOP Assignment 1: Space Exploration System

## Overview
This Java project demonstrates core Object-Oriented Programming (OOP) principles including:
- **Class Design & Encapsulation:** Private variables, constructors, accessors (getters), and mutators (setters).
- **Inheritance:** `Satellite` and `Rover` subclasses extending the abstract `Spacecraft` superclass.
- **Polymorphism:** Dynamic method dispatch via an abstract method `transmitData()`.
- **Method Overriding & `toString()`:** Demonstrates both explicit and implicit invocation of the `toString()` method.

---

## Class Hierarchy

```text
       [ Spacecraft ] (Abstract Superclass)
            /  \
           /    \
 [ Satellite ]  [ Rover ] (Subclasses)
