package secondoEs;
/**
 Il gestore del negozio vuole fare una distinzione tra i prodotti Alimentari e quelli Non Alimentari .
  Ai prodotti Alimentari viene infatti associata una data di scadenza e l'indicazione se è vegano o meno,
mentre a quelli Non Alimentari la categoria merceologica, identificata da un nome e un codice.
Non deve essere possibile istanziare oggetti di tipo prodotto, ma solo prodotti alimentari o non alimentari.
Realizzare la gerarchia delle classi necessarie ad implementare il suddetto contesto.
 **/

import java.time.LocalDate;

public class prodottoAlimentare extends Prodotto {
	private LocalDate dataDiScadenza;
	private boolean vegan;

	public prodottoAlimentare(String codiceUnivoco, String descrizione, double costo, LocalDate dataDiScadenza, boolean vegan) {
		super(codiceUnivoco, descrizione, costo);
		this.dataDiScadenza = dataDiScadenza;
		this.vegan = vegan;
		}
		
	// @compile time -> lette dal compilatore e poi buttate via ;  @runtime -> le compila e le tiene 
	// serve per rimarcare metodi già definiti che serve per due motivi:
	// 1. documentazione del codice
	// 2. ti evita di fare errori di override

	@Override    //è una annotazione, una nota al codice, ma sono speciali, npn sono commenti, il compilatore le legge
	public void confezione() {

		}
	}
	
	

