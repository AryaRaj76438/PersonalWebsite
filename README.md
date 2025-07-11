# 🌌 QuantumSyntax

A feature-rich personal portfolio and blog website built with **Spring Boot**, **Thymeleaf**, and **MySQL**.  
Created by **Arya Raj**, final-year B.Tech student at **IIT Guwahati** majoring in Engineering Physics with a minor in Electronics and Communication.

> “Where logic meets imagination, and circuits meet syntax.”

---

[//]: # (## 🌐 Live Demo)

[//]: # ()
[//]: # (🚀 [Visit QuantumSyntax Online]&#40;https://quantumsyntax.netlify.app&#41; *&#40;Replace with your actual deployment URL&#41;*)

[//]: # ()
[//]: # (---)

[//]: # (## 📸 Screenshots)

[//]: # ()
[//]: # (> 👇 Add screenshots to `/static/images/` folder and update these links accordingly.)

[//]: # ()
[//]: # (### 🔹 Home Page)

[//]: # (![Home]&#40;src/main/resources/static/images/screenshot-home.png&#41;)

[//]: # ()
[//]: # (### 🔹 Blog Section)

[//]: # (![Blog]&#40;src/main/resources/static/images/screenshot-blog.png&#41;)

[//]: # ()
[//]: # (### 🔹 About Me)

[//]: # (![About]&#40;src/main/resources/static/images/screenshot-about.png&#41;)

[//]: # ()
[//]: # (---)

## ✨ Features

- 🧠 **About Me**: Academic background, internships, skills, achievements.
- 📚 **Blog Module**: Add, edit, read, and delete blog posts.
- 💻 **Projects Section**: Showcases hardware/software work with GitHub links and live demos.
- 🔒 **Admin Login**: Secured routes using Spring Security.
- 📑 **Research Section**: Listing research publications and experiences.
- 🌗 **Dark Mode Toggle**: Clean modern UI with responsive design.

---

## 🚀 Tech Stack

| Layer         | Tools / Frameworks                          |
|---------------|---------------------------------------------|
| Backend       | Spring Boot, Spring MVC, Spring Security    |
| Frontend      | HTML, CSS, Bootstrap 5, Thymeleaf           |
| Database      | MySQL (JPA + Hibernate)                     |
| Security      | In-Memory Admin Auth (configurable)         |
| Deployment    | Easily deployable on any Spring-supported server |

---

## 🛠️ Setup Instructions

### Prerequisites
- Java 17+
- Maven
- MySQL Server

### Clone the Repo
```bash
git clone https://github.com/AryaRaj76438/QuantumSyntax.git
cd QuantumSyntax
```

### MySQL Configuration

Update `application.properties` with your local DB settings:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/quantum_syntax
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Create the database:
```sql
CREATE DATABASE quantum_syntax;
```

### Run the App

```bash
./mvnw spring-boot:run
```
or from your IDE (`QuantumSyntaxApplication.java`)

---

## 🔐 Admin Login

| Username | Password  | Role  |
|----------|-----------|-------|
| `admin`  | `password`| ADMIN |

(Modify credentials inside `SecurityConfig.java`)

---

## 📁 Folder Structure

```
QuantumSyntax/
├── src/main/java/
│   └── com/QuantumSyntax/blogsite/
│       ├── controller/
│       ├── model/
│       ├── repository/
│       ├── service/
│       └── QuantumSyntaxApplication.java
├── src/main/resources/
│   ├── static/ (CSS, JS, images)
│   ├── templates/ (Thymeleaf HTML files)
│   └── application.properties
└── README.md
```

---

## 🤝 Contribution Guidelines

Contributions, issues, and feature requests are welcome!

1. Fork this repository.
2. Create your feature branch:
    ```bash
    git checkout -b feature/your-feature
    ```
3. Commit your changes:
    ```bash
    git commit -m 'Add your message here'
    ```
4. Push to the branch:
    ```bash
    git push origin feature/your-feature
    ```
5. Open a Pull Request.

---

## 📄 License

This project is licensed under the **MIT License**.

---

## 🙋‍♂️ Author

**Arya Raj**  
Physics & Electronics @ IIT Guwahati  
🔗 [LinkedIn](https://www.linkedin.com/in/aryaraj76438/)  
🔗 [GitHub](https://github.com/AryaRaj76438)

---
