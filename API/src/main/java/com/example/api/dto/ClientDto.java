package com.example.api.dto;

public record ClientDto(
        String clientName,
        String protocol,
        String domain,
        Integer port,
        boolean status
) {
}
