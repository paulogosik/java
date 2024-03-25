package com.mycompany.projetoaula05;

public class Person {
    int idade;
    String cpf, dataDeNascenca, nome, cidade;

    public void Info(){
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Ano de Nascença: " + dataDeNascenca);
        System.out.println("Cidade de Nascença: " + cidade);
    }
}
