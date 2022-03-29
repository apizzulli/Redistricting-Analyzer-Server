package com.redistrictinganalyzer6;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ElectionDataController {
    @GetMapping("/electiondata")
    public ElectionData data(@RequestParam String state, @RequestParam int district){
//        If the id passed is 1, the current state is Tennessee.
//        Data is hard coded at this point, but this will soon be data populated from our database.
        int democratVotes=0;
        int repubVotes=0;
        switch(state) {
            case "TN":
                switch (district) {
                    case 1:
                        democratVotes = 2002;
                        repubVotes = 5504;
                        break;
                    case 2:
                        democratVotes = 1221;
                        repubVotes = 5504;
                        break;
                    case 3:
                        democratVotes = 987;
                        repubVotes = 1323;
                        break;
                    case 4:
                        democratVotes = 3400;
                        repubVotes = 2789;
                        break;
                    case 5:
                        democratVotes = 679;
                        repubVotes = 1760;
                        break;
                    case 6:
                        democratVotes = 1190;
                        repubVotes = 1201;
                        break;
                    case 7:
                        democratVotes = 2054;
                        repubVotes = 3509;
                        break;
                    case 8:
                        democratVotes = 2340;
                        repubVotes = 5504;
                        break;
                    case 9:
                        democratVotes = 890;
                        repubVotes = 1203;
                        break;
                    default:
                        democratVotes=0;
                        repubVotes=0;
                        break;
                }
                break;
            case "MI":
                switch (district) {
                    case 1:
                        democratVotes = 567;
                        repubVotes = 1900;
                        break;
                    case 2:
                        democratVotes = 210;
                        repubVotes = 560;
                        break;
                    case 3:
                        democratVotes = 780;
                        repubVotes = 154;
                        break;
                    case 4:
                        democratVotes = 235;
                        repubVotes = 2789;
                        break;
                    default:
                        democratVotes=0;
                        repubVotes=0;
                        break;
                }
                break;
        }
        return new ElectionData(democratVotes, repubVotes);
    }
}
