package com.company;

public class Casa {
    public String cor;
    public String janela1;
    public String janela2;
    public String janela3;
    public int aberta;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getJanela1() {
        return janela1;
    }

    public void setJanela1(String janela1) {
        this.janela1 = janela1;
    }

    public String getJanela2() {
        return janela2;
    }

    public void setJanela2(String janela2) {
        this.janela2 = janela2;
    }

    public String getJanela3() {
        return janela3;
    }

    public void setJanela3(String janela3) {
        this.janela3 = janela3;
    }

    public boolean quantidadeJanelasAbertas() {
        if (janela1.equals("Aberta")) {
            aberta = aberta + 1;
        }
        if (janela2.equals("Aberta")) {
            aberta = aberta + 1;
        }
        if (janela3.equals("Aberta")) {
            aberta = aberta + 1;
        }
        System.out.println("Existem " + aberta + "janelas abertas na casa.");
        return false;
    }
}
