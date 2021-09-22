package com.grupp6.grupp6kontosystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "konto_tbl")
public class account {

    // skapar med lombok våran blueprint för våra account objekt
    // berättar även för appen vart i columnerna(databasen) som de olika variablerna ska ligga
    @Id @GeneratedValue
    Long id;
    String saldo;
    long customerId;

}
