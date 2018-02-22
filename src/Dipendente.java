//ver 1
// Carlino gay
public class Dipendente {
	private String cognome;
	private String nome;
	private int ore;
	private float stipO;
	
	
	
	public Dipendente(String cognome, String nome, int ore, float stipO) {
		super();
		this.cognome = cognome;
		this.nome = nome;
		this.ore = ore;
		this.stipO = stipO;
	}
	
	public void setOre(int ore) {
		this.ore = ore;
	}
	
	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public float getStipO() {
		return stipO * ore;
	}

	public String toString() {
		return "Dipendente [cognome=" + cognome + ", nome=" + nome + ", ore=" + ore + ", stipO=" + stipO + "]";
	}


}
