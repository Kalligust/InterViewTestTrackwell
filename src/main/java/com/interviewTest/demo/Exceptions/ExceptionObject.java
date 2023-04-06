package com.interviewTest.demo.Exceptions;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

public class ExceptionObject {
  private final String message;
  private final HttpStatus httpStatus;
  private final ZonedDateTime timestamp;

  public ExceptionObject(String message, HttpStatus httpStatus, ZonedDateTime timestamp) {
    this.message = message;
    this.httpStatus = httpStatus;
    this.timestamp = timestamp;
  }

  public String getMessage() {
    return message;
  }

  public HttpStatus getHttpStatus() {
    return httpStatus;
  }

  public ZonedDateTime getTimestamp() {
    return timestamp;
  }

}
