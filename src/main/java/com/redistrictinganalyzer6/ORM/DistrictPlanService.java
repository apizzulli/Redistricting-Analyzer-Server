package com.redistrictinganalyzer6.ORM;
import com.redistrictinganalyzer6.ORM.DistrictService;
import com.redistrictinganalyzer6.Entities.DistrictPlan;
import com.redistrictinganalyzer6.Entities.PlanToState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class DistrictPlanService {
    @Autowired private com.redistrictinganalyzer6.Repositories.DistrictPlanRepo districtPlanRepo;
    @Autowired private com.redistrictinganalyzer6.Repositories.PlanToStateRepo planToStateRepo;
    @Autowired private com.redistrictinganalyzer6.ORM.DistrictService districtService;

    public List<DistrictPlan> getAllPlansForState(int stateId){
        List<DistrictPlan> plans = (List<DistrictPlan>) districtPlanRepo.findAll();
        List<PlanToState> planMapping = (List<PlanToState>) planToStateRepo.findAll();
        List<DistrictPlan> plansToReturn = new ArrayList<>();
        for(PlanToState planStatePair: planMapping) {
            for (DistrictPlan plan : plans) {
                if (plan.getPlanId() == planStatePair.getPlanId() && planStatePair.getStateId() == stateId) {
                    districtService.addDistrictsToPlan(plan);
                    plansToReturn.add(plan);
                }
            }
        }

        return plansToReturn;
    }

}
