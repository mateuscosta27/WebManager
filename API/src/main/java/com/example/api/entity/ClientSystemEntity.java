package com.example.api.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_sistema")
public class ClientSystemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_cad_sistema")
    private Long id;
    @Column(name = "protocolo", nullable = false)
    private String protocol;
    @Column(name = "dominio", nullable = false)
    private String domain;
    @Column(name = "porta", nullable = false)
    private String port;
    @Column(name = "situacao", nullable = false)
    private boolean status;
}
