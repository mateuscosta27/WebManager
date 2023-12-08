package com.example.api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_sistema")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String clientName;
    @Column(name = "protocolo", nullable = false)
    private String protocol;
    @Column(name = "dominio", nullable = false)
    private String domain;
    @Column(name = "porta", nullable = false)
    private Integer port;
    @Column(name = "situacao", nullable = false)
    private boolean status;


    public Client(){}
    public Client(String clientName, String protocol, String domain, Integer port, boolean status) {
        this.clientName = clientName;
        this.protocol = protocol;
        this.domain = domain;
        this.port = port;
        this.status = status;
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

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
