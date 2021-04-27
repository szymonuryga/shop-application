package com.example.shopapplication.api.invoice;

import com.example.shopapplication.api.NotFoundClientException;
import com.example.shopapplication.model.client.ClientService;
import com.example.shopapplication.model.client.dto.ClientDto;
import com.example.shopapplication.model.invoice.InvoiceService;
import com.example.shopapplication.model.invoice.dto.InvoiceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients/{clientId}/invoices")
@RequiredArgsConstructor
public class InvoiceController {
    private final InvoiceService invoiceService;
    private final ClientService clientService;

    @GetMapping
    public List<InvoiceDto> findAll(@PathVariable Long clientId)  {
         ClientDto client = clientService
                .findById(clientId).orElseThrow(()-> new NotFoundClientException());

       return invoiceService.findByClientDto(client);
    }
}
