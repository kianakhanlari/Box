# Generic Container

A simple Java project that demonstrates the use of Generics by creating a container capable of storing two different types of objects.

## Overview

The `Container<T, U>` class allows storing and retrieving two different types of values in a type-safe manner. The project also includes functionality to swap the stored values and verify the result.

## Features

* Generic class implementation
* Supports two different data types
* Add and retrieve values
* Swap stored values
* Type-safe design using Java Generics

## Technologies Used

* Java
* Generics
* Object-Oriented Programming (OOP)

## Project Structure

```text
src/
├── Container.java
└── Main.java
```

## Example

```java
Container<Integer, String> container = new Container<>();

container.addFirst(10);
container.addSecond("Hello");

System.out.println(container.getFirst());   // 10
System.out.println(container.getSecond());  // Hello

container.swap();
```

## Learning Objectives

This project was created to practice:

* Creating generic classes
* Using multiple type parameters (`<T, U>`)
* Designing reusable components
* Improving type safety
* Working with object references and methods

## Author

Created as a Java Generics practice project.
