package com.example.springapptest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/student")
public class userController {
   private final userService userService;

   @Autowired
    public userController(userService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<user> getStudents(){
        return userService.getStudents();
    }

}
