package com.redistrictinganalyzer6.ORM;
import com.redistrictinganalyzer6.Entities.DistrictPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class DistrictPlanService {
    @Autowired private com.redistrictinganalyzer6.Repositories.DistrictPlanRepo districtPlanRepo;
    public List<DistrictPlan> getAllPlans(){
        List<DistrictPlan> plans = (List<DistrictPlan>) districtPlanRepo.findAll();
        return plans;
    }

}
