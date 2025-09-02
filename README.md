# Student_Course_Enrollment_System
A Spring Boot + Thymeleaf based Student &amp; Course Enrollment System demonstrating many-to-many mapping between Students and Courses. Features include student &amp; course management, enrollments, search functionality, and a responsive Bootstrap UI with H2/MySQL support


# 🎓 Student & Course Enrollment System (Foundation Project)

A Spring Boot + Thymeleaf based **Student & Course Enrollment System** demonstrating many-to-many relationships (Student ↔ Course via Enrollment).  
This project is designed as a foundation project to understand full-stack development with **Java, Spring Boot, Thymeleaf, JPA, and Bootstrap**.

---

## 📌 Features
- 👨‍🎓 **Student Management**
  - Add, edit, delete students  
  - Search students by name or enrolled course  

- 📚 **Course Management**
  - Add, edit, delete courses  
  - Assign students to multiple courses  

- 🔗 **Enrollment Management**
  - Map students ↔ courses (many-to-many)  
  - Display enrolled students per course  

- 🖥 **UI (Thymeleaf + Bootstrap)**
  - Student registration form  
  - Course creation form  
  - Table showing enrolled students  

---

## 🏗 Tech Stack
- **Backend**: Spring Boot, Spring Data JPA, Hibernate  
- **Frontend**: Thymeleaf, HTML, CSS, Bootstrap  
- **Database**: H2 (in-memory) / MySQL (configurable)  
- **Build Tool**: Maven  

---

## 🚀 Getting Started

### 1️⃣ Clone the repository
```bash
git clone https://github.com/<your-username>/student-course-enrollment.git
cd student-course-enrollment




2️⃣ Configure Database

By default, the project uses H2 in-memory DB.
To use MySQL, update application.properties:


spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


3️⃣ Build & Run
mvn clean install
mvn spring-boot:run


4️⃣ Access Application
Open browser → http://localhost:8080



📂 Project Structure
src/main/java/com/studentmgm/
 ├── controller/      # Controllers (Home, Student, Course, Enrollment)
 ├── model/           # Entities (Student, Course, Enrollment)
 ├── repository/      # JPA Repositories
 ├── service/         # Business logic
 └── StudentMgmApp.java  # Main class

src/main/resources/
 ├── templates/       # Thymeleaf templates (HTML pages)
 ├── static/          # CSS, JS, images
 └── application.properties



📝 License

This project is licensed under the MIT License – feel free to use and modify.

👨‍💻 Developed By Sharanya Nemade
📌 Student Management System Project 🚀




	STUDENT


View students: http://localhost:8080/students
Add student form: http://localhost:8080/students/add
Edit student with ID 5: http://localhost:8080/students/edit/5
Delete student with ID 5: http://localhost:8080/students/delete/5




	COURSES


View courses: http://localhost:8080/courses
Add course form: http://localhost:8080/courses/add
Edit course with ID 3: http://localhost:8080/courses/edit/3
Delete course with ID 3: http://localhost:8080/courses/delete/3






	ENROLLMENT



| Operation            | Full URL                                                                                       | HTTP Method |
| -------------------- | ---------------------------------------------------------------------------------------------- | ----------- |
| List Enrollments     | [http://localhost:8080/enrollments](http://localhost:8080/enrollments)                         | GET         |
| Add Enrollment Form  | [http://localhost:8080/enrollments/add](http://localhost:8080/enrollments/add)                 | GET         |
| Save Enrollment      | [http://localhost:8080/enrollments/add](http://localhost:8080/enrollments/add)                 | POST        |
| Edit Enrollment Form | [http://localhost:8080/enrollments/edit/{id}](http://localhost:8080/enrollments/edit/{id})     | GET         |
| Update Enrollment    | [http://localhost:8080/enrollments/edit/{id}](http://localhost:8080/enrollments/edit/{id})     | POST        |
| Delete Enrollment    | [http://localhost:8080/enrollments/delete/{id}](http://localhost:8080/enrollments/delete/{id}) | GET         |





	GET :-		http://localhost:8080/enrollments
	ADD :-		http://localhost:8080/enrollments/add
	EDIT(id):-	http://localhost:8080/enrollments/edit/{id}
	POST :-		http://localhost:8080/enrollments/add
	POST(id) :-	http://localhost:8080/enrollments/edit/{id}
	DELETE(id) :- http://localhost:8080/enrollments/delete/{id}




📝 License

This project is licensed under the MIT License – feel free to use and modify.

👨‍💻 Developed By Sharanya Nemade
📌 Student Management System Project 🚀
