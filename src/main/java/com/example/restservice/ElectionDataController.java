package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ElectionDataController {
    @GetMapping("/electiondata")
    public String data(@RequestParam(defaultValue = "1") String id){
        //If the id passed is 1, the current state is Tennessee.
        //Population can be a random number between 500,000 and 1,000,000
//        int population=0,democratVotes=0,republicanVotes=0;
//        if(id.equals("1")) {
//            population = (int) ((Math.random() * (2000000 - 700000)) + 700000);
//            democratVotes = (int) ((Math.random() * (population - 2000)) + 2000);
//            republicanVotes = (int) ((Math.random() * (population - 2000)) + 2000);
//        }
//        //If the id passed is 2, the current state is Mississippi.
//        if(id.equals("2")){
//            population = (int) ((Math.random() * (1000000 - 500000)) + 500000);
//            democratVotes = (int) ((Math.random() * (population - 3000)) + 3000);
//            republicanVotes = (int) ((Math.random() * (population - 3000)) + 3000);
//        }
        return id;
    }
}
