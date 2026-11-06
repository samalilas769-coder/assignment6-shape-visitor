# Assignment 6 — Visitor Pattern

## Project Description
This project demonstrates the Visitor Design Pattern in Java using a shape hierarchy.

The Visitor Pattern allows new operations to be added without changing existing shape classes.

## Technologies
- Java
- IntelliJ IDEA
- Git and GitHub

## Project Structure
- Shape.java — Element interface
- Circle.java — Concrete Element
- Square.java — Concrete Element
- Triangle.java — Concrete Element
- ShapeVisitor.java — Visitor interface
- AreaCalculatorVisitor.java — Concrete Visitor
- DescriptionVisitor.java — Concrete Visitor
- Main.java — Application entry point

## Design Pattern
The Visitor Pattern uses double dispatch through the `accept()` and `visit()` methods.

## Features
1. Calculate the area of different shapes.
2. Display information about shapes.
3. Add new visitors without modifying existing shape classes.

## Sample Output
```text
=== Shape Descriptions ===
Circle with radius: 5.0
Square with side: 4.0
Triangle with base: 6.0 and height: 3.0

=== Shape Areas ===
Circle area: 78.53981633974483
Square area: 16.0
Triangle area: 9.0
```

## Author
Samal Ilyas