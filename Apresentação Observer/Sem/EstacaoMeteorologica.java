package observer.pog;

public class EstacaoMeteorologica {
     
    private float temperatura;
    private float umidade;
    private float pressao;

    public void EstacaoMetereologica(){
        
    }

    public void setMedicoes( float temperatura, float umidade, float pressao ){
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;
    }

	public float getTemperatura() {
		return temperatura;
	}

	public float getUmidade() {
		return umidade;
	}

	public float getPressao() {
		return pressao;
	}
    
}