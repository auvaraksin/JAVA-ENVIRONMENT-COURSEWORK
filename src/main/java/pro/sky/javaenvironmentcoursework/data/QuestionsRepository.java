package pro.sky.javaenvironmentcoursework.data;

import java.util.Collection;

public interface QuestionsRepository {
    Question add(String question, String answer);
    Question add(Question question);
    Question remove(Question question);
    Collection<Question> getAll();
    Question getRandomQuestion();
}
