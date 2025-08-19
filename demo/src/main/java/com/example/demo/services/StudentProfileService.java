package com.example.demo.services;

import com.example.demo.studentprofile.StudentProfile;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class StudentProfileService {

    private final HashMap<Long, StudentProfile> map = new HashMap<>();

    // CREATE
    public void createStudentProfile(StudentProfile studentProfile) {
        map.put(studentProfile.getStudentId(), studentProfile);
    }

    // UPDATE (by ID)
    public void updateStudentProfile(Long studentId, StudentProfile studentProfile) {
        map.put(studentId, studentProfile);
    }

    // DELETE (by ID)
    public void delete(Long studentId) {
        map.remove(studentId);
    }

    // READ (by ID)
    public StudentProfile getStudentProfileById(Long studentId) {
        return map.get(studentId);
    }
}
