package patologia; 

public class Orgao {
	private String descricao;

public Orgao(String descricao) {
	super ();
	this.descricao = descricao;
}

public Orgao() {
	super();
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
	
@Override
public String toString() {
	return "Orgao [descricao=" + descricao + "]"
}
}
}
}
