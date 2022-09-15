package pacote.code.model;

import javax.swing.JOptionPane;

public class Especialidade {

	private String nome;
	private String descricao;

	// Métodos de acesso aos atributos

	public void setNome(String nome) {
		if (nome.length() >= 3) {
			this.nome = nome;
		} else {
			JOptionPane.showMessageDialog(null, nome + " Não é um nome válido \n deve conter pelo menos 3 letras");
		}

	}
	

	public String getNome() {
		return nome;
	}
	

	public void setDescricao(String descricao) {
		if (descricao.length() >= 10) {
			this.descricao = descricao;
		} else {
			JOptionPane.showMessageDialog(null, descricao + "Descrição não contem caracteres necessários");
		}
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	
	
}