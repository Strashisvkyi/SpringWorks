package ua.lviv.iot.spring.project7.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.lviv.iot.spring.project7.dataaccess.StudentRepository;
import ua.lviv.iot.spring.project7.rest.model.Student;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
}
