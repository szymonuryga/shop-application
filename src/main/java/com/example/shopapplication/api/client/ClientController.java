package com.example.shopapplication.api.client;

import com.example.shopapplication.model.client.Address;
import com.example.shopapplication.model.client.Client;
import com.example.shopapplication.model.client.ClientService;
import com.example.shopapplication.model.client.dto.ClientDto;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping
    public List<ClientDto> findAll(){
        return clientService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClientDto> findById(@PathVariable Long id){
        return clientService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClientDto createClient(@RequestBody ClientDto client) {
        return clientService.save(client);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.removeClient(id);
    }

}
