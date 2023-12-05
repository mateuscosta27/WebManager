package com.example.api.service;

import com.example.api.entity.ClientSystemEntity;
import com.example.api.repository.ClientSystemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientSystemService {

    private final ClientSystemRepository clientSystemRepository;

    public ClientSystemService(ClientSystemRepository clientSystemRepository) {
        this.clientSystemRepository = clientSystemRepository;
    }

    public List<ClientSystemEntity> getAllSystems(){

        return clientSystemRepository.findAll();
    }

    public void createClient(ClientSystemEntity clientSystemEntity){

        clientSystemRepository.save(clientSystemEntity);

    }

    public void updateClient(ClientSystemEntity clientSystemEntity){
        clientSystemRepository.save(clientSystemEntity);

    }

    public void deleteClient(Long id){
        clientSystemRepository.deleteById(id);
    }
}
