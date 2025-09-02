package com.studentmgm.controller;

import com.studentmgm.entity.Enrollment;
import com.studentmgm.entity.Student;
import com.studentmgm.entity.Course;
import com.studentmgm.repository.EnrollmentRepository;
import com.studentmgm.repository.StudentRepository;
import com.studentmgm.repository.CourseRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;

@Controller
@RequestMapping("/enrollments")
public class EnrollmentController {

    private final EnrollmentRepository enrollmentRepository;
    private final StudentRepository studentRepository;
    private final CourseRepository courseRepository;

    public EnrollmentController(EnrollmentRepository enrollmentRepository,
                                StudentRepository studentRepository,
                                CourseRepository courseRepository) {
        this.enrollmentRepository = enrollmentRepository;
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    // List all enrollments
    @GetMapping
    public String listEnrollments(Model model) {
        model.addAttribute("enrollments", enrollmentRepository.findAll());
        return "enrollments/list";
    }

    // Show form to assign student to course
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("enrollment", new Enrollment());
        model.addAttribute("students", studentRepository.findAll());
        model.addAttribute("courses", courseRepository.findAll());
        return "enrollments/add";
    }

    // Handle enrollment (assign student → course)
    @PostMapping("/add")
    public String addEnrollment(@Valid @ModelAttribute("enrollment") Enrollment enrollment,
                                BindingResult result,
                                Model model) {
        if (result.hasErrors()) {
            model.addAttribute("students", studentRepository.findAll());
            model.addAttribute("courses", courseRepository.findAll());
            return "enrollments/add";
        }

        // Fetch full entities before saving
        Student student = studentRepository.findById(enrollment.getStudent().getId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id"));
        Course course = courseRepository.findById(enrollment.getCourse().getId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid course Id"));

        enrollment.setStudent(student);
        enrollment.setCourse(course);

        enrollmentRepository.save(enrollment);
        return "redirect:/enrollments";
    }

    // Show form to edit enrollment
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Enrollment enrollment = enrollmentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid enrollment Id:" + id));
        model.addAttribute("enrollment", enrollment);
        model.addAttribute("students", studentRepository.findAll());
        model.addAttribute("courses", courseRepository.findAll());
        return "enrollments/edit";
    }

    // Handle edit
    @PostMapping("/edit/{id}")
    public String editEnrollment(@PathVariable Long id,
                                 @Valid @ModelAttribute("enrollment") Enrollment enrollment,
                                 BindingResult result,
                                 Model model) {
        if (result.hasErrors()) {
            model.addAttribute("students", studentRepository.findAll());
            model.addAttribute("courses", courseRepository.findAll());
            return "enrollments/edit";
        }

        // Fetch full entities before saving
        Student student = studentRepository.findById(enrollment.getStudent().getId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid student Id"));
        Course course = courseRepository.findById(enrollment.getCourse().getId())
                .orElseThrow(() -> new IllegalArgumentException("Invalid course Id"));

        enrollment.setId(id);
        enrollment.setStudent(student);
        enrollment.setCourse(course);

        enrollmentRepository.save(enrollment);
        return "redirect:/enrollments";
    }

    // Delete enrollment
    @GetMapping("/delete/{id}")
    public String deleteEnrollment(@PathVariable Long id) {
        Enrollment enrollment = enrollmentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid enrollment Id:" + id));
        enrollmentRepository.delete(enrollment);
        return "redirect:/enrollments";
    }
}
