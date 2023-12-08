package com.example.api.service;

import com.example.api.entity.Client;
import com.example.api.repository.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository repository;

    public ClientService(ClientRepository clientRepository) {
        this.repository = clientRepository;
    }

    public List<Client> getAllSystems(){

        return repository.findAll();
    }

    public void createClient(Client client){

        repository.save(client);

    }

    public void updateClient(Client client){
        repository.save(client);


    }

    public void deleteClient(Long id){
        repository.deleteById(id);
    }
}
