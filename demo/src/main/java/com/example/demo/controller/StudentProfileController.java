package com.example.demo.controller;

import com.example.demo.services.StudentProfileService;
import com.example.demo.studentprofile.StudentProfile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studentprofile")
public class StudentProfileController {

    private final StudentProfileService studentProfileService;

    @Autowired
    public StudentProfileController(StudentProfileService studentProfileService) {
        this.studentProfileService = studentProfileService;
    }

    // CREATE
    @PostMapping("/create")
    public String create(@RequestBody StudentProfile studentProfile) {
        studentProfileService.createStudentProfile(studentProfile);
        return "Student profile is successfully stored";
    }

    // READ
    @GetMapping("/{studentId}")
    public StudentProfile get(@PathVariable Long studentId) {
        return studentProfileService.getStudentProfileById(studentId);
    }

    // DELETE
    @DeleteMapping("/delete/{studentId}")
    public String delete(@PathVariable Long studentId) {
        studentProfileService.delete(studentId);
        return "Student profile is successfully deleted";
    }

    // UPDATE
    @PutMapping("/update/{studentId}")
    public String update(@PathVariable Long studentId, @RequestBody StudentProfile studentProfile) {
        studentProfileService.updateStudentProfile(studentId, studentProfile);
        return "Student profile is successfully updated";
    }
}
