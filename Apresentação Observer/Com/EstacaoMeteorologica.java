package observer.apresentacao;

import java.util.ArrayList;

public class EstacaoMeteorologica implements Subject {
    
	private ArrayList<Observer> observers = new ArrayList<>();; 
    private float temperatura;
    private float umidade;
    private float pressao;

    public void EstacaoMetereologica(){
        
    }

    public void setMedicoes( float temperatura, float umidade, float pressao ){
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;

        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add( observer );
    }

    @Override
    public void removeObserver(Observer observer) {
        int index = observers.indexOf( observer );
        if( index > -1 ){
            observers.remove( observer );
        }
    }

    @Override
    public void notifyObservers() { 
        for( Observer o :observers ){
            o.update( temperatura, umidade, pressao );
        }
    }
}