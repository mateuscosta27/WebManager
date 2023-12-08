package com.example.api.entity;
import com.example.api.dto.ClientRequestDTO;
import com.example.api.dto.ClientResponseDTO;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Entity
@Table(name = "tb_sistema")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
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
    private Integer port;
    @Column(name = "situacao", nullable = false)
    private boolean status;

    public ClientEntity(){}
    public ClientEntity(ClientRequestDTO clientRequestDTO){
        this.clientName = clientRequestDTO.clientName();
        this.protocol = clientRequestDTO.protocol();
        this.domain = clientRequestDTO.domain();
        this.port = clientRequestDTO.port();
        this.status = clientRequestDTO.status();
    }

}
