CREATE TABLE tb_sistema(

    cod_cad_cliente SERIAL PRIMARY KEY,
    nome_cliente  VARCHAR(50) NOT NULL,
    protocolo VARCHAR(120)  NOT NULL ,
    dominio VARCHAR(120) NOT NULL,
    porta INTEGER NOT NULL,
    situacao BOOLEAN


);