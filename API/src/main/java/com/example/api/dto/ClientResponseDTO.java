package com.example.api.dto;

import com.example.api.entity.ClientEntity;

public record ClientResponseDTO(Long id, String clientName, String protocol, String domain, Integer port, boolean status) {

    public ClientResponseDTO(ClientEntity client) {
        this(client.getId(), client.getClientName(), client.getProtocol(),client.getDomain(), client.getPort(), client.isStatus());

    }
}