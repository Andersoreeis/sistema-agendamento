package pacote.code.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Medico {

    private static int contador = 100;
    private Integer codigo;
    private Especialidade[] especialidades;
    private LocalDate dataDeNascimento;
    private DateTimeFormatter formatador;
    private String dataFormatada;
    private String nome;
    private String email;
    private String telefone;
    private String crm;

    public Medico() {

    }

    public Medico(Integer codigo, String crm, String nome, String telefone) {
        this.codigo = codigo;
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.contador = codigo;

    }

    public Medico(Integer codigo, String nome, String crm, String email, String telefone, LocalDate dataDeNascimento, Especialidade[] especialidades) {
        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataFormatada = dataDeNascimento.format(formatador);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Especialidade[] getEspecialidade() {
        return especialidades;
    }

    public void setEspecialidade(Especialidade[] especialidade) {
        this.especialidades = especialidade;
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

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
     public void setDataFormatada(String dataFormatada) {
        this.dataFormatada = dataFormatada;
    }

    public void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    int i = 0;

    public String getPegarListaDeEspecialidades() {
        

        while (i < especialidades.length) {
            Especialidade especialidade = new Especialidade();
            return especialidade.toString();
        }
        return null;
        

    }

    public String getSeparadorComPontoEVirgula() {
        return this.codigo + ";" + this.nome + ";" + this.email + ";" + this.telefone + ";" + this.telefone + ";" + this.dataFormatada + ";" + getPegarListaDeEspecialidades();
    }
}
