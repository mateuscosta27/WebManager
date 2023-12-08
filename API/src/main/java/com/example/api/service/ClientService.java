package com.example.api.service;

import com.example.api.dto.ClientRequestDTO;
import com.example.api.dto.ClientResponseDTO;
import com.example.api.entity.ClientEntity;
import com.example.api.repository.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository repository;

    public ClientService(ClientRepository clientRepository) {
        this.repository = clientRepository;
    }

    public List<ClientResponseDTO> getAllSystems() {
       List<ClientResponseDTO> clientResponseDTOList = repository.findAll().stream().map(ClientResponseDTO::new).toList();
       return clientResponseDTOList;
    }

    public void createClient(ClientRequestDTO clientRequestDTO){
        ClientEntity clientEntity = new ClientEntity(clientRequestDTO);
        repository.save(clientEntity);
    }



    public void deleteClient(Long id){

        ClientEntity clientEntity = repository.findById(id).get();
        repository.delete(clientEntity);
    }
}
