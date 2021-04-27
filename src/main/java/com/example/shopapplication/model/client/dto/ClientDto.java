package com.example.shopapplication.model.client.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String city;
    private  String street;
    private Long streetNumber;
    private Long flatNumber;
}
