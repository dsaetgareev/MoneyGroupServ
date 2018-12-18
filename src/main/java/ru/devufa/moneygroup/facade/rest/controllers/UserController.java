package ru.devufa.moneygroup.facade.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.devufa.moneygroup.model.User;
import ru.devufa.moneygroup.services.impl.UserService;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/save")
    public boolean save(@RequestBody String number) {
        User user = new User();
        user.setNumber(number);
        service.save(user);
        return true;
    }

    @GetMapping("/users")
    public List allUsers() {
        return service.findAll();
    }
}
