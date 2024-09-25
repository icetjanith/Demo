package edu.icet.crn.service.impl;

import edu.icet.crn.dto.Student;
import edu.icet.crn.repository.StudentRepository;
import edu.icet.crn.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {
         return studentRepository.findById(id).orElseThrow();
    }

    @Override
    public void updateStudent(Integer id, Student student) {
        Student student1 = studentRepository.findById(id).orElseThrow();
        student1.setStdName(student.getStdName());
        student1.setStdImg(student.getStdImg());
        student1.setStdAge(student.getStdAge());
        student1.setStdEmail(student.getStdEmail());
        student1.setStdPhone(student.getStdPhone());
        student1.setGuardianName(student.getGuardianName());
        student1.setGuardianPhone(student.getGuardianPhone());
        student1.setGuardianAddress(student.getGuardianAddress());
        Student save = studentRepository.save(student1);
    }

    @Override
    public void deleteStudentById(Integer id) {
        studentRepository.deleteById(id);
    }
}
