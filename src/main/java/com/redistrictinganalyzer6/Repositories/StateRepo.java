package com.redistrictinganalyzer6.Repositories;
import org.springframework.data.repository.CrudRepository;
import com.redistrictinganalyzer6.Entities.State;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepo extends CrudRepository<State, Integer>{ }