package pacote.code.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Medico {

    private static int contador = 100;
    private Integer codigo;
    private ArrayList<Especialidade> especialidades;
    private LocalDate dataDeNascimento;
    private DateTimeFormatter formatador;
    private String dataFormatada;
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    private String data;

    public Medico() {
        gerarCodigo();
    }

    public Medico(Integer codigo, String crm, String nome, String telefone, String data) {
        this.codigo = codigo;
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.contador = codigo;
        this.data = data;

    }

    public Medico(Integer codigo, String nome, String crm, String email, String telefone, String dataDeNascimentoString, ArrayList<Especialidade> especialidades) {
        formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        dataFormatada = dataDeNascimento.format(formatador);
        this.codigo = codigo;
        this.crm = crm;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.dataFormatada = dataDeNascimentoString;
        this.especialidades = especialidades;
        gerarCodigo();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Especialidade> getEspecialidade() {
        return especialidades;
    }

    public void setEspecialidade(ArrayList<Especialidade> especialidade) {
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

    public String listaDeCodigos(ArrayList<Especialidade> array) {
        ArrayList<String> Rodarcodigo = new  ArrayList<String>();
        for(Especialidade e : array)
            Rodarcodigo.add(e.getCodigo().toString());
        
        
        return String.join( ";", Rodarcodigo);
    }

    public String getSeparadorComPontoEVirgula() {
        return this.codigo + ";" 
                + this.nome+ ";" 
                + this.email + ";" 
                + this.telefone + ";" 
                + this.telefone + ";" 
                + this.dataFormatada + ";" 
                + listaDeCodigos(especialidades);
    }
}
