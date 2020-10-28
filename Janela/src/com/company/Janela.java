package com.company;

public class Janela {
    private String aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public String getAberta() {
        return aberta;
    }

    public void setAberta(String aberta) {
        this.aberta = aberta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
    
    public void abrir(){
        System.out.println("Janela Aberta!");
        aberta = "Aberta";
    }

    public void fechar(){
        System.out.println("Janela Fechada!");
        aberta = "Fechada";
    }

    public void pintar(String s){

        System.out.println("Janela pintada de " + s);
    }

    public void abre(){
        System.out.println("Janela Aberta!");
    }

    public boolean estaAberta(String aberta){
        return aberta.equals("Aberta");
    }



}
