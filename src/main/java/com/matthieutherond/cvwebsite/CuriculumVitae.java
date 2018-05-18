package com.matthieutherond.cvwebsite;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
@NoArgsConstructor
public class CuriculumVitae {

    @Id @GeneratedValue
    private Long id;

    private String firstName;
    private String lastName;
    private String emailAdress;
}
