package com.example.api.controller;


import com.example.api.entity.Client;
import com.example.api.service.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sistemas")

public class ClientController {

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    private ClientService clientService;


    @GetMapping
    public List<Client> read() {
        return clientService.getAllSystems();
    }

    @PostMapping
    public void create(@RequestBody Client client) {
        clientService.createClient(client);

    }

    @PutMapping
    public void update(@RequestBody Client client) {
        clientService.updateClient(client);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        clientService.deleteClient(id);
    }


}
