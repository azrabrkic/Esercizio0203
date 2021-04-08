package terzoEs;

import java.time.LocalDate;

//Per i decespugliatori bisogna specificare se l'accensione è elettronica oppure no. 

public class Decespigliatore extends MacchinaAgricola{
	private boolean  accensioneElettronica;

	public Decespigliatore(int numeroOrdine, String marca, LocalDate ingressoInOfficina, boolean accensioneElettronica) {
		super(numeroOrdine, marca, ingressoInOfficina);
		this.accensioneElettronica = accensioneElettronica;
	}

	public boolean isAccensioneElettronica() {
		return accensioneElettronica;
	}
	
	
}
