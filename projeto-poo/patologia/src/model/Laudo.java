package model;

import java.util.Date;

public class Laudo {
	private Patologista patologista = new Patologista();
	private Animal animal = new Animal();
	private Date dataCriacao;
	private String nome;
	private String instituicao;
	
	public Laudo(Patologista patologista, Animal animal, Date dataCriacao, String nome, String instituicao) {
		super();
		this.patologista = patologista;
		this.animal = animal;
		this.dataCriacao = dataCriacao;
		this.nome = nome;
		this.instituicao = instituicao;
	}

	public Patologista getPatologista() {
		return patologista;
	}

	public void setPatologista(Patologista patologista) {
		this.patologista = patologista;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	
	
	
	
	

}
