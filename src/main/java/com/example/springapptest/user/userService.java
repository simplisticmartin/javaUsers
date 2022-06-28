package com.example.springapptest.user;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service

public class userService {
    public List<user> getStudents(){
        return List.of(new user(1L,
                "Mariam",
                "Mariam@gmail.com",
                LocalDate.of(2000,
                        Month.JANUARY,
                        5),
                21));
    }
}
