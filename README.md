🎓 Student Management System

A desktop-based Student Management System developed using Java Swing and MySQL. The application provides a simple interface for students to register, log in, view their profile, check available courses and attendance, submit feedback, and view their student ID card.

📌 Project Overview

The Student Management System is designed to manage basic student information through a Java desktop application.

The application uses Java Swing/AWT for the graphical user interface and JDBC with MySQL for storing and retrieving student information.

✨ Features

* 👤 Student Registration
* 🔐 Student Login Authentication
* 🏠 Student Dashboard
* 📋 Student Profile
* 📚 Available Courses
* 📊 Student Attendance
* 💬 Student Feedback
* 🪪 Student ID Card
* 🗄️ Student Database Management
* 🔄 MySQL Database Connectivity using JDBC
* 🧹 Clear form functionality
* 🚪 Logout functionality

🖥️ Application Modules

1. Student Registration

Students can create an account by providing:

* Name
* Email
* Password
* Gender
* City
* Department
* Year
* Hobbies
* Contact Number

2. Student Login

Registered students can log in using their email and password.

After successful authentication, the student is redirected to the dashboard.

3. Student Dashboard

The dashboard provides access to:

* Profile
* Courses
* Attendance
* Feedback
* Student ID Card
* Logout

4. Student Profile

Displays the student’s registered information, including:

* Name
* Email
* Gender
* Address
* Department
* Year
* Hobbies
* Contact

5. Available Courses

The application currently displays:

* Java Programming
* Database Management System
* Web Technologies
* Data Structures
* Computer Networks

6. Attendance

Students can view attendance information for subjects such as:

* Java Programming
* DBMS
* Web Technologies
* Data Structures

7. Feedback

Students can submit feedback through the application. The feedback is stored in the MySQL database.

8. Student ID Card

Generates a student identification view containing:

* Student Name
* Email
* Department
* Year

🛠️ Technologies Used

Technology	Purpose
Java	Application development
Java Swing	Graphical User Interface
Java AWT	UI components and event handling
JDBC	Database connectivity
MySQL	Data storage
MySQL Connector/J	MySQL-Java connectivity
Eclipse	Development IDE

🗂️ Project Structure

com.mainprojstudent
│
├── DBConnection.java
├── login.java
├── register.java
├── dashboard.java
├── profile.java
├── courses.java
├── attendance.java
├── feedback.java
├── studentidcard.java
├── storeindatabase_page.java
└── excution.java

🗄️ Database

The application uses MySQL as the backend database.

Database

company

Main Student Table

mainproj

The student table stores information such as:

name
email
password
gender
address
depart
year
hobb
contact

The feedback functionality uses:

feedback

with fields for:

name
email
message

⚙️ Database Configuration

The application uses JDBC to connect to MySQL.

Default configuration used by the project:

Database: company
Host: localhost
Port: 3306
Username: root

Before running the application, make sure MySQL is installed and running and that the required database and tables are created.

⚠️ Do not commit real database passwords or other credentials to a public GitHub repository. Store sensitive configuration separately.

▶️ How to Run

Prerequisites

Install the following:

* Java JDK
* MySQL Server
* Eclipse IDE or another Java IDE

Steps

1. Clone the repository.

git clone https://github.com/your-username/student-management-system.git

2. Open the project in Eclipse.
3. Start MySQL Server.
4. Create the required database:

CREATE DATABASE company;

5. Create the required tables and columns used by the application.
6. Configure the database connection in DBConnection.java.
7. Make sure the MySQL Connector/J driver is available in the project classpath.
8. Run:

excution.java

9. The Student Login Portal will open.

🔄 Application Flow

Student
   │
   ▼
Login / Register
   │
   ▼
Student Dashboard
   │
   ├── Profile
   │
   ├── Courses
   │
   ├── Attendance
   │
   ├── Feedback
   │
   ├── Student ID Card
   │
   └── Logout
   │
   ▼
MySQL Database

🎯 Learning Outcomes

This project helped demonstrate practical implementation of:

* Core Java
* Object-Oriented Programming
* Java Swing
* AWT Event Handling
* JDBC
* MySQL Database Operations
* SQL Queries
* GUI Application Development
* Form Validation
* Database Integration

🚀 Future Improvements

Possible improvements include:

* Admin login and dashboard
* Admin ability to add/update/delete students
* Real-time attendance management
* Course enrollment
* Password encryption
* Better form validation
* Search and filter students
* Student profile editing
* Improved UI/UX
* Role-based authentication
* Attendance reports
* Export student information to PDF
* Migration to a Java Spring Boot web application

👨‍💻 Author

Shiva Vadla

B.Tech Graduate | Java Full Stack Developer

⸻

⭐ If you find this project useful, consider giving the repository a star!+++++++
