package com.example.api.dto;

public record ClientRequestDTO(String clientName, String protocol, String domain, Integer port, boolean status) {
}
