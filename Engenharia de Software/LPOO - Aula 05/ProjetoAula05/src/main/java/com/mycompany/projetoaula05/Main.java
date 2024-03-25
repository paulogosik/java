/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoaula05;

/**
 *
 * @author pgosi
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.cpf = "03534314190";
        person1.nome = "Paulo Gosik";
        person1.dataDeNascenca = "03/12/2004";
        person1.idade = 19;
        person1.cidade = "Goiânia";
        person1.Info();

        System.out.println("--------------------");

        Person person2 = new Person();
        person2.cpf = "12345678900";
        person2.nome = "Guilherme Thomaz";
        person2.dataDeNascenca = "27/05/2004";
        person2.idade = 19;
        person2.cidade = "Brasília";
        person2.Info();


    }
}
