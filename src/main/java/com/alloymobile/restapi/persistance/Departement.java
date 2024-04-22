
package com.alloymobile.restapi.persistance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

}
