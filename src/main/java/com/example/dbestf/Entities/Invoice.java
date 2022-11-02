package com.example.dbestf.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    @ManyToOne
    @JoinColumn(name = "supplier_id")
    Company supplier;

    @ManyToOne
    @JoinColumn(name = "client_id")
    Company client;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "invoice")
    Set<InvoiceItem> invoiceItems = new java.util.LinkedHashSet<>();
}
