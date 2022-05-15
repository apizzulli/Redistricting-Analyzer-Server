package com.redistrictinganalyzer6.Controllers;
import com.redistrictinganalyzer6.Entities.*;
import com.redistrictinganalyzer6.ORM.*;
import com.redistrictinganalyzer6.Repositories.DistrictPlanRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.persistence.PostLoad;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    @Autowired private PrecinctService precinctService;   // @Autowired private CountyService countyService;
    private HttpServletRequest httpServletRequest;
    public State[] states;

    @PostConstruct
    public void assembleStates(){
        State[] states = stateService.assembleStates();
        this.states = states;
    }
    //The first function called when a client clicks a state.
    //need: total pop, num district plans,
    @GetMapping("/getState")
    public State getState(@RequestParam("stateID")int stateID, HttpServletRequest request) {
        State currentState = this.states[stateID-1];
        request.setAttribute("CURRENT_STATE", currentState);
        return currentState;
    }
    @GetMapping("/getDemographics")
    public List<DistrictDemographics> getDemographicsForPlan(@RequestParam("stateID")int stateID, @RequestParam("planType")String planType){
        State currentState = this.states[stateID-1];
        List<DistrictDemographics> demographics = new ArrayList<>();
         for(DistrictPlan plan: currentState.getDistrictPlans()){
             String s = plan.getStatus();
            if(plan.getStatus().equals(planType)){
                for(District district: plan.getDistricts()){
                    int totalWhitePop=0;
                    int totalBlackPop=0;
                    int totalNativePop=0;
                    int totalAsianPop=0;
                    for(Precinct precinct: district.getPrecincts()){
                        totalWhitePop += precinct.getwhitePop();
                        totalBlackPop += precinct.getblackPop();
                        totalNativePop += precinct.getnativePop();
                        totalAsianPop += precinct.getasianPop();
                    }
                    demographics.add(new DistrictDemographics(district.getDistrictId(),totalWhitePop, totalBlackPop, totalNativePop, totalAsianPop));
                }
            }
        }
        return demographics;
    }
}
