package com.example.shopapplication.model.invoice.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoiceProductDto {
    private Long id;
    private Long amount;
    private Long productId;
    private Long invoiceId;
}
