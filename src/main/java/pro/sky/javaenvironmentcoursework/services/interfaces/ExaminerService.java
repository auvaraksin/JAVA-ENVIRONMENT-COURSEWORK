package pro.sky.javaenvironmentcoursework.services.interfaces;

import pro.sky.javaenvironmentcoursework.data.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);
}
