package observer.apresentacao;

public class main {

	public static void main(String[] args) {

		EstacaoMeteorologica estacao = new EstacaoMeteorologica();
		
		EstatisticasDisplay estatisticasDisplay = new EstatisticasDisplay( estacao );
		MediaDisplay mediaDisplay = new MediaDisplay( estacao );
		PressaoAtmosfericaDisplay pressaoAtmosfericaDisplay = new PressaoAtmosfericaDisplay( estacao );
		
		estacao.addObserver(estatisticasDisplay);
		estacao.addObserver(mediaDisplay);
		estacao.addObserver(pressaoAtmosfericaDisplay);
		
		estacao.setMedicoes(87, 47, 14.4f);
		estacao.setMedicoes(91, 23, 108.2f);
		estacao.setMedicoes(65, 30, 41.2f);


	}

}
