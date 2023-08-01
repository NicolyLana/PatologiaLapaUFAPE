package model;

import java.util.Date;

public class Necropsia{
	private Date dataHoraNecropsia;
	private String tipoMorte;
	private String descricaoSistemaNervoso;
	private String descricaoCavidadeAbdominal;
	private String descricaoCavidadeToracica;
	private String descricaoExteriorSC;
	private Conservacao conservacao;


	public Necropsia(Date dataHoraNecropsia, String tipoMorte, String descricaoSistemaNervoso,
			String descricaoCavidadeAbdominal, String descricaoCavidadeToracica, String descricaoExteriorSC,
			Conservacao conservacao) {
		super();
		this.dataHoraNecropsia = dataHoraNecropsia;
		this.tipoMorte = tipoMorte;
		this.descricaoSistemaNervoso = descricaoSistemaNervoso;
		this.descricaoCavidadeAbdominal = descricaoCavidadeAbdominal;
		this.descricaoCavidadeToracica = descricaoCavidadeToracica;
		this.descricaoExteriorSC = descricaoExteriorSC;
		this.conservacao = conservacao;
	}


	public Necropsia() {
		super();
	}


	public Date getDataHoraNecropsia() {
		return dataHoraNecropsia;
	}


	public void setDataHoraNecropsia(Date dataHoraNecropsia) {
		this.dataHoraNecropsia = dataHoraNecropsia;
	}


	public String getTipoMorte() {
		return tipoMorte;
	}


	public void setTipoMorte(String tipoMorte) {
		this.tipoMorte = tipoMorte;
	}


	public String getDescricaoSistemaNervoso() {
		return descricaoSistemaNervoso;
	}


	public void setDescricaoSistemaNervoso(String descricaoSistemaNervoso) {
		this.descricaoSistemaNervoso = descricaoSistemaNervoso;
	}


	public String getDescricaoCavidadeAbdominal() {
		return descricaoCavidadeAbdominal;
	}


	public void setDescricaoCavidadeAbdominal(String descricaoCavidadeAbdominal) {
		this.descricaoCavidadeAbdominal = descricaoCavidadeAbdominal;
	}


	public String getDescricaoCavidadeToracica() {
		return descricaoCavidadeToracica;
	}


	public void setDescricaoCavidadeToracica(String descricaoCavidadeToracica) {
		this.descricaoCavidadeToracica = descricaoCavidadeToracica;
	}


	public String getDescricaoExteriorSC() {
		return descricaoExteriorSC;
	}


	public void setDescricaoExteriorSC(String descricaoExteriorSC) {
		this.descricaoExteriorSC = descricaoExteriorSC;
	}


	public Conservacao getConservacao() {
		return conservacao;
	}


	public void setConservacao(Conservacao conservacao) {
		this.conservacao = conservacao;
	}


	@Override
	public String toString() {
		return "Necropsia [dataHoraNecropsia=" + dataHoraNecropsia + ", tipoMorte=" + tipoMorte
				+ ", descricaoSistemaNervoso=" + descricaoSistemaNervoso + ", descricaoCavidadeAbdominal="
				+ descricaoCavidadeAbdominal + ", descricaoCavidadeToracica=" + descricaoCavidadeToracica
				+ ", descricaoExteriorSC=" + descricaoExteriorSC + ", conservacao=" + conservacao + "]";
	}
	
	
	
	

}
