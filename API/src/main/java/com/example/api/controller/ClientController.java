package com.example.api.controller;


import com.example.api.dto.ClientRequestDTO;
import com.example.api.dto.ClientResponseDTO;
import com.example.api.entity.ClientEntity;
import com.example.api.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sistemas")

public class ClientController {

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    private final ClientService clientService;


    @GetMapping
    public List<ClientResponseDTO> read() {
        return clientService.getAllSystems();
    }

    @PostMapping
    public void create(@RequestBody ClientRequestDTO client) {

        clientService.createClient(client);


    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        clientService.deleteClient(id);
    }


}
