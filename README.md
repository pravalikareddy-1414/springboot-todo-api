# 📝 Spring Boot ToDo API

A simple **To-Do List REST API** built using **Spring Boot**.  
This project demonstrates CRUD operations (Create, Read, Update, Delete), filtering by **Status** and **Priority**, and in-memory storage for tasks.

---

## 🚀 Features
- Add new tasks with auto-generated IDs  
- Update existing tasks (title, description, status, priority)  
- Delete tasks by ID  
- Retrieve all tasks or a single task by ID  
- Filter tasks by:
  - **Status** → `PENDING`, `IN_PROGRESS`, `COMPLETED`
  - **Priority** → `LOW`, `MEDIUM`, `HIGH`
- Default values:
  - Status → `PENDING`
  - Priority → `MEDIUM`

---

## 🛠️ Tech Stack
- Java 17  
- Spring Boot 3.x  
- Spring Web (REST)  
- In-memory storage (using Java Collections)  

---

## 📌 API Endpoints

### Base URL
