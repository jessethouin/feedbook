package com.thouin.feedbook.controller;

import com.thouin.feedbook.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Created by jessethouin on 11/14/17.
 */
@RestControllerAdvice
public class ItemControllerAdvice {
    @ExceptionHandler(value = Exception.class)
    public ResponseEntity<ErrorMessage> handleException(RuntimeException e) {
        ErrorMessage responseBody = new ErrorMessage("Oopsies. " + e.getMessage());
        return new ResponseEntity<>(responseBody, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
