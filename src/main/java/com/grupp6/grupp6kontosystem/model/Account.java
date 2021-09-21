package com.grupp6.grupp6kontosystem.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Account {
    @Id @GeneratedValue
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    Long id;
    String saldo;
    long customerId;

}
