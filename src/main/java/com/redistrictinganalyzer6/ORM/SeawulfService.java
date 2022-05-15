package com.redistrictinganalyzer6.ORM;

import com.redistrictinganalyzer6.Entities.Seawulf;
import com.redistrictinganalyzer6.Entities.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class SeawulfService {
    @Autowired com.redistrictinganalyzer6.Repositories.SeawulfRepo seawulfRepo;
    public void addSeawulfDataToState(State state){
        List<Seawulf> seawulfInstances = (List<Seawulf>) seawulfRepo.findAll();
        List<Seawulf> instancesToSet = new ArrayList<>();
        for(Seawulf seawulfInstance: seawulfInstances){
            if((seawulfInstance.getState().equals("TN") && state.getId()==1) || (seawulfInstance.getState().equals("MS") && state.getId() == 2)
                || (seawulfInstance.getState().equals("NC") && state.getId() == 3)){
                instancesToSet.add(seawulfInstance);
            }
        }
        state.setSeawulfInstances(instancesToSet);
    }
}
