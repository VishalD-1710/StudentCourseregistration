package com.example.Course.Controller;

import com.example.Course.model.Course;
import com.example.Course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/admin/add")
    public String showAddCourseForm(Model model) {
        model.addAttribute("course", new Course());
        model.addAttribute("courses", courseService.getAll());
        return "add";
    }

    @PostMapping("/admin/add")
    public String addCourse(@ModelAttribute Course course) {
        courseService.save(course);
        return "redirect:/admin/add";
    }
}
