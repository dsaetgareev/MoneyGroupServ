package ru.devufa.moneygroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.devufa.moneygroup.model.User;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}
