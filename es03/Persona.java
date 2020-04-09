public class Persona {
	private String nome;
	private String cognome;
	private int eta;
	
	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public int getEta() {
		return this.eta;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public void setEta(int eta) {
		this.eta = eta;
	}
	
	public String toString() {
		return this.nome + " " + this.cognome + " " + this.eta;
	}
	
	public boolean equals(Persona p) {
		if(p.nome.equals(this.nome) && p.cognome.equals(this.cognome) && p.eta == this.eta) {
			return true;
		}
		return false;
	}
}