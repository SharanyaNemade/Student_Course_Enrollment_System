package com.studentmgm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentmgmApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentmgmApplication.class, args);
	}

}





//	STUDENT


//View students: http://localhost:8080/students
//Add student form: http://localhost:8080/students/add
//Edit student with ID 5: http://localhost:8080/students/edit/5
//Delete student with ID 5: http://localhost:8080/students/delete/5




//	COURSES


//View courses: http://localhost:8080/courses
//Add course form: http://localhost:8080/courses/add
//Edit course with ID 3: http://localhost:8080/courses/edit/3
//Delete course with ID 3: http://localhost:8080/courses/delete/3






//	ENROLLMENT



//| Operation            | Full URL                                                                                       | HTTP Method |
//| -------------------- | ---------------------------------------------------------------------------------------------- | ----------- |
//| List Enrollments     | [http://localhost:8080/enrollments](http://localhost:8080/enrollments)                         | GET         |
//| Add Enrollment Form  | [http://localhost:8080/enrollments/add](http://localhost:8080/enrollments/add)                 | GET         |
//| Save Enrollment      | [http://localhost:8080/enrollments/add](http://localhost:8080/enrollments/add)                 | POST        |
//| Edit Enrollment Form | [http://localhost:8080/enrollments/edit/{id}](http://localhost:8080/enrollments/edit/{id})     | GET         |
//| Update Enrollment    | [http://localhost:8080/enrollments/edit/{id}](http://localhost:8080/enrollments/edit/{id})     | POST        |
//| Delete Enrollment    | [http://localhost:8080/enrollments/delete/{id}](http://localhost:8080/enrollments/delete/{id}) | GET         |





//	GET :-		http://localhost:8080/enrollments
//	ADD :-		http://localhost:8080/enrollments/add
//	EDIT(id):-	http://localhost:8080/enrollments/edit/{id}
//	POST :-		http://localhost:8080/enrollments/add
//	POST(id) :-	http://localhost:8080/enrollments/edit/{id}
//	DELETE(id) :- http://localhost:8080/enrollments/delete/{id}
