package com.redistrictinganalyzer6.Repositories;
import org.springframework.data.repository.CrudRepository;
import com.redistrictinganalyzer6.Entities.DistrictPlan;
import org.springframework.stereotype.Repository;

@Repository
public interface DistrictPlanRepo extends CrudRepository<DistrictPlan, Integer> {
}
