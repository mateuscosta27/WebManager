package com.example.api.entity;
import com.example.api.dto.ClientDTO;
import jakarta.persistence.*;
import org.springframework.beans.BeanUtils;
import java.util.Objects;

@Entity
@Table(name = "tb_sistema")
public class ClientEntity {
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
    private String port;
    @Column(name = "situacao", nullable = false)
    private boolean status;

    public ClientEntity(){}
    public ClientEntity(ClientDTO clientDTO){
        BeanUtils.copyProperties(clientDTO, this);
    }


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ClientEntity clientEntity)) return false;
        return Objects.equals(id, clientEntity.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
