package com.company;

public class Pessoa {

    //Atributos
    public String nome;
    public int idade;

    //Método
    public void fazAniversario(){
        idade = idade+1;
    }

    public void visualizar(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}
