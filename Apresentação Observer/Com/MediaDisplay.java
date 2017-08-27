package observer.apresentacao;

public class MediaDisplay implements Observer {

	private Subject subject;

    public MediaDisplay( Subject subject ){
    	this.subject = subject;
        //this.subject.addObserver(this);
    }

    public void display(){
        // IMAGINE QUE AQUI TEM ALGO RELEVANTE
    }

    @Override
    public void update(float temperatura, float umidade, float pressao) {
    	
    	System.out.println("---- Class MediaDisplay ----");
    	System.out.println("Temperatura: "+temperatura);
    	System.out.println("Umidade: "+umidade);
    	System.out.println("Pressão: "+pressao);
        display();
        
    }
    
}