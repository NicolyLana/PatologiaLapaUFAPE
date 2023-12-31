package model;

public abstract class Pessoa {
	private String nome;
	private String email;
	private String telefone;
	
	public Pessoa(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	public Pessoa() {}
	
	public String getNome() {
		return this.nome;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
