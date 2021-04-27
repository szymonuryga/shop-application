package com.example.shopapplication.model.invoice.dto;

import com.example.shopapplication.model.invoice.Invoice;
import com.example.shopapplication.model.invoice.InvoiceProduct;
import com.example.shopapplication.model.product.Product;

public class InvoiceProductMapper {

    public InvoiceProductDto toDto(InvoiceProduct invoiceProduct){
        InvoiceProductDto dto = new InvoiceProductDto();
        dto.setId(invoiceProduct.getId());
        dto.setAmount(invoiceProduct.getAmount());
        Invoice invoice = invoiceProduct.getInvoice();
        dto.setInvoiceId(invoice.getId());
        Product product = invoiceProduct.getProduct();
        dto.setProductId(product.getId());

        return dto;
    }
}
