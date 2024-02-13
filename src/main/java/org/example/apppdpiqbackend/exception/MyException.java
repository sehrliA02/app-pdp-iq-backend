package org.example.apppdpiqbackend.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class MyException extends RuntimeException {
    private HttpStatus status;
    public MyException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
