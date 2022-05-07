package com.redistrictinganalyzer6.ORM;
import com.redistrictinganalyzer6.Entities.Precinct;
import com.redistrictinganalyzer6.Entities.District;
import com.redistrictinganalyzer6.Entities.PrecinctToDistrict;
import com.redistrictinganalyzer6.Repositories.PrecinctRepo;
import com.redistrictinganalyzer6.Repositories.PrecinctToDistrictRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PrecinctService {
    @Autowired private PrecinctRepo precinctRepo;
    @Autowired private PrecinctToDistrictRepo precToDistRepo;
    public void addPrecinctsToDistrict(District district){
        List<Precinct> precincts = (List<Precinct>) precinctRepo.findAll();
        List<PrecinctToDistrict> precinctsToDistrict = (List<PrecinctToDistrict>)precToDistRepo.findAll();
        List<Precinct> precinctsToReturn = new ArrayList<>();
        for(PrecinctToDistrict precToDist: precinctsToDistrict){
            for(Precinct precinct: precincts){
                if(precinct.getPrecinctId()==precToDist.getPrecinctId() && precToDist.getDistrictId()==district.getDistrictId()){
                    precinctsToReturn.add(precinct);
                }
            }
        }
        district.setPrecincts(precinctsToReturn);
    }
}
