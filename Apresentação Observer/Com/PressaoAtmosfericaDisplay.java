package observer.apresentacao;

public class PressaoAtmosfericaDisplay implements Observer {

	private Subject subject;
	private float temperatura;
	private float pressao;


    public PressaoAtmosfericaDisplay( Subject subject ){
        this.subject = subject;
        //this.subject.addObserver(this);
    }

    public void display(){
    	System.out.println("---- Class PressaoAtmosferica ----");
    	System.out.println("Temperatura: "+this.temperatura);
    	System.out.println("Pressão: "+this.pressao);
    }

    @Override
    public void update(float temperatura, float umidade, float pressao) {
        this.temperatura = temperatura;
        this.pressao = pressao;
        display();
    }
}