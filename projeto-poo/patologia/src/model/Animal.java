package model;

import java.util.Date;

public class Animal {
	
	private String nome;
	private Tutor tutor = new Tutor();
	private String porte;
	private int score;
	private double medidas;
	private String rgHv;
	private int idade;
	private String especie;
	private String sexo;
	private double peso;
	private Date dataHoraObito;
	private Histopatologia histopatologia = new Histopatologia();
	private Necropsia necropsia = new Necropsia();
	
	public Animal(String nome, Tutor tutor, String porte, int score, double medidas, String rgHv, int idade,
			String especie, String sexo, double peso, Date dataHoraObito) {
		super();
		this.nome = nome;
		this.tutor = tutor;
		this.porte = porte;
		this.score = score;
		this.medidas = medidas;
		this.rgHv = rgHv;
		this.idade = idade;
		this.especie = especie;
		this.sexo = sexo;
		this.peso = peso;
		this.dataHoraObito = dataHoraObito;
	}

	public Animal(String nome, Tutor tutor, String porte, int score, double medidas, String rgHv, int idade,
			String especie, String sexo, double peso, Date dataHoraObito, Histopatologia histopatologia,
			Necropsia necropsia) {
		super();
		this.nome = nome;
		this.tutor = tutor;
		this.porte = porte;
		this.score = score;
		this.medidas = medidas;
		this.rgHv = rgHv;
		this.idade = idade;
		this.especie = especie;
		this.sexo = sexo;
		this.peso = peso;
		this.dataHoraObito = dataHoraObito;
		this.histopatologia = histopatologia;
		this.necropsia = necropsia;
	}

	public Animal() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public double getMedidas() {
		return medidas;
	}

	public void setMedidas(double medidas) {
		this.medidas = medidas;
	}

	public String getRgHv() {
		return rgHv;
	}

	public void setRgHv(String rgHv) {
		this.rgHv = rgHv;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Date getDataHoraObito() {
		return dataHoraObito;
	}

	public void setDataHoraObito(Date dataHoraObito) {
		this.dataHoraObito = dataHoraObito;
	}

	public Histopatologia getHistopatologia() {
		return histopatologia;
	}

	public void setHistopatologia(Histopatologia histopatologia) {
		this.histopatologia = histopatologia;
	}

	public Necropsia getNecropsia() {
		return necropsia;
	}

	public void setNecropsia(Necropsia necropsia) {
		this.necropsia = necropsia;
	}
	
	
	
	
	

}
