package com.IRONHACK.LAB_3_06.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Embeddable
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Name {

    private String firstName;
    private String lastName;
    private String middleName;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('Mr', 'Ms', 'Dr', 'None')")
    private Salutation salutation;

}
