package ru.devufa.moneygroup.services.impl;

import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.devufa.moneygroup.model.User;
import ru.devufa.moneygroup.repository.UserRepository;

import javax.validation.constraints.Null;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void save(User user) {
        this.repository.save(user);
    }

    public List<User> findAll() {
        return repository.findAll();
    }
}
