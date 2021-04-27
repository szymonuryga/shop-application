package com.example.shopapplication.model.client.dto;

import com.example.shopapplication.model.client.Address;
import com.example.shopapplication.model.client.Client;

public class ClientMapper {

    public ClientDto toDto(Client client){
        ClientDto dto = new ClientDto();
        dto.setId(client.getId());
        dto.setFirstName(client.getFirstName());
        dto.setLastName(client.getLastName());
        dto.setEmail(client.getEmail());
        dto.setPassword(client.getPassword());
        Address address = client.getAddress();
        dto.setCity(address.getCity());
        dto.setStreet(address.getStreet());
        dto.setStreetNumber(address.getStreetNumber());
        dto.setFlatNumber(address.getFlatNumber());
        return dto;
    }

    public Client toEntity(ClientDto client){
        Client entity = new Client();
        entity.setId(client.getId());
        entity.setFirstName(client.getFirstName());
        entity.setLastName(client.getLastName());
        entity.setEmail(client.getEmail());
        entity.setPassword(client.getPassword());
        Address address = new Address();
        address.setCity(client.getCity());
        address.setStreet(client.getStreet());
        address.setStreetNumber(client.getStreetNumber());
        address.setFlatNumber(client.getFlatNumber());
        entity.setAddress(address);
        return entity;
    }

}
