package ru.devufa.moneygroup.services.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.devufa.moneygroup.model.common.EntityWithId;
import ru.devufa.moneygroup.repository.BaseRepository;

import java.util.List;

@Service
public class BaseService {

    @Autowired
    private BaseRepository repository;
    
    public void addEntity(EntityWithId entity){
        repository.save(entity);
    }

    public List<EntityWithId> findAll() {
        return repository.findAll();
    }
}
