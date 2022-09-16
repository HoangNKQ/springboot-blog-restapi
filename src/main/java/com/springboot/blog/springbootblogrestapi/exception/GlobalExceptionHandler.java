package com.springboot.blog.springbootblogrestapi.exception;

import com.springboot.blog.springbootblogrestapi.payload.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

//Annotation for global exception handler
@ControllerAdvice
public class GlobalExceptionHandler {

    //Custom Exception
    @ExceptionHandler
    public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundException exception, WebRequest webRequest){
        //create new errorDetails Obj for request payload
        ErrorDetails errorDetails =
                new ErrorDetails(new Date(), exception.getMessage(), webRequest.getDescription(false));

        //return new custom message payload
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ErrorDetails> handleBlogAPIException(BlogAPIException exception, WebRequest webRequest) {

        ErrorDetails errorDetails =
                new ErrorDetails(new Date(), exception.getMessage(), webRequest.getDescription(false));

        return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
    }




}
