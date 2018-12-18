package ru.devufa.moneygroup.model.common;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import java.util.UUID;

@MappedSuperclass
public abstract class EntityWithId extends EntityWithoutId {
    @Id
    @Type(type="uuid-char")
    @Column(name="id")
    public UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @PrePersist
    public void prePersist() {
        super.prePersist();

        if(this.getId() == null || this.getId().toString().equals("")){
            this.id = UUID.randomUUID();
        }
    }
}
