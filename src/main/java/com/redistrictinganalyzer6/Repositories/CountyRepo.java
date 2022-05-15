package com.redistrictinganalyzer6.Repositories;
import com.redistrictinganalyzer6.Entities.County;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.data.repository.CrudRepository;

@Reference
public interface CountyRepo extends CrudRepository<County,Integer> {

}
