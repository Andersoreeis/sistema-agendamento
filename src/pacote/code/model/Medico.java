package pacote.code.model;

import java.util.ArrayList;

public class Medico {
        private static int contador = 100;
        private Integer codigo;
	private String nome;
	private Especialidade[] especialidade;
	private String email;
	private String telefone;
	private String crm;
        
          public Medico(String nome){
            this.nome = nome;
        }
        public Medico(String nome, String Descricao){
            
        }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Especialidade[] getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade[] especialidade) {
		this.especialidade = especialidade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

    public Integer getCodigo() {
        return codigo;
    }

    public static int getContador() {
        return contador;
    }
  
public  void gerarCodigo(){
    this.contador++;
    this.codigo = contador;
} 

}
