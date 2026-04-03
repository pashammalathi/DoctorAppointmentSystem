# Doctor Appointment Booking System

A simple Java-based console application to manage doctor appointments. Users can view available doctors, book appointments, and view booked appointments. This system demonstrates object-oriented programming concepts in Java such as classes, objects, and collections.

---
## Project Description

The Doctor Appointment System is a console-based Java application that allows patients to book appointments with doctors and view all scheduled appointments.  
It is designed for learning purposes and to demonstrate core **Java OOP concepts** in a real-world scenario.

Key functionalities:

- Add doctors with availability schedules.
- Add patients.
- Book appointments between doctors and patients.
- View all booked appointments.

This project stores data in memory (no database required) and uses simple console input/output.

---

## Features

- List all available doctors with specialization and availability.
- Book appointments for patients with selected doctors.
- View all booked appointments.
- Simple console-based menu system for easy navigation.

---

## Technologies Used

- Java SE (Standard Edition)
- Object-Oriented Programming (OOP)
- Collections (ArrayList)
- Scanner for console input

---

## Project Structure
DoctorAppointmentSystem.java
 
-  Doctor.java // Represents doctor with id, name, specialization, and availability
-  Patient.java // Represents patient with id, name, and age
-  Appointment.java // Represents appointment with id, doctor, patient, date, and time
-  BookingSystem.java// Handles adding doctors, patients, booking, and viewing appointments


---

## How to Run

1. Open terminal or command prompt in the **project folder**.

2. Compile the Java program:

   javac src/DoctorAppointmentSystem.java


4. Run the program:
 
   java -cp src DoctorAppointmentSystem

4. You will see a menu like:


  --- Doctor Appointment Booking System ---
1. List Doctors
2. Book Appointment
3. View Appointments
4. Exit
---

## **Sample Doctors**
- Dr. Ramesh (Cardiologist) – Available: Monday to Friday 10 AM - 5 PM
- Dr. Kiran (Dermatologist) – Available: Monday, Wednesday, Friday 1 PM - 6 PM
- Dr. Sahasra (Gynecologist) – Available: Saturday 2 PM - 6 PM

---
## **Sample Patients**
- Manish, 30 years old
- Srilochana, 25 years old
- Divya, 20 years old

## **Sample Appointment**

After booking an appointment, a sample output may look like:

- Appointment booked successfully!
- Appointment ID: 1
- Doctor: Dr. Ramesh (Cardiologist) - Available: Monday to Friday 10 AM - 5 PM
- Patient: Manish, 30 years old
- Date: 2026-04-05 at 10:00 AM
## License

This project is open-source and free to use.

## **Author**
Pasham Malathi
