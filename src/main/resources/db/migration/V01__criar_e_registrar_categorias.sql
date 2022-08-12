CREATE TABLE cliente(
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL,
	telefone VARCHAR(14)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO cliente (nome, email, telefone) VALUES ('Cliente 1', 'email1@email.com', '0801');
INSERT INTO cliente (nome, email, telefone) VALUES ('Cliente 2', 'email2@email.com', '0802');
INSERT INTO cliente (nome, email, telefone) VALUES ('Cliente 3', 'email3@email.com', '0803');
INSERT INTO cliente (nome, email, telefone) VALUES ('Cliente 4', 'email4@email.com', '0804');