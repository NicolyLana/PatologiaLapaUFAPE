package patologia;

public class ParteNecropsia {
	private String avaliacao;

public ParteNecropsia(String avaliacao) {
	super();
	this.avaliacao = avaliacao;
}

public ParteNecropsia() {
	super();
}

public String getAvaliacao() {
	return avaliacao;
}

public void setAvaliacao(String avaliacao) {
	this.avaliacao = avaliacao;
}
@Override
public String toString() {
	return "ParteNecropsia [avaliacao=" + avaliacao + "]";
	
}
}
