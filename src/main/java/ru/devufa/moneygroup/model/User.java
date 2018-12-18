package ru.devufa.moneygroup.model;

import lombok.*;
import ru.devufa.moneygroup.model.common.EntityWithId;

import javax.persistence.Entity;

@Data
@EqualsAndHashCode(callSuper=true)
@Entity
public class User extends EntityWithId {

    private String number;

    private String password;

    private byte[] photo;

    private String email;

    private String controlQuestion;
}
