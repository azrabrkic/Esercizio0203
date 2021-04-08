package primoEs;

import java.util.Scanner;

public class giovediSecondaSettimana {

	public static void main(String[] args) {

	}
	
//	Esercizio
//	Gerarchia di persone
//	Definire una classe Java che rappresenta una persona.
//	La classe Persona deve possedere i seguenti campi:
//	-	nome (stringa)
//	-	cognome (stringa)
//	Inoltre, mette a disposizione un metodo info per ritornare una stringa che riporta il nome e il cognome.
	
	public class persona() { 
		
		protected String nome;
		protected String cognome;
		
		public Persona(String nome, String cognome) {
			this.nome = nome;
			this.cognome = cognome;
		}
		
		public String info() { //NON PRENDE INPUT 
			
			String info = nome + " " + cognome;
			return info;
			
		}
		
	}


	
//	Definire  poi due classi che rappresentano rispettivamente studenti e lavoratori.

//	La classe Studente estende la classe Persona e aggiunge i seguenti campi privati:
//	-	matricolaStudente (intero) 
//	-	corso di laurea (stringa)
//	- 	statoStudente [IN_CORSO, FUORI_CORSO, LAUREATO, INTERROTTO]
//	Aggiungere il metodo infoStudente per riportare, oltre al nome e cognome, anche la matricola, 
//	il corso di laurea e lo stato.


	
	/**public static void studente() {
		Scanner individuo = new Scanner (System.in);
		
		System.out.println("Inserisci il tuo numero di matricola:");
		int matricolaStudente = individuo.nextInt();
		
	} **/
	
	
}
