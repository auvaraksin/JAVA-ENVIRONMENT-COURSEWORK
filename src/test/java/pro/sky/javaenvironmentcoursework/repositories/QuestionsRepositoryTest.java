package pro.sky.javaenvironmentcoursework.repositories;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.javaenvironmentcoursework.data.JavaQuestionsRepository;
import pro.sky.javaenvironmentcoursework.data.QuestionsRepository;
import pro.sky.javaenvironmentcoursework.exceptions.QuestionNotFoundException;

import static pro.sky.javaenvironmentcoursework.constants.TestConstants.*;

public class QuestionsRepositoryTest {
    private final QuestionsRepository mut = new JavaQuestionsRepository();

    @Test
    public void shouldReturnEqualQuestionObject() {
        Assertions.assertEquals(DEFAULT_QUESTION_OBJECT, mut.add(DEFAULT_QUESTION_TEXT, DEFAULT_ANSWER_TEXT));
        Assertions.assertEquals(DEFAULT_QUESTION_OBJECT, mut.add(DEFAULT_QUESTION_OBJECT));
        Assertions.assertEquals(DEFAULT_QUESTION_OBJECT,
                mut.remove(DEFAULT_QUESTION_OBJECT));
    }

    @Test
    public void shouldReturnEqualList() {
        mut.add(DEFAULT_QUESTION_OBJECT);
        mut.add(DEFAULT_QUESTION_OBJECT2);
        mut.add(DEFAULT_QUESTION_OBJECT3);
        Assertions.assertIterableEquals(DEFAULT_QUESTION_LIST, mut.getAll());
    }

    @Test
    public void shouldReturnAnyObject() {
        mut.add(DEFAULT_QUESTION_OBJECT);
        Assertions.assertNotNull(mut.getRandomQuestion());
    }

    @Test
    public void shouldReturnQuestionNotFoundException() {
        mut.add(DEFAULT_QUESTION_OBJECT);
        Assertions.assertThrows(QuestionNotFoundException.class, () -> mut.remove(DEFAULT_QUESTION_WRONG_OBJECT));
    }




}
