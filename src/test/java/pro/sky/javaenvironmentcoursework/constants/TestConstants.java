package pro.sky.javaenvironmentcoursework.constants;

import pro.sky.javaenvironmentcoursework.data.Question;

import java.util.*;

public class TestConstants {
    public final static String DEFAULT_QUESTION_TEXT = "Question1";
    public final static String DEFAULT_ANSWER_TEXT = "Answer1";
    public final static Question DEFAULT_QUESTION_OBJECT = new Question("Question1", "Answer1");
    public final static Question DEFAULT_QUESTION_OBJECT2 = new Question("Question2", "Answer2");
    public final static Question DEFAULT_QUESTION_OBJECT3 = new Question("Question3", "Answer3");
    public final static Question DEFAULT_QUESTION_WRONG_OBJECT = new Question("QuestionWrongText", "AnswerWrongText");
    public final static Collection<Question> DEFAULT_QUESTION_LIST = List.of(
            DEFAULT_QUESTION_OBJECT,
            DEFAULT_QUESTION_OBJECT2,
            DEFAULT_QUESTION_OBJECT3);
    public final static Collection<Question> DEFAULT_QUESTION_RANDOMLIST = List.of(DEFAULT_QUESTION_OBJECT);
}
