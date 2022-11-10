/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote.code.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pacote.code.model.Especialidade;

/**
 *
 * @author 22282173
 */
public class EspecialidadeDAO {

    private final static String URL = "C:\\Users\\22282173\\java\\Especialidade.txt";
    private final static Path PATH = Paths.get(URL);

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (codigo == e.getCodigo()) {
                return e;
            }

        }
        return null;
    }

    public static void excluirEspecialidade(Integer codigo) {
        for (Especialidade i : especialidades) {
            if (codigo == i.getCodigo()) {
                especialidades.remove(i);
                break;
            }

        }

    }

    // criar uma lista inicial de especialidades
    public static void criarListaDeEspecialidades() {
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();
            while (linha != null) {
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(vetor[1], vetor[2], Integer.valueOf(vetor[0]));
                especialidades.add(e);
                linha = leitor.readLine();

            }
            leitor.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo");
        }

    }

    public static DefaultTableModel getEspecialidadesModel() {

        String[] titulos = {"CODIGO", "ESPECIALIDADE", "DESCRIÇÃO"};
        String[][] dados = new String[especialidades.size()][3];

        int i = 0;

        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
    }

    public static void atualizar(Especialidade especialidadeAtualizada) {
        for (Especialidade lista : especialidades) {
            if (especialidadeAtualizada.getCodigo().equals(lista.getCodigo())) {

//                lista.setCodigo(especialidadeAtualizada.getCodigo());
//                lista.setDescricao(especialidadeAtualizada.getDescricao());
//                lista.setNome(especialidadeAtualizada.getNome()); 
                int posicao = especialidades.indexOf(lista);

                especialidades.set(posicao, especialidadeAtualizada);

            }
        }
    }

    public static void gravar(Especialidade dados) {
        especialidades.add(dados);
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH, StandardOpenOption.APPEND, StandardOpenOption.WRITE);
            escritor.write(dados.getSeparaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }

        // gravar em arquivos
    }

}
