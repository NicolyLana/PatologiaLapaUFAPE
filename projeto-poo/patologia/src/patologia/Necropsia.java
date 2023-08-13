package patologia;

import java.util.Date;

public class Necropsia {
	private String dataHoraNecropsia;
	enum estadoConservacao;
	private String tipoMorte;
	
	public Necropsia(Date dataHoraNecropsia, estadoConservacao, String tipoMorte,)
	{
		super();
		this.dataHoraNecropsia = dataHoraNecropsia;
		this.estadoConservacao = estadoConservacao;
		this.tipoMorte = tipoMorte;
	}
	
	public Necropsia() {
		super();
	}
	
	public Date getDataHoraNecropsia() {
		return dataHoraNecropsia;
	}
	
	public void setDataHoraNecropsia(Date dataHoraNecrospia) {
		this.dataHoraNecropsia = dataHoraNecropsia;
	}
	
	public estadoConservacao getEstadoConservacao() {
		return estadoConservacao;
	}
	
	public void setEstadoConservacao(EstadoConservacao estadoConservacao) {
		this.estadoConservacao = estadoConservacao;
	}
	
	public String getTipoMorte() {
		return tipoMorte;
	}
	
	public void setTipoMorte()String tipoMorte) {
		this.tipoMorte = tipoMOrte;
	}
			
	@override
	
	public String toString() {
		return "Necropsia [dataHoraNecropsia=" + dataHoraNecropsia + ", estadoConservacao=" + estadoConservacao + ", tipoMorte=" + tipoMorte + ", "]";"
	}
	}