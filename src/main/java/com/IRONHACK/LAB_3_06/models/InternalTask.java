package com.IRONHACK.LAB_3_06.models;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.Instant;

@NoArgsConstructor
@Entity
public class InternalTask extends Tasks {

    public InternalTask(int id, String title, Instant dueDate, boolean status) {

        super(id, title, dueDate, status);
    }

}




