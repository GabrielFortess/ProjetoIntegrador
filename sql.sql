create database PI;
use PI;


CREATE TABLE `destino` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(150) NOT NULL,
  `endereco` varchar(150) NOT NULL,
  `data` date NOT NULL,
  `unidades` int NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE `descarte` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
   `nome` varchar(150) NOT NULL,
  `tipo` varchar(150) NOT NULL,
  `destino` varchar(150) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
   `nome` varchar(150) NOT NULL,
  `endereco` varchar(150) NOT NULL,
   `senha` varchar(150) NOT NULL,
  `salario` int NOT NULL,
  `funcao` varchar(150) NOT NULL,
  `cpf` varchar(150) NOT NULL,

  PRIMARY KEY (id)
);

INSERT into usuario(nome,endereco,senha,salario,funcao,cpf) VALUES ('admin','rua 1','123',5,'admin','cpf');