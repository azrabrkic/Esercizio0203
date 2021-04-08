package secondoEs;

public class prodottoNonAlimentare extends Prodotto{
	
	private CategoriaMerceologica categoriaMerceologica;
	
	public prodottoNonAlimentare(String codiceUnivoco, String descrizione, double costo, CategoriaMerceologica categoriaMerceologica ) {
		super(codiceUnivoco, descrizione, costo);
		this.categoriaMerceologica = categoriaMerceologica;
		
	}
	
	public CategoriaMerceologica getCategoriaMerceologica() {
		return categoriaMerceologica;
	}

	@Override
	public void confezione() {

		
	}
}
