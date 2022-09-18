package com.springboot.blog.springbootblogrestapi.payload;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CommentDto {

    private long id;

    @NotEmpty
    private String name;

    /*
    - Email should not be null or empty
    - Email should be in the correct syntax
     */
    @NotEmpty(message = "Email should not be empty or null")
    @Email
    private String email;

    @NotEmpty
    @Size(min = 10, message = "Comment body should not be empty or null")
    private String body;
}
