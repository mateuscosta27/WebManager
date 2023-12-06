CREATE TABLE tb_sistema(

    id SERIAL PRIMARY KEY,
    nome  VARCHAR(50) NOT NULL,
    protocolo VARCHAR(120)  NOT NULL ,
    dominio VARCHAR(120) NOT NULL,
    porta INTEGER NOT NULL,
    situacao BOOLEAN


);