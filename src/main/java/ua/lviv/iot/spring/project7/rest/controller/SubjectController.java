package ua.lviv.iot.spring.project7.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.spring.project7.business.SubjectService;
import ua.lviv.iot.spring.project7.rest.model.Subject;

@RequestMapping("/subjects")
@RestController
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    public List<Subject> getAllSubjects() {
        return subjectService.findAll();
    }
}
