package atividade;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario f = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		f.setCargo("Gerente");
		f.setEndereco("Rua 5");
		f.setNome("Lucas");
		f.setSalario(15004.0);
		f.setTelefone("9999999999");
		
		f2.setCargo("Professor");
		f2.setEndereco("Rua 51");
		f2.setNome("Pedro");
		f2.setSalario(1500.0);
		f2.setTelefone("99959999999");
		
		
		System.out.println(f.toString());
		System.out.println(f2.toString());

		
		
	}

}
