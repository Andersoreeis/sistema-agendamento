package pacote.code.model;

import javax.swing.JOptionPane;

public class Especialidade {
    private static int contador = 100;
    private Integer codigo;
    private String nome;
    private String descricao;
    // Construtores da classe

    public Especialidade(String nome) {
        this.nome = nome;
        this.contador++;
        this.codigo = contador;
    }

    public Especialidade(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.contador++;
        this.codigo = contador;
    }

    public Especialidade() {
        this.contador++;
        this.codigo = contador;

    }

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

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }
    
    

    public String getDescricao() {
        return descricao;
    }

    public  int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }
    
    

}
