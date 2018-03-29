package views;

import javax.swing.JOptionPane;

public class Janelas {	
	//pergunta a descrição
	public boolean pergunta(String pergunta) {
		 int opcao = JOptionPane.showConfirmDialog(
				 null, 
				 pergunta, 
				 "Descricao da comida", 
				 JOptionPane.YES_NO_OPTION
			);
		 return opcao == JOptionPane.YES_OPTION;				
	}
	//acertou!
	public void respostaCorreta() {
		JOptionPane.showMessageDialog(
			null, 
			"Acertei de novo!", 
			"Sucesso!", 
			JOptionPane.INFORMATION_MESSAGE
			);
		}
		
	public String perguntaNovaComida() {
		return JOptionPane.showInputDialog(
				null,
				"Em qual comida você pensou?",
				"Pergunta",
				JOptionPane.QUESTION_MESSAGE
			);
//		
//		if (novaEntidade == null)
//			return null;
//
//		String novaCaracteristica = JOptionPane.showInputDialog(
//				null,
//				String.format(
//						"Complete a sentença: %s é um(a) ____  e %s não.", 
//						novaEntidade.toLowerCase(),
//						no.getDescricao().toLowerCase()
//						),
//				"Complete a sentença",
//				JOptionPane.QUESTION_MESSAGE
//			);
//		if (novaCaracteristica == null)
//			return null;
//
//		ArvoreNo noCaracteristica = new ArvoreDescricao(novaCaracteristica); //new NoCaracteristica(novaCaracteristica);
//		noCaracteristica.setNoEsq(new ArvoreFolha(novaEntidade)); //new NoEntidade(novaEntidade));
//
//		return noCaracteristica;
	}

	public String perguntaNovaDescricao(String novaComida, String antigaComida) {
		return JOptionPane.showInputDialog(
				null,
				String.format("%s é ____ mas %s não.",novaComida,antigaComida),
				"Pergunta",
				JOptionPane.QUESTION_MESSAGE
			);
//		
	}

	public void inicio() {
		JOptionPane.showMessageDialog(
				null, 
				"Pense em um prato que gosta.", 
				"Jogo Gourmet", 
				JOptionPane.INFORMATION_MESSAGE
			);
	}
	
	public boolean desejaContinuar() {
		int continuar = JOptionPane.showConfirmDialog(
				null, 
				"Deseja jogar outra vez?", 
				"Jogo Gourmet", 
				JOptionPane.YES_NO_OPTION
			);							
		if (continuar == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(
					null, 
					"Jogo concluído.", 
					"Obrigado!", 
					JOptionPane.INFORMATION_MESSAGE
				);			
			return false;
		}		
		return true;				
	}
}
