package pacote.code.model;

import java.time.LocalDate;

public class PlanoDeSaude {

    private static String operadora;
    private String categoria;
    private String numero;
    private LocalDate validade;
    private static int contador = 100;
    public Integer codigo;

    public PlanoDeSaude(String operadora) {
        this.operadora = operadora;
        this.contador++;
    }
       public PlanoDeSaude(String operadora, String categoria, String numero, LocalDate validade) {
        this.categoria = categoria;
        this.operadora = operadora;
        this.numero = numero;
        this.validade = validade;
        this.contador++;
    }

    public PlanoDeSaude() {
        this.contador++;
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

    public static void setCodigo(int contador) {
        PlanoDeSaude.contador = contador;
    }
   public  int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }
    public void gerarCodigo(){
        this.contador++;
        this.codigo = contador;
           
    }

}
