package pacote.code.model;

import java.time.LocalDate;

public class PlanoDeSaude {

    private static String operadora;
    private String categoria;
    private String numero;
    private LocalDate validade;
    private static int quantidade;

    public PlanoDeSaude(String operadora) {
        this.operadora = operadora;
        this.quantidade++;
    }

    public PlanoDeSaude() {
        this.quantidade++;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public static int getQuantidade() {
        return quantidade;
    }

}
