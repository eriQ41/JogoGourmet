package views;

import javax.swing.JOptionPane;

public class Janelas {	
	public boolean pergunta(String pergunta) {
		 int opcao = JOptionPane.showConfirmDialog(
				 null, 
				 pergunta, 
				 "Descricao da comida", 
				 JOptionPane.YES_NO_OPTION
			);
		 return opcao == JOptionPane.YES_OPTION;				
	}
	
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
	}

	public String perguntaNovaDescricao(String novaComida, String antigaComida) {
		return JOptionPane.showInputDialog(
				null,
				String.format("%s é ____ mas %s não.",novaComida,antigaComida),
				"Pergunta",
				JOptionPane.QUESTION_MESSAGE
			);	
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
