package pro.sky.javaenvironmentcoursework.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.javaenvironmentcoursework.data.Question;
import pro.sky.javaenvironmentcoursework.services.interfaces.ExaminerService;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java/get")
public class ExamController {
    private final ExaminerService examinerService;

    public ExamController(ExaminerService examinerService) {
        this.examinerService = examinerService;
    }

    @GetMapping("/{amount}")
    public Collection<Question> getQuestions(@PathVariable int amount) {
        return examinerService.getQuestions(amount);
    }
}
