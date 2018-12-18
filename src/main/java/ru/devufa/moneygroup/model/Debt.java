package ru.devufa.moneygroup.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import ru.devufa.moneygroup.model.common.EntityWithId;
import ru.devufa.moneygroup.model.enums.Currencies;

import javax.persistence.*;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
public class Debt extends EntityWithId {

    @ManyToOne(targetEntity=User.class)
    private User creditor;

    @ManyToOne(targetEntity=User.class)
    private User debtor;

    private double amount;

    private Currencies currencies;

    private String comment;
}
