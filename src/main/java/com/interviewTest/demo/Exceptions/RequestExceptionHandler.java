package com.interviewTest.demo.Exceptions;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RequestExceptionHandler {

  @ExceptionHandler(value = { RequestException.class })
  public ResponseEntity<Object> handleRequestException(RequestException e) {
    ExceptionObject exceptionObject = new ExceptionObject(e.getMessage(), HttpStatus.BAD_REQUEST,
        ZonedDateTime.now(ZoneId.of("GMT")));
    return new ResponseEntity<>(exceptionObject, HttpStatus.BAD_REQUEST);
  }
}
