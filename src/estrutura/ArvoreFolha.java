package estrutura;

public class ArvoreFolha extends ArvoreNo{
	
	public ArvoreFolha(String descricao) {
		super(descricao);
	}

	@Override
	public boolean isFolha() {
		return true;
	}

	@Override
	public String getPergunta() {
		return String.format("� um(a) %s ?", this.getDescricao());
	}
	
}
