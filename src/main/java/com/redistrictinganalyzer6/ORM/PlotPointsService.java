package com.redistrictinganalyzer6.ORM;

import com.redistrictinganalyzer6.Entities.DistrictPlan;
import com.redistrictinganalyzer6.Entities.PlotPoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.redistrictinganalyzer6.Entities.Coordinates;
import javax.persistence.Column;
import java.util.List;
import java.util.ArrayList;
@Component
public class PlotPointsService {
    @Autowired com.redistrictinganalyzer6.Repositories.PlotPointsRepo plotPointsRepo;
    public void addPointsToPlan(DistrictPlan plan){
        List<PlotPoints> allPoints = (List<PlotPoints>) plotPointsRepo.findAll();
        List<Coordinates> demCoords = new ArrayList<>();
        List<Coordinates> repCoords = new ArrayList<>();
        for(PlotPoints point: allPoints){
            if(point.getPlanId()==plan.getPlanId()){
                if(point.getParty().equals("dem")){
                    demCoords.add(new Coordinates(point.getX(), point.getY()));
                }
                else if(point.getParty().equals("rep")){
                    repCoords.add(new Coordinates(point.getX(), point.getY()));
                }
            }
        }
        plan.setDemCoords(demCoords);
        plan.setRepCoords(repCoords);
        System.out.println("hi");
    }
}
