CREATE TABLE academia (
    id_academia SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    endereco VARCHAR(100) NOT NULL,
    telefone VARCHAR(20) NOT NULL
);

CREATE TABLE clientes (
    id_cliente SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) NOT NULL UNIQUE,
    data_nascimento DATE NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE instrutor (
    id_instrutor SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    especialidade VARCHAR(100) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    cref VARCHAR(100) NOT NULL
);

CREATE TABLE maquina (
    id_maquina SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL
);

CREATE TABLE contrato (
    id_instrutor INT,
    id_academia INT,
    PRIMARY KEY (id_instrutor, id_academia),
    FOREIGN KEY (id_instrutor) REFERENCES instrutor(id_instrutor) ON DELETE CASCADE,
    FOREIGN KEY (id_academia) REFERENCES academia(id_academia) ON DELETE CASCADE
);

CREATE TABLE matricula (
    id_cliente INT,
    id_academia INT,
    data_inicio DATE,
    data_fim DATE,
    PRIMARY KEY (id_cliente, id_academia),
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente) ON DELETE CASCADE,
    FOREIGN KEY (id_academia) REFERENCES academia(id_academia) ON DELETE CASCADE
);

CREATE TABLE ficha_treino (
    id_ficha SERIAL PRIMARY KEY,
    objetivo VARCHAR(100),
    data_inicio DATE,
    data_fim DATE,
    id_cliente INT,
    id_instrutor INT,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente) ON DELETE CASCADE,
    FOREIGN KEY (id_instrutor) REFERENCES instrutor(id_instrutor) ON DELETE SET NULL
);

CREATE TABLE ficha_maquina (
    id_ficha INT,
    id_maquina INT,
    series INT,
    repeticoes INT,
    PRIMARY KEY (id_ficha, id_maquina),
    FOREIGN KEY (id_ficha) REFERENCES ficha_treino(id_ficha) ON DELETE CASCADE,
    FOREIGN KEY (id_maquina) REFERENCES maquina(id_maquina) ON DELETE CASCADE
);