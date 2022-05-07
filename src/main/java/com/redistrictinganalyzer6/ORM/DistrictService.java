package com.redistrictinganalyzer6.ORM;
import com.redistrictinganalyzer6.Entities.District;
import com.redistrictinganalyzer6.Entities.DistrictPlan;
import com.redistrictinganalyzer6.Entities.DistrictToPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class DistrictService {
    @Autowired com.redistrictinganalyzer6.Repositories.DistrictRepo districtRepo;
    @Autowired com.redistrictinganalyzer6.Repositories.DistrictToPlanRepo districtToPlanRepo;
    @Autowired com.redistrictinganalyzer6.ORM.PrecinctService precinctService;
    public void addDistrictsToPlan(DistrictPlan plan){
        List<District> districts = (List<District>) districtRepo.findAll();
        List<DistrictToPlan> districtToPlan = (List<DistrictToPlan>) districtToPlanRepo.findAll();
        List<District> districtsToReturn = new ArrayList<>();
        for(DistrictToPlan planStatePair: districtToPlan){
            for(District district: districts){
                if(district.getDistrictId()==planStatePair.getDistrictId()
                        && planStatePair.getPlanId()==plan.getPlanId()){
                    districtsToReturn.add(district);
                    precinctService.addPrecinctsToDistrict(district);
                }
            }
        }
        plan.setDistricts(districtsToReturn);
    }
}
