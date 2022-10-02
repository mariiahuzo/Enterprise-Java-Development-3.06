package com.IRONHACK.LAB_3_06.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.time.Instant;

@Entity
@NoArgsConstructor
@Getter
@Setter
@PrimaryKeyJoinColumn(name = "id")
public class BillableTask extends Tasks {
    private int hourlyRate;

    public BillableTask(int id, String title, Instant dueDate, boolean status, int hourlyRate) {
        super(id, title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }


}
