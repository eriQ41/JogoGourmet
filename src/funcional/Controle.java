package funcional;

import estrutura.ArvoreNo;
import views.Janelas;
import estrutura.ArvoreDescricao;
import estrutura.ArvoreFolha;

public class Controle {
	private ArvoreNo raiz;
	private Janelas janela = new Janelas();
	private boolean continua = true;
	
	public Controle() {
		//parametrizacao inicial
		raiz = new ArvoreDescricao("Massa");
		raiz.setNoDir(new ArvoreFolha("Bolo"));
		raiz.setNoEsq(new ArvoreFolha("Lasanha"));
	}
	
	public void iniciar() {
		//desenv do jogo				
		ArvoreNo noAtual = raiz;
		while (continua) {				
			if(isInicioDeJogo(noAtual)) {
				janela.inicio();
			}
			boolean respostaDescricao = janela.pergunta(noAtual.getPergunta());
			noAtual = this.proximaPergunta(noAtual, respostaDescricao);
		}
	}
	
	private boolean isInicioDeJogo(ArvoreNo noAtual) {
		return noAtual == raiz;
	}

	private ArvoreNo proximaPergunta(ArvoreNo noAtual, boolean respostaDescricao) {
		ArvoreNo noProximo;
		if(respostaDescricao) {
			noProximo = noAtual.getNoEsq();				
		} else {
			noProximo = noAtual.getNoDir();
		}

		if(noProximo.isFolha()) {
			boolean respostaComida = janela.pergunta(noProximo.getPergunta());
			if(respostaComida) {
				janela.respostaCorreta();
				continua = janela.desejaContinuar();
			}else {
				String novaComida = janela.perguntaNovaComida();
				String novaDescricao = janela.perguntaNovaDescricao(novaComida, noProximo.getDescricao());
				ArvoreDescricao novoNoDescricao = new ArvoreDescricao(novaDescricao);
				novoNoDescricao.setNoEsq(new ArvoreFolha(novaComida));
				novoNoDescricao.setNoDir(noProximo);
				if(respostaDescricao) {
					noAtual.setNoEsq(novoNoDescricao);
				}else {
					noAtual.setNoDir(novoNoDescricao);
				}
			}		
			return raiz;
		} else {
			return noProximo;
		}
		
		
	}
}
