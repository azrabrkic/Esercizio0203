package terzoEs;

import java.time.LocalDate;

//Per le motozappe va specificato il numero di frese

public class MotoZappa extends MacchinaConRuote {
	private int numeroFrese;


	public MotoZappa(int numeroOrdine, String marca, LocalDate ingressoInOfficina, int numeroRuote, int numeroFrese) {
		super(numeroOrdine, marca, ingressoInOfficina, numeroRuote);
		this.numeroFrese = numeroFrese;
		
	}

	public int getNumeroFrese() {
		return numeroFrese;
	}
	
	
}
