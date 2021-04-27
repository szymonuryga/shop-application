package com.example.shopapplication.model.client;

import com.example.shopapplication.model.invoice.Invoice;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="CLIENTS")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    @Email
    private String email;

    private String password;

    @Embedded
    private Address address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private List<Invoice> invoices = new ArrayList<>();
}
