package system;

import java.util.Scanner;

public class Funcionario {
	
	Scanner scanInt = new Scanner(System.in);
	Scanner scanStr = new Scanner(System.in);
	private int cpf;
	private int ID;
	private String endereco;
	private String nome;
	private String formaPagamento;
	private double taxaServicoSindical;
	
	public Funcionario(int ID) {
		
		this.ID = ID;
		System.out.println("Digite o nome do empregado: ");
		this.nome = scanStr.nextLine();
		System.out.println("Digite seu CPF: ");
		this.cpf = scanInt.nextInt();
		System.out.println("Digite seu endereço: ");
		this.endereco = scanStr.nextLine();
		System.out.println("Qual a forma de pagamento?\n"
				+ "1 - Cheque.\n"
				+ "2 - Depósito bancário."
				+ "3 - Em mãos.\n");
		int option = scanInt.nextInt();
		switch(option) {
		case 1:
			this.formaPagamento = "Cheque";
			break;
		case 2:
			this.formaPagamento = "Depósito bancário";
			break;
		case 3:
			this.formaPagamento = "Em mãos.";
			break;
		default:
			System.out.println("Opção inválida. Depósito bancário foi selecionado.");
			this.formaPagamento = "Depósito bancário";
			break;
		}
	}
	
	public int getID() {
		return ID;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public double getTaxaServicoSindical() {
		return taxaServicoSindical;
	}

	public void setTaxaServicoSindical(double taxaServicoSindical) {
		this.taxaServicoSindical = taxaServicoSindical;
	}

	@Override
	public String toString() {
		return Integer.toString(cpf);
	}
	
}
