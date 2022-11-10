package pacote.code.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PlanoDeSaude {

    private String operadora;
    private String categoria;
    private String numero;
    private LocalDate validade;
    private String data ;
    private static int contador = 100;
    public Integer codigo;
    private DateTimeFormatter formatador;
    private String dataFormatada;

    public PlanoDeSaude(String operadora) {
        this.operadora = operadora;
        gerarCodigo();
    }

    public PlanoDeSaude(Integer codigo, String operadora, String categoria, String numero, String data) {
        this.codigo = codigo;
        this.categoria = categoria;
        this.operadora = operadora;
        this.numero = numero;
        this.data = data;
        this.contador = codigo;
    }

    public PlanoDeSaude(String operadora, String categoria, String numero, LocalDate validade) {
        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataFormatada = validade.format(formatador);
        this.codigo = codigo;
        this.categoria = categoria;
        this.operadora = operadora;
        this.numero = numero;
        this.validade = validade;
        gerarCodigo();
    }

    public PlanoDeSaude() {
        gerarCodigo();
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

    public int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void gerarCodigo() {
        this.contador++;
        this.codigo = contador;

    }

    public String getDataFormatada() {
        return dataFormatada;
    }

    public DateTimeFormatter getFormatador() {
        return formatador;
    }

    public void setDataFormatada(String dataFormatada) {
        this.dataFormatada = dataFormatada;
    }

    public String getSeparadoPorVirgula() {
        return this.codigo + ";" + this.operadora + ";" + this.categoria + ";" + this.numero + ";" + this.dataFormatada;
    }

}
