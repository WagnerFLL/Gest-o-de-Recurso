package projeto2.folha.pagamento;

import java.util.Scanner;

public class Hourly extends Functionary {
	
	Scanner scan = new Scanner( System.in );
	private double hourlyWage;
	private int extraHours;
	private int workingHours;
	
	public Hourly( int ID ) {
		super( ID, 7 );
		
		try {
		
			System.out.println( "Informe o valor do sal�rio/hora: (Float)" );
			this.hourlyWage = scan.nextDouble();
		
		} catch( NumberFormatException e ) {
			
			e.printStackTrace();
			this.hourlyWage = 1.0;
		
		}
		
		this.extraHours = 0;
		this.workingHours = 0;
	}

	public double toPay() {
		
		double salario = this.hourlyWage * this.workingHours; 
		salario += ( this.hourlyWage * 1.5 ) * ( this.extraHours ); 
		return salario;
		
	}
	
	public void addHours( int horas ) {
		
		this.workingHours += horas;
	}
	
}
