package com.grupp6.grupp6kontosystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "person_tbl")
public class person {


    @Id
        @GeneratedValue
        Long id;
        int tel;
        String name,email;



        public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public person(Long id, int tel, String name, String email) {
        this.id = id;
        this.tel = tel;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id +
                ", tel=" + tel +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
