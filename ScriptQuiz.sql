CREATE DATABASE db_quiz;
USE db_quiz;

CREATE TABLE tb_usuario(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(200),
    email VARCHAR(200),
    senha VARCHAR(200),
    pontuacao int
);

CREATE TABLE tb_questao(
	id INT PRIMARY KEY AUTO_INCREMENT,
    pergunta VARCHAR(500),
    alternativaA VARCHAR(500),
    alternativaB VARCHAR(500),
    alternativaC VARCHAR(500),
    alternativaD VARCHAR(500),
    alternativaCorreta VARCHAR(500),
    justificativa VARCHAR(500)
);

CREATE TABLE tb_noticia(
	id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(500),
    resumo VARCHAR(500),
    url VARCHAR(500)
);