# Expense-Manager

Angular 9, Spring boot and MySQL Web Applicaton - Expense Tracker
A simple expense tracking application built with Angular 9 and Spring boot that connects to the MySQL database. Application built using spring data JPA to perform database operations. Users can add, list, update, delete, sort, and filter the expenses.

Requirements
Java - 1.8.x

Maven - 3.x.x

Mysql - 5.x.x

Angular - 9.x.x

Node - 12.x.x

Npm - 6.x.x

Steps to Setup
1. Clone the application

git clone https://github.com/RizwannKhan/Expense-Manager.git
2. Create Mysql database

create database expensetracker
3. Change mysql username and password as per your installation

open src/main/resources/application.properties

change spring.datasource.username and spring.datasource.password as per your mysql installation

4. Build and run the app using maven (expensetracker)

mvn package
java -jar target/expensetracker-v1.jar
Alternatively, you can run the app without packaging it using -

mvn spring-boot:run
The app will start running at http://localhost:8080.

Explore Rest APIs
The app defines following CRUD APIs.

GET /api/v1/expenses

POST /api/v1/expenses

GET /api/v1/expenses/{expenseId}

DELETE /api/v1/expenses/{expenseId}
You can test them using postman or any other rest client.

5. Install node modules for angular application (expense-tracker-frontend)

npm install
6. Run the angular application

ng serve
Alternatively, you can run the below command to open the application in default web browser -

ng serve --open


Thanks and Regards
Rizwan
