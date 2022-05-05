package com.redistrictinganalyzer6.Repositories;
import com.redistrictinganalyzer6.Entities.PlanMap;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanMapRepo extends CrudRepository<PlanMap, Integer> {
}
