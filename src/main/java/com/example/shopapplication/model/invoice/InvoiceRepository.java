package com.example.shopapplication.model.invoice;

import com.example.shopapplication.model.client.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice,Long> {
    List<Invoice> findAllByClient(Client client);
}
