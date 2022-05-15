package com.redistrictinganalyzer6.ORM;
import com.redistrictinganalyzer6.Entities.Coordinates;
import com.redistrictinganalyzer6.Entities.DistrictPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
//
//@Component
//public class CoordinatesService {
//    @Autowired private com.redistrictinganalyzer6.Repositories.CoordinatesRepo coordinatesRepo;
//
//    public void addPointsToPlan(DistrictPlan plan){
//        int test=0;
//        List<Coordinates> coords = (List<Coordinates>) coordinatesRepo.findAll();
//        List<Coordinates> toReturn = new ArrayList<>();
//        for(Coordinates pair: coords){
//            if(test==20){
//                System.out.println(":0");
//            }
//            if(pair.getPlanId()== plan.getPlanId()) {
//                toReturn.add(pair);
//            }
//        }
//        plan.setCoords(toReturn);
//    }
//}
