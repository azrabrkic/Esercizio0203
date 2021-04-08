package terzoEs;

import java.time.LocalDate;

public abstract class MacchinaConRuote extends MacchinaAgricola{
	protected int numeroRuote;


	public MacchinaConRuote(int numeroOrdine, String marca, LocalDate ingressoInOfficina, int numeroRuote) {
		super(numeroOrdine, marca, ingressoInOfficina);
		this.numeroRuote = numeroRuote;
	
	}

	public int getNumeroRuote() {
		return numeroRuote;
	}
	
	
}
