package pro.sky.javaenvironmentcoursework.data;

import org.springframework.stereotype.Repository;
import pro.sky.javaenvironmentcoursework.exceptions.QuestionNotFoundException;

import java.util.*;

@Repository
public class JavaQuestionsRepository implements QuestionsRepository {
    private final Set<Question> questions = new HashSet<>();

    @Override
    public Question add(String question, String answer) {
        Question q = new Question(question, answer);
        questions.add(q);
        return q;
    }

    @Override
    public Question add(Question question) {
        questions.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (!questions.contains(question)) {
            throw new QuestionNotFoundException("Вопрос отсутствует в списке. Удаление невозможно");
        }
        questions.remove(question);
        return question;
    }

    @Override
    public Collection<Question> getAll() {
        return Collections.unmodifiableCollection(questions);
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        Question[] questionsArray = new Question[questions.size()];
        questions.toArray(questionsArray);
        return questionsArray[random.nextInt(questionsArray.length)];
    }

}
