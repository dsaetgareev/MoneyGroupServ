package ru.devufa.moneygroup.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.devufa.moneygroup.model.Debt;

import java.util.List;

@Service
public class DebtService {

    @Autowired
    private DebtService service;

    public void save(Debt debt) {
        service.save(debt);
    }

    public List<Debt> findAll() {
        return service.findAll();
    }
}
