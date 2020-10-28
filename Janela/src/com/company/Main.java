package com.company;

public class Main {

    public static void main(String[] args) {
	Janela janela = new Janela();

	janela.abrir();
	janela.fechar();
	janela.pintar("Branco");
	janela.pintar("Vermelho");
	janela.pintar("Marrom");
	janela.setDimensaoX(2.0);
	janela.setDimensaoY(3.0);
	janela.setDimensaoZ(0.5);
	System.out.println(janela.estaAberta(janela.getAberta()));
    }
}
