package com.company;

import java.time.LocalDate;

public class Funcionario {
    private int idFunc;
    public String nomeFunc;
    public String departamento;
    public LocalDate dataContratacao;
    public double salario;
    public String documento;
    public boolean estaAtivo;
////////////////////////// TROCAR PARA PRIVATE
    public int getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(int idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }

    public void atualizarSalario(double newSal){
        this.setSalario(this.getSalario() + newSal);
    }

    public void demitirFuncionario(){
        this.setEstaAtivo(false);
        System.out.println("Funcionário demitido.");
    }

    public void imprimir(){
        System.out.println("Id: " + getIdFunc());
        System.out.println("Nome: " + getNomeFunc());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Data Contratação: " + getDataContratacao());
        System.out.println("Salário: " + getSalario());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Está Ativo: " + isEstaAtivo());
    }
}

