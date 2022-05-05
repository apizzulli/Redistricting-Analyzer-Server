package com.redistrictinganalyzer6.Controllers;
import com.redistrictinganalyzer6.Entities.State;
import com.redistrictinganalyzer6.Entities.DistrictPlan;
import com.redistrictinganalyzer6.ORM.StateService;
import com.redistrictinganalyzer6.ORM.DistrictPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;

enum STATE_ID{
    TN,
    MS,
    NC
}

@RestController
public class StateController {
    @Autowired private StateService stateService;
    @Autowired private DistrictPlanService districtPlanService;
    //The first function called when a client clicks a state.
    @GetMapping("/getState")
    public State getState(@RequestParam("stateID")int stateID, HttpServletRequest request) {
        State state = stateService.getState(stateID);
        request.setAttribute("CURRENT_STATE", state);
        Iterable<DistrictPlan> plans = districtPlanService.getAllPlans();
        System.out.println("hi");
        return state;
    }

}
