package com.studentmgm.controller;

import com.studentmgm.entity.Course;
import com.studentmgm.service.CourseService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/courses")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping
    public String listCourses(Model model) {
        model.addAttribute("courses", courseService.getAllCourses());
        return "courses/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("course", new Course());
        return "courses/add";
    }

    @PostMapping("/add")
    public String addCourse(@Valid @ModelAttribute("course") Course course,
                            BindingResult result) {
        if (result.hasErrors()) {
            return "courses/add";
        }
        courseService.saveCourse(course);
        return "redirect:/courses";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Course course = courseService.getCourseById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid course Id:" + id));
        model.addAttribute("course", course);
        return "courses/edit";
    }

    @PostMapping("/edit/{id}")
    public String editCourse(@PathVariable Long id,
                             @Valid @ModelAttribute("course") Course course,
                             BindingResult result) {
        if (result.hasErrors()) {
            return "courses/edit";
        }
        course.setId(id);
        courseService.saveCourse(course);
        return "redirect:/courses";
    }

    @GetMapping("/delete/{id}")
    public String deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
        return "redirect:/courses";
    }
}
