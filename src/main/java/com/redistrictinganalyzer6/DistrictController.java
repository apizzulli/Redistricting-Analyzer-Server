package com.redistrictinganalyzer6;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class DistrictController {
    @GetMapping("/getDistrict")
    public District data(@RequestParam int id){
        //public class District {
        //
        //    int id;
        //    int population;
        //    int demSeats;
        //    int repSeats;
        //    int[] racialData;
        //    private Precinct[] precincts;
        //
        //}
        //public class Precinct {
        //
        //    int countyID;
        //    private int population;
        //    private int[] racialData;
        //    private int[] electionData;
        //
        //}
        int[] myarr = new int[]{1,2,3};
        Precinct p1 = new Precinct(2345, 24134,myarr,myarr);
        Precinct p2 = new Precinct(2345, 24134,myarr,myarr);
        Precinct[]ps = new Precinct[]{p1,p2};
        return new District(id,1000000,5,4,myarr,ps);
    }

}
