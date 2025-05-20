package com.example.Course.Controller;

import com.example.Course.model.Student;
import com.example.Course.service.CourseService;
import com.example.Course.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private StudentService studentService;

    @GetMapping("/register")
    public String showForm(Model model) {
        
        List<?> courses = courseService.getAll();

        List<String> durations = Arrays.asList("3 months", "6 months");

        model.addAttribute("courses", courses);
        model.addAttribute("durations", durations);
        model.addAttribute("student", new Student());
        return "register"; 
    }

   @PostMapping("/register")
public String registerStudent(@ModelAttribute Student student,
                              @RequestParam Long course,
                              @RequestParam String duration) {
    student.setCourse(courseService.getById(course));
    student.setDuration(duration);
    studentService.save(student);
    return "redirect:/register";
}

    }

