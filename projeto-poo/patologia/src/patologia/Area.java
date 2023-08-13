package patologia;

public class Area {
	private String descricao;
	
public Area(String descricao) {
	super();
	this.descricao = descricao;
	
public Area() {
	super();
}

public String getDescricao() {
	return descricao;
}

public void setAvaliacao(String avaliacao) {
	this.avaliacao = avaliacao;
}

@Override
public String toString() {
	return "Area [avaliacao=" + avaliacao + "]";
	
}
}
}
