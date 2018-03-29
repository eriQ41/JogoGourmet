package estrutura;

public abstract class ArvoreNo {
	private ArvoreNo noEsq;
	private ArvoreNo noDir;
	private String descricao;
	
	public abstract String getPergunta();
	public abstract boolean isFolha();
	
	public ArvoreNo(String descricao) {
		this.descricao = descricao;
	}
	
	public ArvoreNo getNoEsq() {
		return noEsq;
	}
	
	public void setNoEsq(ArvoreNo noEsq) {
		this.noEsq = noEsq;
	}
	
	public ArvoreNo getNoDir() {
		return noDir;
	}
	public void setNoDir(ArvoreNo noDir) {
		this.noDir = noDir;
	}

	public String getDescricao() {
		return descricao;
	}

}
