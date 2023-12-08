package com.example.api.dto;

import com.example.api.entity.ClientEntity;
import org.springframework.beans.BeanUtils;

public class ClientDTO {

    public ClientDTO(){}

    public ClientDTO(ClientEntity clientEntity){
        BeanUtils.copyProperties(clientEntity, this);
    }

    private Long id;

    private String clientName;

    private String protocol;

    private String domain;

    private String port;

    private boolean status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
