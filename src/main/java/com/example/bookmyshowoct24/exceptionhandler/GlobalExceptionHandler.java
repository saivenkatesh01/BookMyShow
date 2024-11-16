package com.example.bookmyshowoct24.exceptionhandler;

import com.example.bookmyshowoct24.exceptions.ShowSeatNotFoundException;
import com.example.bookmyshowoct24.exceptions.UserNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(UserNotFoundException.class)
    public void handleUserNotFoundException() {

    }

    @ExceptionHandler(ShowSeatNotFoundException.class)
    public void handleShowSeatNotFoundException() {

    }


}
