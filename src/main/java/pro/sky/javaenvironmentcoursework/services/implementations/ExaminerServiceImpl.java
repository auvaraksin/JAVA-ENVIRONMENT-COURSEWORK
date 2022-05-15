package pro.sky.javaenvironmentcoursework.services.implementations;

import org.springframework.stereotype.Service;
import pro.sky.javaenvironmentcoursework.data.Question;
import pro.sky.javaenvironmentcoursework.exceptions.QuestionArrayListIndexOutOfBoundsException;
import pro.sky.javaenvironmentcoursework.services.interfaces.ExaminerService;
import pro.sky.javaenvironmentcoursework.data.QuestionsRepository;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionsRepository questionRepository;

    public ExaminerServiceImpl(QuestionsRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > questionRepository.getAll().size() || amount <= 0) {
        throw new QuestionArrayListIndexOutOfBoundsException();
        }
        Collection<Question> randomQuestionList = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            boolean isTrue = true;
            while (isTrue) {
                Question q = questionRepository.getRandomQuestion();
                if (!randomQuestionList.contains(q)) {
                    randomQuestionList.add(q);
                    isTrue = false;
                }
            }
        }
        return randomQuestionList;
    }
}
