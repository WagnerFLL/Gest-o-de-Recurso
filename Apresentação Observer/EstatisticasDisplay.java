package observer.apresentacao;

public class EstatisticasDisplay implements Observer {
    
	private Subject subject;
	private float temperatura;
	private float umidade;
	private float pressao; 

    public EstatisticasDisplay( Subject subject ){
    	this.subject = subject;
        //this.subject.addObserver(this);
    }

    private void display(){
    	
    	System.out.println("---- Class EstatisticasDisplay----");
    	System.out.println("Temperatura: "+this.temperatura);
    	System.out.println("Umidade: "+this.umidade);
    	System.out.println("Pressão: "+this.pressao);
    }

    @Override
    public void update(float temperatura, float umidade, float pressao) {
       
    	this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
        display();
        
    }
}