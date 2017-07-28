package system;

public class Horista extends Funcionario{
	
	private double salarioHora;
	private int horasExtras;
	
	public Horista(int ID) {
		super(ID);
		
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
