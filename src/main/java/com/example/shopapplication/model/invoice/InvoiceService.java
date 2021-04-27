package com.example.shopapplication.model.invoice;

import com.example.shopapplication.model.client.Client;
import com.example.shopapplication.model.client.dto.ClientDto;
import com.example.shopapplication.model.client.dto.ClientMapper;
import com.example.shopapplication.model.invoice.dto.InvoiceDto;
import com.example.shopapplication.model.invoice.dto.InvoiceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;
    private final InvoiceProductRepository invoiceProductRepository;
    private final InvoiceMapper invoiceMapper;
    ClientMapper clientMapper = new ClientMapper();

    public List<InvoiceDto> findByClient(Client client){
        return invoiceRepository.findAllByClient(client)
                .stream()
                .map(invoiceMapper::toDto)
                .collect(Collectors.toList());
    }

    public List<InvoiceDto> findByClientDto(ClientDto clientDto){
        final Client client = clientMapper.toEntity(clientDto);
        return invoiceRepository.findAllByClient(client)
                .stream()
                .map(invoiceMapper::toDto)
                .collect(Collectors.toList());
    }

    public InvoiceDto createOrUpdate(InvoiceDto invoice){
        Invoice invoiceEntity = invoiceMapper.toEntity(invoice);
        Invoice savedInvoice = invoiceRepository.save(invoiceEntity);
        return invoiceMapper.toDto(savedInvoice);
    }
}
