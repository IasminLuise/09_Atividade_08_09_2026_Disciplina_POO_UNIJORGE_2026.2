Contexto:

Uma biblioteca escolar deseja desenvolver um sistema simples para 
controlar os livros disponíveis em seu acervo. Atualmente, as informações 
são registradas manualmente, dificultando o controle dos livros emprestados e disponíveis.

Você foi contratado para desenvolver uma aplicação em Java, utilizando conceitos de Programação Orientada a Objetos (POO).
O sistema deverá permitir cadastrar livros, consultar suas informações, realizar empréstimos e devoluções.
A atividade deverá utilizar classe, atributos, métodos, construtor, getters, setters e objetos.

Objetivo da atividade
Desenvolver uma aplicação orientada a objetos capaz de:
Criar uma classe;
Definir atributos privados;
Criar e utilizar construtores;
Implementar métodos;
Utilizar getters e setters;
Criar e manipular objetos;
Aplicar o conceito de encapsulamento.
Desafio

Crie uma classe chamada Livro.
A classe deverá possuir os seguintes atributos:


Atributo             Tipo                Descrição

titulo                   String             Título do livro

autor                  String              Autor do livro

ano                     int                    Ano de publicação

isbn                    String              Código ISBN

disponivel         boolean           Indica se o livro está disponível

1. Método calcularIdadeLivro()
Crie um método que calcule há quantos anos o livro foi publicado.

2. Método verificarLivroAntigo()
Verifique se o livro possui mais de 50 anos.

3. Validação no Setter
Modifique o setAno() para impedir que seja cadastrado um ano inválido.
Por exemplo: ano > 0 && ano <= 2026
