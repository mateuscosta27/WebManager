package com.example.api.controller;


import com.example.api.dto.ClientDTO;
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
    public List<ClientDTO> read() {
        return clientService.getAllSystems();
    }

    @PostMapping
    public void create(@RequestBody ClientDTO clientDTO) {
        clientService.createClient(clientDTO);

    }

    @PutMapping
    public void update(@RequestBody ClientDTO clientDTO) {
        clientService.updateClient(clientDTO);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        clientService.deleteClient(id);
    }


}
