# Task Manager Application by Jayavel

## GitHub Repositories

### Backend  
https://github.com/jayavel0/task-manager-backend

### Frontend  
https://github.com/jayavel0/task-manager-frontend


ask Manager Application

A simple and efficient Task Manager application built with a Spring Boot backend and a clean HTML/CSS/JS frontend.
This project allows users to add, view, and delete tasks stored in a MySQL database.

Features

Add new tasks

View all tasks

Delete tasks

Real-time UI updates

Backend REST API using Spring Boot

MySQL database integration

Tech Stack
Backend

Java 21

Spring Boot 3

Spring Web

Spring Data JPA

MySQL Database

Hibernate ORM

Frontend

HTML

CSS

JavaScript

Fetch API for calling backend

Project Structure
task-manager-backend/
 ├── src/main/java/
 │     └── controller/
 │     └── service/
 │     └── repository/
 │     └── model/
 ├── src/main/resources/
 │     └── application.properties
 ├── pom.xml

task-manager-frontend/
 ├── index.html
 ├── style.css  (if any)
 ├── app.js      (if any)

API Endpoints
Method	Endpoint	Description
GET	/tasks	Get all tasks
POST	/tasks	Add new task
DELETE	/tasks/{id}	Delete a task by ID
How to Run the Backend
1. Clone the repository
git clone https://github.com/jayavel0/task-manager-backend.git
cd task-manager-backend

2. Update database credentials

In src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/taskdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update

3. Run the project

Using Maven:

mvn spring-boot:run


Spring Boot will start at:

http://localhost:8080

How to Run the Frontend
1. Clone the repository
git clone https://github.com/jayavel0/task-manager-frontend.git
cd task-manager-frontend

2. Open the HTML file

Simply open:

index.html

3. Make sure the backend is running

Your frontend calls:

http://localhost:8080/tasks

Database Structure (MySQL)

Table Name: task

Column	Type
id	BIGINT (PK)
text	VARCHAR
priority	VARCHAR
date	VARCHAR
What I Learned

How to build a REST API using Spring Boot

How to connect Spring Boot to MySQL

How CRUD operations work (Create, Read, Delete)

Handling API calls from frontend using JavaScript

 
Contributing

Contributions are welcome. Feel free to open issues or submit pull requests.

License

This project is open-source and available under the MIT License.
