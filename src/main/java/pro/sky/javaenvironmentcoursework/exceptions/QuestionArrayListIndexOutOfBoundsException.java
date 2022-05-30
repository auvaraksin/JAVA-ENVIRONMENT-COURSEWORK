package pro.sky.javaenvironmentcoursework.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class QuestionArrayListIndexOutOfBoundsException extends RuntimeException{
    public QuestionArrayListIndexOutOfBoundsException() {
        super();
    }

    public QuestionArrayListIndexOutOfBoundsException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionArrayListIndexOutOfBoundsException(String message) {
        super(message);
    }

    public QuestionArrayListIndexOutOfBoundsException(Throwable cause) {
        super(cause);
    }

}
