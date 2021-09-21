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
@Table(name = "account")
@AllArgsConstructor
@NoArgsConstructor

public class Account {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "balance")
    private String balance;

    @Column(name = "customerID")
    private long customerId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerID", referencedColumnName = "id")
    private Customer customer;



}
