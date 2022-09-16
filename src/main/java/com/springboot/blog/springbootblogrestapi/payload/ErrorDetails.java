package com.springboot.blog.springbootblogrestapi.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

// Custom exception message response

@AllArgsConstructor
@Getter
public class ErrorDetails {

    private Date timestamp;
    private String message;
    private String details;
}
