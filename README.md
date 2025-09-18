# Placement-Management-System

▶ How to Run Placement Management System
🔧 Prerequisites (Applications Needed)

Java 17 (JDK installed and configured in PATH)

Spring Tool Suite (STS) or IntelliJ IDEA / Eclipse (for running Spring Boot)

PostgreSQL + pgAdmin (for database)

Maven (comes built-in with Spring Tool Suite)

Postman (for testing REST APIs)

Git (if you are cloning from GitHub)
-------------------------------------------------------------------------
⚡ Steps to Run

Clone / Download Project

If on GitHub:

git clone https://github.com/your-username/placement-management-system.git
cd placement-management-system


Or directly import the .zip project into STS/Eclipse.
-------------------------------------------------------------------------
Set Up Database in pgAdmin

Open pgAdmin → create a new database:

CREATE DATABASE placementdb;


Note username & password (default: postgres / admin or what you set).

Configure Database in application.properties
Inside src/main/resources/application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/placementdb
spring.datasource.username=postgres
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


Run the Application
---------------------------------------------------------------------------
In STS/Eclipse → Right click project → Run As → Spring Boot App

Or in terminal:

mvn spring-boot:run

-----------------------------------------------------
Access Application

Server will start at → http://localhost:8080

Tables will be auto-created in placementdb.

Test in Postman

Example APIs:

POST http://localhost:8080/students → add student

GET http://localhost:8080/students/1 → get student by ID

PUT http://localhost:8080/students/1 → update student

DELETE http://localhost:8080/students/1 → delete student

Same for /colleges and /certificates

👉 So you need only 3 main things open while running:

STS/Eclipse (to run Spring Boot app)

pgAdmin (to check database tables)

Postman (to test APIs)
