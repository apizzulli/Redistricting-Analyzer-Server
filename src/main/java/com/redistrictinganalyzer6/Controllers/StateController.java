package com.redistrictinganalyzer6.Controllers;
import com.redistrictinganalyzer6.Entities.*;
import com.redistrictinganalyzer6.ORM.*;
import com.redistrictinganalyzer6.Repositories.DistrictPlanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

enum STATE_ID{
    TN,
    MS,
    NC
}

@RestController
public class StateController {
    @Autowired private DistrictPlanRepo districtPlanRepo;
    @Autowired private StateService stateService;
    @Autowired private DistrictPlanService districtPlanService;
    @Autowired private PrecinctService precinctService;
    //The first function called when a client clicks a state.
    @GetMapping("/getState")
    public State getState(@RequestParam("stateID")int stateID, HttpServletRequest request) {
        State state = stateService.getState(stateID);
        request.setAttribute("CURRENT_STATE", state);
        List<DistrictPlan> plans = districtPlanService.getAllPlansForState(stateID);
        state.setDistrictPlans(plans);
//        for(PrecToDistrict precDistMap: precToDistMap){
//            for(Precinct precinct: precincts){
//                if(precinct.getPrecinctId()==precDistMap.getPrecinctId() && precDistMap.get)
//            }
//        }


        //state.setDistrictPlans(plansToReturn);
        System.out.println("hi");

        return state;
    }

}
