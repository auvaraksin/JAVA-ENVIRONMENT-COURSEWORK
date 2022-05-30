package pro.sky.javaenvironmentcoursework.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import pro.sky.javaenvironmentcoursework.data.QuestionsRepository;
import pro.sky.javaenvironmentcoursework.services.implementations.ExaminerServiceImpl;
import static org.mockito.Mockito.when;
import static pro.sky.javaenvironmentcoursework.constants.TestConstants.*;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {

    @Mock
    private QuestionsRepository questionsRepositoryMock;

    @InjectMocks
    private ExaminerServiceImpl out;

    @Test
    public void shouldReturnAnyListWhenCallGetQuestionsMethod() {
        when(questionsRepositoryMock.getAll()).thenReturn(DEFAULT_QUESTION_LIST);
        when(questionsRepositoryMock.getRandomQuestion()).thenReturn(DEFAULT_QUESTION_OBJECT);
        Assertions.assertEquals(DEFAULT_QUESTION_RANDOMLIST, out.getQuestions(1));
    }
}
