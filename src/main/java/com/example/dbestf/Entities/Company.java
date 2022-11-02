package com.example.dbestf.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Company {
@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;
}
