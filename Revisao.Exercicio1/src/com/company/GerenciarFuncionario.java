package com.company;

import java.time.LocalDate;

public class GerenciarFuncionario {

	public int posicao = 0;
	final static int TAM = 3;

    public static void main(String[] args) {
	Funcionario func = new Funcionario();
	func.setIdFunc(1);
	func.setNomeFunc("Maromo");
	func.setDepartamento("TI");
	func.setDataContratacao(LocalDate.EPOCH);
	func.setSalario(7000);
	func.setDocumento("RG");
	func.setEstaAtivo(true);
    func.atualizarSalario(100);
    func.imprimir();
    func.demitirFuncionario();
    func.imprimir();

	System.out.println();

	Funcionario func2 = new Funcionario();
	func2.setIdFunc(1);
	func2.setNomeFunc("Jobson");
	func2.setDepartamento("Auditoria");
	func2.setDataContratacao(LocalDate.EPOCH);
	func2.setSalario(5000);
	func2.setDocumento("CPF");
	func2.setEstaAtivo(false);
	System.out.println();

	Funcionario func3 = new Funcionario();
	func3.setIdFunc(1);
	func3.setNomeFunc("Gabriel");
	func3.setDepartamento("TI");
	func3.setDataContratacao(LocalDate.EPOCH);
	func3.setSalario(7000);
	func3.setDocumento("RG");
	func3.setEstaAtivo(true);
	System.out.println();

	Funcionario func4 = new Funcionario();
	func4.setIdFunc(1);
	func4.setNomeFunc("Uilian");
	func4.setDepartamento("TI");
	func4.setDataContratacao(LocalDate.EPOCH);
	func4.setSalario(7000);
	func4.setDocumento("RG");
	func4.setEstaAtivo(true);
	System.out.println();

	Funcionario func5 = new Funcionario();
	func5.setIdFunc(1);
	func5.setNomeFunc("Lucas");
	func5.setDepartamento("TI");
	func5.setDataContratacao(LocalDate.EPOCH);
	func5.setSalario(7000);
	func5.setDocumento("RG");
	func5.setEstaAtivo(true);
	System.out.println();

    Empresa empresa = new Empresa();
    empresa.adicionaEmpregado(func, 0);
    empresa.adicionaEmpregado(func2, 1);
	System.out.println("---------------------------------");
   	empresa.mostraEmpregados();

   	empresa.contem(func5);

	Empresa emp = new Empresa();
	emp.funcionarios(new Funcionario[TAM]);

	emp.adicionaEmpregado(func, 0);
	emp.adicionaEmpregado(func2, 1);
	emp.adicionaEmpregado(func3, 2);
	emp.adicionaEmpregado(func4, 3);

	boolean contemEmpregado = emp.contem(func);
	if(contemEmpregado){
		System.out.println("Funcionário pertencente ao quadro da empresa");
	} else {
		System.out.println("Funcionário não pertence ao quadro da empresa");
	}

    }
}
