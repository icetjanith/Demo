package edu.icet.crn.service;

import edu.icet.crn.dto.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    void addStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(Integer id);
    void updateStudent(Integer id,Student student);
    void deleteStudentById(Integer id);
}
