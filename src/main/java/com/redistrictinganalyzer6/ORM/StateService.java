package com.redistrictinganalyzer6.ORM;
import com.redistrictinganalyzer6.Entities.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;
import java.util.List;

@Component
public class StateService {
    @Autowired private com.redistrictinganalyzer6.Repositories.StateRepo stateRepo;
    public State getState(int stateID){
        Optional<State> state = stateRepo.findById(stateID);
        State newState = state.orElse(null);
        return newState;
    }
}

