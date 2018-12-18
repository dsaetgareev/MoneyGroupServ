package ru.devufa.moneygroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.devufa.moneygroup.model.common.EntityWithId;

import java.util.UUID;

public interface BaseRepository extends JpaRepository<EntityWithId, UUID> {

}
