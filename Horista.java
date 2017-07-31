package system;

import java.util.Scanner;

public class Horista extends Funcionario{
	
	Scanner scan = new Scanner(System.in);
	private double salarioHora;
	private int horasExtras;
	private int horasTrabalhadas;
	
	public Horista(int ID) {
		super(ID,7);
		System.out.println("Informe o valor do salário/hora:");
		this.salarioHora = scan.nextDouble();
		this.horasExtras = 0;
		this.horasTrabalhadas = 0;
	}

	public double pagar(){
		double salario = this.salarioHora*this.horasTrabalhadas; 
		salario += (this.salarioHora*1.5) * (this.horasExtras); 
		return salario;
	}
	public void addHoras(int horas) {
		this.horasTrabalhadas += horas;
	}
	public double getSalarioHora() {
		return salarioHora;
	}

	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}

	public int getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(int horasExtras) {
		this.horasExtras = horasExtras;
	}
	
}
