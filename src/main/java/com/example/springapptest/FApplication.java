package com.example.springapptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import com.example.springapptest.student.student

/*
TASK
Use spring boot MVC application to create an UI to enter the user's information like first name, last name, DOB etc.
Store the info in a DB.
Search the entered in the search page.
Search should display the info.
 */
@SpringBootApplication
//@RestController
public class FApplication {

    public static void main(String[] args) {
        SpringApplication.run(FApplication.class, args);
    }
//    @GetMapping
//    public List<student> hello(){
//        return List.of(new student(1L, "Mariam", "Mariam@gmail.com", LocalDate.of(2000, Month.JANUARY, 5), 21));
//    }
   // public String Hello(){
      //  return "Hello World!";
    //}

}
