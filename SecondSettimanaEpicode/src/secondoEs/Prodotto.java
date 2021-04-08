package secondoEs;

/**
Esercizio #2
Gerarchia di prodotti
Il gestore di un negozio associa a tutti i suoi Prodotti un codice univoco, 
una descrizione sintetica del prodotto e il suo prezzo unitario. Realizzare una classe 
Prodotti con le opportune variabili d'istanza e metodi get e set.

Aggiungere alla classe Prodotti un metodo applicaSconto che  ***modifica*** il 
prezzo del prodotto diminuendolo del 5%.

Aggiungere alla classe Prodotti un metodo datiProdotto() che ritorna una 
stringa con i dati del prodotto.

**/
public abstract class Prodotto {   //questa 
	protected String codiceUnivoco;
	protected String descrizione;
	protected double costo;
	
	public Prodotto(String codiceUnivoco, String descrizione, double costo) {  //	questo è un costruttore che inizializza le variabili
		this.codiceUnivoco = codiceUnivoco;
		this.descrizione = descrizione;
		this.costo = costo;
	}
	
	public abstract void confezione();
	
	public void applicaSconto() {
		costo -= 0.05*costo;  //GLI TOLGO IL 5% DEL COSTO
	}
	
	public String datiProdotto() {
		String dati = codiceUnivoco + " " + descrizione + " " + costo;
		return dati;
	}
	
	
//GET E SET
	
	public String getCodiceUnivoco() {
		return codiceUnivoco;
	}

	public void setCodiceUnivoco(String codiceUnivoco) {
		this.codiceUnivoco = codiceUnivoco;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
}
