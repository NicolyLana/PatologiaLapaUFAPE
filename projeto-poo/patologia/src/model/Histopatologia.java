package model;

public class Histopatologia {
	private String descricao;
	private ExteriorSC exteriorSC;
	private CavidadeToracica cavidadeToracica;
	private CavidadeAbdominal cavidadeAbdominal;
	private SistemaNervoso sistemaNervoso;

	public Histopatologia() {
		super();
	}
	
	

	public Histopatologia(String descricao, ExteriorSC exteriorSC, CavidadeToracica cavidadeToracica,
			CavidadeAbdominal cavidadeAbdominal, SistemaNervoso sistemaNervoso) {
		super();
		this.descricao = descricao;
		this.exteriorSC = exteriorSC;
		this.cavidadeToracica = cavidadeToracica;
		this.cavidadeAbdominal = cavidadeAbdominal;
		this.sistemaNervoso = sistemaNervoso;
	}
	
	



	public ExteriorSC getExteriorSC() {
		return exteriorSC;
	}



	public void setExteriorSC(ExteriorSC exteriorSC) {
		this.exteriorSC = exteriorSC;
	}



	public CavidadeToracica getCavidadeToracica() {
		return cavidadeToracica;
	}



	public void setCavidadeToracica(CavidadeToracica cavidadeToracica) {
		this.cavidadeToracica = cavidadeToracica;
	}



	public CavidadeAbdominal getCavidadeAbdominal() {
		return cavidadeAbdominal;
	}



	public void setCavidadeAbdominal(CavidadeAbdominal cavidadeAbdominal) {
		this.cavidadeAbdominal = cavidadeAbdominal;
	}



	public SistemaNervoso getSistemaNervoso() {
		return sistemaNervoso;
	}



	public void setSistemaNervoso(SistemaNervoso sistemaNervoso) {
		this.sistemaNervoso = sistemaNervoso;
	}



	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	@Override
	public String toString() {
		return "Histopatologia [descricao=" + descricao + ", exteriorSC=" + exteriorSC + ", cavidadeToracica="
				+ cavidadeToracica + ", cavidadeAbdominal=" + cavidadeAbdominal + ", sistemaNervoso=" + sistemaNervoso
				+ "]";
	}
	
	

}
