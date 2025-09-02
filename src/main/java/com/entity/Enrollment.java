package com.studentmgm.entity;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "enrollments")
public class Enrollment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", nullable = false)
    private Course course;

    private LocalDate dateEnrolled = LocalDate.now();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public LocalDate getDateEnrolled() {
		return dateEnrolled;
	}

	public void setDateEnrolled(LocalDate dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}

	
	
	
	
	public Enrollment() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	
	public Enrollment(Long id, Student student, Course course, LocalDate dateEnrolled) {
		super();
		this.id = id;
		this.student = student;
		this.course = course;
		this.dateEnrolled = dateEnrolled;
	}

    
    
    
    
}
