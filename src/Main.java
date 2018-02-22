//ver 1
public class Main {

	public static void main(String[] args) {
		int scelta = 0;
		Stipendi s= new Stipendi();
	
		Dipendente d= new Dipendente("Salvatore", "Carlino", 150, 1250);
		Dipendente d1= new Dipendente("Alessandro", "Schivano", 120, 800);
		Dipendente d2= new Dipendente("Alessandro", "De Marco", 100, 700);
		Dipendente d3= new Dipendente("Gabriele", "MArzano", 200, 1500);
		
		s.InsDip(d);
		s.InsDip(d1);
		s.InsDip(d2);
		s.InsDip(d3);
		
		do {
			System.out.println("1- Inserisci dipendente");
			System.out.println("2- Stampa dipendenti con massimo stipendio");
			System.out.println("3- Ordina i dipendenti in base allo stipendi");
			System.out.println("4- Stampa lista dipendenti");
			System.out.println("5- Esci");
			
			scelta=Lettura.leggiI("Scelta: ");
				
			switch(scelta) {
					case 1:
						s.InsDip(new Dipendente (Lettura.leggiS("Inserisci il nome: "),
								Lettura.leggiS("Inserisci il cognome: "),
								Lettura.leggiI("Inserisci le ore: "),
								Lettura.leggiI("Inserisci lo stipendio: ")));
								break;
					case 2:
						System.out.println(s.stampaDipMaxStip());
						break;
					case 3:
						s.ordina();
						break;
					case 4: System.out.println(s.toString());
						break;
					case 5: 
						break;
					default:
						System.out.println("Scelta errata, riprova");
			}
			
		} while(scelta!=5);
	}

}
