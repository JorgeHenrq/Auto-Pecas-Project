CREATE DATABASE `auto_pecas`;

USE `auto_pecas`;


CREATE TABLE `clientes` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome_cliente` varchar(100) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `endereco`  varchar(100) DEFAULT NULL,
  `cidade` varchar(100) DEFAULT NULL,
  `bairro` varchar(100) DEFAULT NULL,
  `numero_endereco`  varchar(100) DEFAULT NULL,
  `contato`  varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

CREATE TABLE `pecas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao_item` varchar(45) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `aplicacao` varchar(45) NOT NULL,
  `valor_compra` decimal (5,2) NOT NULL,
  `valor_venda` decimal (5,2) NOT NULL,
  PRIMARY KEY (`id`)
) ;


CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome_usuario` varchar(45) NOT NULL,
  `cpf_usuario` varchar(11) NOT NULL,
  `cargo` varchar(45) NOT NULL,
  `login` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
   PRIMARY KEY (`id`)
   );

CREATE TABLE `vendas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao_item` varchar(45) NOT NULL,
  `quantidade` int NOT NULL,
  `valor_venda` decimal (9,2) NOT NULL,
  `cpf_cliente` varchar(45) NOT NULL,
  `data` varchar(45) NOT NULL,
  
  PRIMARY KEY (`id`)
);

CREATE TABLE `compras` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descricao_item` varchar(45) NOT NULL,
  `quantidade` int NOT NULL,
  `valor_compra` decimal (9,2) NOT NULL,
  `data` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);