package observer.pog;

public class PressaoAtmosfericaDisplay {

	private float temperatura;
	private float pressao;


    public PressaoAtmosfericaDisplay(){
    }

    public void display(){
    	System.out.println("---- Class PressaoAtmosferica ----");
    	System.out.println("Temperatura: "+this.temperatura);
    	System.out.println("Pressão: "+this.pressao+"\n");
    }
    
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public void setPressao(float pressao) {
		this.pressao = pressao;
	}
}