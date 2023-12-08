package com.example.api.service;

import com.example.api.dto.ClientDTO;
import com.example.api.entity.ClientEntity;
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

    public List<ClientDTO> getAllSystems() {
        List<ClientEntity> systems = repository.findAll();
        return systems.stream().map(ClientDTO::new).toList();
    }

    public void createClient(ClientDTO clientDTO){
        ClientEntity clientEntity = new ClientEntity(clientDTO);
        repository.save(clientEntity);
    }

    public ClientDTO updateClient(ClientDTO clientDTO){
        ClientEntity clientEntity = new ClientEntity(clientDTO);
        return new ClientDTO( repository.save(clientEntity));


    }

    public void deleteClient(Long id){

        ClientEntity clientEntity = repository.findById(id).get();
        repository.delete(clientEntity);
    }
}
