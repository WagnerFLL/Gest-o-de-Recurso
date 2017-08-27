package observer.pog;

public class Main {

	public static void main(String[] args) {
		
		EstacaoMeteorologica estacao = new EstacaoMeteorologica();
		
		EstatisticasDisplay estatisticasDisplay = new EstatisticasDisplay();
		MediaDisplay mediaDisplay = new MediaDisplay();
		PressaoAtmosfericaDisplay pressaoAtmosfericaDisplay = new PressaoAtmosfericaDisplay();
		
		// Primeira modificação
		
		estacao.setMedicoes(87, 47, 14.4f);
		
		estatisticasDisplay.setPressao( estacao.getPressao() );
		estatisticasDisplay.setTemperatura( estacao.getTemperatura() );
		estatisticasDisplay.setUmidade( estacao.getUmidade() );
		estatisticasDisplay.display();
		
		mediaDisplay.setPressao( estacao.getPressao() );
		mediaDisplay.setTemperatura( estacao.getTemperatura() );
		mediaDisplay.setUmidade( estacao.getUmidade() );
		mediaDisplay.display();
		
		pressaoAtmosfericaDisplay.setPressao( estacao.getPressao() );
		pressaoAtmosfericaDisplay.setTemperatura( estacao.getTemperatura() );
		pressaoAtmosfericaDisplay.display();
		
		// Segunda modificação
		
		estacao.setMedicoes(91, 23, 108.2f);
		
		estatisticasDisplay.setPressao( estacao.getPressao() );
		estatisticasDisplay.setTemperatura( estacao.getTemperatura() );
		estatisticasDisplay.setUmidade( estacao.getUmidade() );
		estatisticasDisplay.display();
		
		mediaDisplay.setPressao( estacao.getPressao() );
		mediaDisplay.setTemperatura( estacao.getTemperatura() );
		mediaDisplay.setUmidade( estacao.getUmidade() );
		mediaDisplay.display();
		
		pressaoAtmosfericaDisplay.setPressao( estacao.getPressao() );
		pressaoAtmosfericaDisplay.setTemperatura( estacao.getTemperatura() );
		pressaoAtmosfericaDisplay.display();
		
		// terceira modificação
		
		estacao.setMedicoes(65, 30, 41.2f);
		
		estatisticasDisplay.setPressao( estacao.getPressao() );
		estatisticasDisplay.setTemperatura( estacao.getTemperatura() );
		estatisticasDisplay.setUmidade( estacao.getUmidade() );
		estatisticasDisplay.display();
		
		mediaDisplay.setPressao( estacao.getPressao() );
		mediaDisplay.setTemperatura( estacao.getTemperatura() );
		mediaDisplay.setUmidade( estacao.getUmidade() );
		mediaDisplay.display();
		
		pressaoAtmosfericaDisplay.setPressao( estacao.getPressao() );
		pressaoAtmosfericaDisplay.setTemperatura( estacao.getTemperatura() );
		pressaoAtmosfericaDisplay.display();
	}

}
