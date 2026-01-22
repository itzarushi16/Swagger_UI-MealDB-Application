
# 🍽️ MealDB App & 📘 Swagger UI – Two Separate Spring Boot Applications

This repository contains **two independent Spring Boot applications**:

1. **MealDB App** – Consumes the public MealDB API and returns the meal with the least number of ingredients  
2. **Swagger UI App** – A simple standalone Spring Boot application to demonstrate Swagger UI API documentation

Both applications are **separate projects** and can run independently.

---

## 🥗 1️⃣ MealDB App

### 📌 Description
The **MealDB App** is a Spring Boot REST API that fetches meal data from **TheMealDB public API** and applies business logic to determine which meal requires the **least number of ingredients**.

---

### 🌍 External API Used

```

[https://www.themealdb.com/api/json/v1/1/search.php?s=Arrabiata](https://www.themealdb.com/api/json/v1/1/search.php?s=Arrabiata)

````

---

### 🚀 Features

- Fetch meals from MealDB API
- Count number of ingredients per meal
- Return the meal with the minimum ingredients
- RESTful API design
- Tested using Postman

---

### 🛠️ Tech Stack

- Java  
- Spring Boot  
- Spring Web  
- RestTemplate / WebClient  
- Maven  
- Postman  

---

### 🔗 MealDB API Endpoint

| Method | Endpoint | Description |
|------|---------|-------------|
| GET | `/api/meals/min-ingredients` | Get meal with least ingredients |

---

### ▶️ Run MealDB App

```bash
cd mealdb-app
mvn spring-boot:run
````

Runs on:

```
http://localhost:8080
```

---

### 🧪 Testing with Postman

Request:

```
GET http://localhost:8080/api/meals/min-ingredients
```

Response:

* JSON object of the meal with least ingredients

---

## 📘 2️⃣ Swagger UI App (Simple & Separate)

### 📌 Description

The **Swagger UI App** is a simple standalone Spring Boot project created to demonstrate **API documentation using Swagger UI (OpenAPI)**.

This app is **not connected** to the MealDB App.

---

### 🚀 Features

* Swagger UI integration
* API documentation
* Simple demo REST controller
* OpenAPI specification

---

### 🛠️ Tech Stack

* Java
* Spring Boot
* Spring Web
* Swagger UI
* OpenAPI (springdoc-openapi)

---

### 📦 Swagger Dependency

```xml
<dependency>
  <groupId>org.springdoc</groupId>
  <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
  <version>2.5.0</version>
</dependency>
```

---

### ▶️ Run Swagger UI App

```bash
cd swagger-ui-app
mvn spring-boot:run
```

Runs on:

```
http://localhost:8081
```

---

### 🌐 Swagger UI URL

```
http://localhost:8081/swagger-ui.html
```

or

```
http://localhost:8081/swagger-ui/index.html
```

---

### 📁 Repository Structure

```
Projects/
│
├── mealdb-app/            # MealDB API Project
│   ├── controller/
│   ├── service/
│   └── model/
│
├── swagger-ui-app/        # Simple Swagger UI Project
│   ├── controller/
│   └── config/
│
└── README.md
```

---

## 🎯 Key Learning Outcomes

* Consuming third-party REST APIs
* Applying business logic on API data
* Building RESTful APIs using Spring Boot
* API testing using Postman
* Documenting APIs using Swagger UI
* Managing multiple independent Spring Boot projects

---

## 👩‍💻 Author

**Arushi**
Java & Full Stack Developer

---

⭐
```
