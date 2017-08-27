package observer.pog;

public class EstatisticasDisplay {
    
	private float temperatura;
	private float umidade;
	private float pressao; 

    public EstatisticasDisplay(){
    }

    public void display(){
    	
    	System.out.println("---- Class EstatisticasDisplay----");
    	System.out.println("Temperatura: "+this.temperatura);
    	System.out.println("Umidade: "+this.umidade);
    	System.out.println("Pressão: "+this.pressao+"\n");
    }
    
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public void setUmidade(float umidade) {
		this.umidade = umidade;
	}

	public void setPressao(float pressao) {
		this.pressao = pressao;
	}
	
}