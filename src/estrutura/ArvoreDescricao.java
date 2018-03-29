package estrutura;

public class ArvoreDescricao extends ArvoreNo {

	public ArvoreDescricao(String descricao) {
		super(descricao);
	}

	@Override
	public boolean isFolha() {
		return false;
	}

	@Override
	public String getPergunta() {
		return String.format("É um(a) %s ?", this.getDescricao());
	}

}
