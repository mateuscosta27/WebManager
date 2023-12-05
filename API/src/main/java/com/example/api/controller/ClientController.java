package com.example.api.controller;


import com.example.api.entity.ClientSystemEntity;
import com.example.api.service.ClientSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sistemas")

public class ClientController {

    public ClientController(ClientSystemService clientSystemService) {
        this.clientSystemService = clientSystemService;
    }

    private ClientSystemService clientSystemService;


    @GetMapping
    public List<ClientSystemEntity> read() {
        return clientSystemService.getAllSystems();
    }

    @PostMapping
    public void create(@RequestBody ClientSystemEntity clientSystemEntity) {
        clientSystemService.createClient(clientSystemEntity);

    }

    @PutMapping
    public void update(@RequestBody ClientSystemEntity clientSystemEntity) {
        clientSystemService.updateClient(clientSystemEntity);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id){
        clientSystemService.deleteClient(id);
    }


}
