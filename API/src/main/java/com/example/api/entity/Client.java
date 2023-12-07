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
    private String port;
    @Column(name = "situacao", nullable = false)
    private boolean status;
}
