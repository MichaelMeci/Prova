package mainpackage;

public class Persona {

	private String nome;
	private String cognome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public Persona(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Persona() {
		
	}
	
	@Override
	public String toString() {
		//return super.toString();
		 return this.nome + " " + this.cognome;
	}
	
	
}
