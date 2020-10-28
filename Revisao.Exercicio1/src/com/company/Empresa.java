package com.company;

public class Empresa {
    public int idEmpresa;
    public String razaoSocial;
    public String cnpj;
    public Funcionario[] funcionarios = new Funcionario[3];

    public void adicionaEmpregado(Funcionario funcionario1, int x){
        boolean cheio = true;

        for (x = 0; x < funcionarios.length; x++) {
            if (funcionarios[x] == null) {
                cheio = false;
                funcionarios[x] = funcionario1;
                System.out.println( "Adicionado o Funcionário  = " + this.funcionarios[x].nomeFunc);
                break;
            }
        }
        if (cheio) {
            System.out.println("Vetor cheio, impossível adicionar mais funcionários. ");
        }
    }

    public boolean contem(Funcionario funcionario1) {
        boolean contem;
        for (int x = 0; x < funcionarios.length; x++) {
            if (this.funcionarios[x] == funcionario1) {
                contem = true;
                System.out.println(contem);
                return true;
            }
        }
        System.out.println(false);
        return false;
    }

    public void mostraEmpregados() {
        for (int x = 0; x < this.funcionarios.length; x++) {
            if (funcionarios[x] != null) {
                System.out.println("Funcionário " + funcionarios[x].nomeFunc);
                System.out.println("Departamento: " + funcionarios[x].departamento);
                System.out.println("Departamento: " + funcionarios[x].dataContratacao);
                System.out.println("Departamento: " + funcionarios[x].salario);
                System.out.println("Departamento: " + funcionarios[x].documento);
                System.out.println("Departamento: " + funcionarios[x].estaAtivo);
                System.out.println("---------------------------------");
            }
        }
    }

    public void funcionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
}

