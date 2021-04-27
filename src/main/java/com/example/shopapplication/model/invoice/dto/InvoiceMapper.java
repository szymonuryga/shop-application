package com.example.shopapplication.model.invoice.dto;

import com.example.shopapplication.model.client.Client;
import com.example.shopapplication.model.client.ClientRepository;
import com.example.shopapplication.model.invoice.Invoice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class InvoiceMapper {

    private final ClientRepository clientRepository;

    public InvoiceDto toDto(Invoice invoice){
        InvoiceDto dto = new InvoiceDto();
        dto.setId(invoice.getId());
        Client client = invoice.getClient();
        dto.setClientId(client.getId());
        return dto;
    }

    public Invoice toEntity(InvoiceDto invoice){
        Invoice entity = new Invoice();
        entity.setId(invoice.getId());
        Optional<Client> client = clientRepository.findById(invoice.getClientId());
        entity.setClient(client.get());

        return entity;
    }
}
