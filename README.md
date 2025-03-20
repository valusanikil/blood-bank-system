# 🩸 Blood Bank Management System (Full Stack Project)

## 📌 Project Overview
The **Blood Bank Management System** is a full-stack web application designed to streamline the donation and supply of blood, supporting both **users** and **admins**. The system efficiently manages blood stock, user registrations, and critical urgent requirements.

This project demonstrates expertise in **Java Spring Boot**, **Angular**, **RESTful API development**, and **frontend-backend integration**.

---

## 🌟 Features Implemented

### 🔐 **User Module**
- **Registration & Login**: Secure forms with validations
- **Blood Availability Check**: Search blood by area, state, blood group
- **View Detailed Blood Information**
- **Urgent Requirements**: See the list of locations where blood is needed immediately

### 🛠 **Admin Module**
- **Admin Login & Registration**
- **Add / Update / Delete Blood Records**
- **Manage blood inventory dynamically**
- **Track user activities (future enhancement ready)**

### 💾 **Blood Inventory Management**
- Complete CRUD operations on the blood data
- Real-time data filtering based on user inputs
- Highlights urgent blood requirements

---

## 📡 **Backend REST API Endpoints (Spring Boot)**
| Endpoint                         | Method  | Description                                |
|----------------------------------|-------- |--------------------------------------------|
| `/user/register`                 | POST    | Register a new user                        |
| `/user/login`                    | POST    | User login                                 |
| `/admin/register`                | POST    | Admin registration                        |
| `/admin/login`                   | POST    | Admin login                                |
| `/blood/available`               | GET     | List all available blood entries           |
| `/blood/add`                     | POST    | Add new blood record (Admin only)          |
| `/blood/update/{id}`             | PUT     | Update blood record (Admin only)           |
| `/blood/delete/{id}`             | DELETE  | Delete blood record (Admin only)           |
| `/blood/details/{id}`            | GET     | Fetch detailed view of a blood record      |
| `/blood/urgent`                  | GET     | List of urgent blood requirements          |

✅ **Swagger URL:** `http://localhost:8080/swagger-ui/`

---

## 🖥 **UI Screens - (Fully Responsive Design)**

### 🔹 Dashboard (Donation Banner)
<img src="assets/Screenshot 2025-03-19 153315.png" alt="">

### 🔹 Home Page
<img src="assets/Screenshot 2025-03-19 153014.png" alt="">

### 🔹 Admin Login Page
<img src="assets/Screenshot 2025-03-19 153025.png" alt="">

### 🔹 User Login Page
<img src="assets/Screenshot 2025-03-19 153034.png" alt="">

### 🔹 Admin - Blood Availability Table with Update/Delete
<img src="assets/Screenshot 2025-03-19 153132.png" alt="">

### 🔹 Admin - Add New Blood Record Form
<img src="assets/Screenshot 2025-03-19 153142.png" alt="">

### 🔹 User - View Blood Availability
<img src="assets/Screenshot 2025-03-19 153324.png" alt="">

### 🔹 Urgent Blood Requirement List
<img src="assets/Screenshot 2025-03-19 153640.png" alt="">

### 🔹 Detailed Blood Record View
<img src="assets/Screenshot 2025-03-19 153701.png" alt="">

---

## 📂 **Project Structure**
```
📁 UserAdminRegistration (Spring Boot Backend)
│
├── controller/        # REST APIs for Admin/User
├── service/           # Business Logic
├── repository/        # Spring JPA Repositories
├── entity/            # Data Models (User, Admin, Blood)
├── config/            # Swagger Configurations
└── exception/         # Custom Exceptions Handling
```

```
📁 BloodBank (Angular Frontend)
│
├── components/        # Reusable UI Components
├── services/          # API Integrations
├── models/            # TypeScript Interfaces
└── app.module.ts      # Main Angular Module
```

---

## ✅ **Key Challenges Addressed**
- ✔ Built a full **User-Admin Login-Registration flow**
- ✔ Handled complex **CRUD operations** with **real-time Angular data binding**
- ✔ Developed **RESTful APIs** for smooth frontend-backend communication
- ✔ Implemented **search filters** dynamically on both admin and user sides
- ✔ Integrated **Swagger** for API testing and documentation
- ✔ Built future-ready structures for **role-based access** and **JWT security upgrade**

---

## 🔄 **Deployment Ready**
✅ Backend (Spring Boot) - Ready to deploy on AWS Elastic Beanstalk / Azure / Google Cloud  
✅ Frontend (Angular) - Compatible with Netlify / Vercel / Firebase Hosting  
✅ **MySQL database** configurable for both local and cloud environments  
✅ Docker-ready architecture (can assist on Dockerizing this if needed)

---

## 🚀 **Running the Project Locally**

### **Backend**
```bash
cd UserAdminRegistration
mvn clean install
mvn spring-boot:run
```
Visit: `http://localhost:8080/swagger-ui/`

### **Frontend**
```bash
cd BloodBank
npm install
ng serve --open
```
App URL: `http://localhost:4200`

---

## 💡 **Future Enhancements**
- 🔑 JWT-based Token Authentication
- 📊 Admin Dashboard with Analytics and Charts
- 📩 Email Notifications to donors
- 📱 Mobile Responsiveness (Angular Material / Bootstrap)
- 🌐 Cloud Deployment with CI/CD pipeline

---

## 👨‍💻 **Developed By - Nikil Valusa**
### 🏆 **Tech Stack Expertise**
✅ Java | Spring Boot | REST APIs  
✅ Angular | TypeScript | CSS  
✅ MySQL Database  
✅ Swagger Integration  
✅ Exception Handling & Clean Code Structure  

---
