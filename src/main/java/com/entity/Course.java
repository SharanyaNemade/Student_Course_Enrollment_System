package com.studentmgm.entity;



import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.util.List;

@Entity
@Table(name = "courses")
public class Course {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank @Size(min = 2, max = 100)
    @Column(unique = true, nullable = false)
    private String name;

    @NotBlank @Size(min = 10, max = 255)
    private String description;

    @Positive
    private int durationInMonths;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Enrollment> enrollments;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(int durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

	public List<Enrollment> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(List<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}

	
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Course(Long id, @NotBlank @Size(min = 2, max = 100) String name,
			@NotBlank @Size(min = 10, max = 255) String description, @Positive int durationInMonths,
			List<Enrollment> enrollments) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.durationInMonths = durationInMonths;
		this.enrollments = enrollments;
	}

    
    
    
    
    
    
}
