package com.redistrictinganalyzer6.ORM;
import com.redistrictinganalyzer6.Entities.DistrictPlan;
import com.redistrictinganalyzer6.Entities.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;
import java.util.List;

@Component
public class StateService {
    @Autowired private com.redistrictinganalyzer6.Repositories.StateRepo stateRepo;
    @Autowired private com.redistrictinganalyzer6.ORM.DistrictPlanService districtPlanService;
    @Autowired private com.redistrictinganalyzer6.ORM.SeawulfService seawulfService;
    public State[] assembleStates(){
        Optional<State>s1 = stateRepo.findById(1);
        Optional<State>s2 = stateRepo.findById(2);
        Optional<State>s3 = stateRepo.findById(3);
        State TN = s1.orElse(null);
        State MS = s2.orElse(null);
        State NC = s3.orElse(null);
        List<DistrictPlan> TNplans = districtPlanService.getAllPlansForState(1);
        List<DistrictPlan> MSplans = districtPlanService.getAllPlansForState(2);
        List<DistrictPlan> NCplans = districtPlanService.getAllPlansForState(3);
        TN.setDistrictPlans(TNplans);
        MS.setDistrictPlans(MSplans);
        NC.setDistrictPlans(NCplans);
        seawulfService.addSeawulfDataToState(TN);
        seawulfService.addSeawulfDataToState(MS);
        seawulfService.addSeawulfDataToState(NC);
        State[] states= new State[3];
        states[0] = TN;
        states[1] = MS;
        states[2] = NC;
        return states;
    }
    public State getState(int stateID){
        Optional<State> state = stateRepo.findById(stateID);
        State newState = state.orElse(null);
        return newState;
    }
}

