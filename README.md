# Student Course Manager

## Overview

The **Student Course Manager** is a Java-based application developed as part of the CSC 143 (Computer Programming 2) course. This project provides functionality to manage and manipulate student data across multiple courses, demonstrating key concepts in object-oriented programming, data structures, and file handling. The project includes features for counting students in each course, retrieving detailed student information, associating students with specific courses, and running comprehensive unit tests to ensure functionality.

## Features

- **Course and Student Management:** 
  - Count the total number of courses.
  - Retrieve the total number of students in a specific course or across all courses.
  - Find the course in which a specific student is enrolled using their ID.

- **Data Import:**
  - Import course and student data from CSV files.
  - Efficiently manage large datasets using arrays and data structures.

- **Student Information:**
  - Retrieve detailed information about a specific student, including their ID, name, email, and phone number.
  - Sort and compare students based on their last names.

- **Unit Testing:**
  - Comprehensive unit tests for validating the functionality of the `StudentManager` and `Student` classes.

## Project Structure

- **`src/`**: Contains all the Java source files.
  - **`Main.java`**: The entry point of the application, demonstrating the use of the `StudentManager` class.
  - **`Student.java`**: Defines the `Student` class, encapsulating details such as ID, name, email, and phone number, and implementing comparison logic.
  - **`StudentManager.java`**: Manages students across multiple courses, reading data from CSV files, and providing methods to retrieve and manipulate student data.
  - **`StudentManagerInterface.java`**: Defines the methods that `StudentManager` implements, ensuring consistent structure and behavior.
  - **`StudentManagerTest.java`**: Contains unit tests for the `StudentManager` class.
  - **`StudentTest.java`**: Contains unit tests for the `Student` class.
# Student Course Manager

## Overview

The **Student Course Manager** is a Java-based application developed as part of the CSC 143 (Computer Programming 2) course. This project provides functionality to manage and manipulate student data across multiple courses, demonstrating key concepts in object-oriented programming, data structures, and file handling. The project includes features for counting students in each course, retrieving detailed student information, associating students with specific courses, and running comprehensive unit tests to ensure functionality.

## Features

- **Course and Student Management:** Count the total number of courses. Retrieve the total number of students in a specific course or across all courses. Find the course in which a specific student is enrolled using their ID.
- **Data Import:** Import course and student data from CSV files. Efficiently manage large datasets using arrays and data structures.
- **Student Information:** Retrieve detailed information about a specific student, including their ID, name, email, and phone number. Sort and compare students based on their last names.
- **Unit Testing:** Comprehensive unit tests for validating the functionality of the `StudentManager` and `Student` classes.

## Installation and Setup

### Prerequisites

- Java Development Kit (JDK) 8 or higher.
- JUnit for running unit tests.

### Setup

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/your-username/Student-Course-Manager.git
   cd Student-Course-Manager
### Compile Java Classes:
javac src/*.java
### Run the Application:
java src.Main
### Run Unit Tests:
javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar src/*.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore src.StudentManagerTest
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore src.StudentTest


This README file is designed to provide a comprehensive overview of the project, its structure, setup, and usage. It should help anyone who wants to understand, run, or contribute to the project.
