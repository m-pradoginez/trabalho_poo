package com.company;

public class Main {

    public static void main(String[] args) {
	// Iniciar o Programa

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Maromo";
        pessoa1.idade = 47;

        // Ações
        pessoa1.fazAniversario();
        pessoa1.fazAniversario();
        pessoa1.fazAniversario();

        pessoa1.visualizar();
    }
}
