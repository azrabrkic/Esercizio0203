package terzoEs;
/*In un'officina agricola possono essere riparati tre tipi di apparecchiature: motozappe, decespugliatori, tosaerba. 
 * Ciascuna   di queste macchine, ha dei dati comuni :
Un numero intero che costituisce il numero d'ordine della lavorazione, ogni volta che una macchina viene consegnata 
all'officina acquisisce un nuovo numero d'ordine, anche se quella macchina è già stata lì in precedenza. 
La marca dell'apparecchio. 
La data di ingresso in officina*/

import java.time.LocalDate;

public abstract class MacchinaAgricola {
	protected int numeroOrdine;
	protected String marca;
	protected LocalDate ingressoInOfficina;

	public MacchinaAgricola(int numeroOrdine, String marca, LocalDate ingressoInOfficina) {
		this.numeroOrdine = numeroOrdine;
		this.marca = marca;
		this.ingressoInOfficina = ingressoInOfficina;
	}
	
	protected Lavorazione[] lavorazioni = new Lavorazione[10];
	protected int numeroLavorazioni;


	public int getNumeroOrdine() {
		return numeroOrdine;
	}

	public void setNumeroOrdine(int numeroOrdine) {
		this.numeroOrdine = numeroOrdine;
	}

	public LocalDate getIngressoInOfficina() {
		return ingressoInOfficina;
	}

	public void setIngressoInOfficina(LocalDate ingressoInOfficina) {
		this.ingressoInOfficina = ingressoInOfficina;
	}

	public String getMarca() {
		return marca;
	}
	
	public double costoRiparazione() {
		double costo = 0;
		for (int i=0 ; i<numeroLavorazioni ; i++) {
			costo += lavorazioni[i].getCosto();
		}
		return costo;
	}
	
}
