/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote.code.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pacote.code.model.Especialidade;
import pacote.code.model.PlanoDeSaude;

/**
 *
 * @author 22282173
 */
public class PlanoDeSaudeDAO {

    private final static String URL = "C:\\Users\\22282173\\java\\PlanoDeSaude.txt";
    private final static String URL_TEMP = "C:\\Users\\22282173\\java\\PlanoDeSaudeTemp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private String dataFormatada;
    private DateTimeFormatter formatador;

    private static ArrayList<PlanoDeSaude> planodesaudes = new ArrayList<>();

    public static ArrayList<PlanoDeSaude> getPlanoDeSaudes() {
        return planodesaudes;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
        for (PlanoDeSaude p : planodesaudes) {
            if (codigo == p.getCodigo()) {
                return p;
            }
        }
        return null;

    }

    public static void excluirPlanoDeSaude(Integer codigo) {
//        BufferedWriter escritor

        for (PlanoDeSaude p : planodesaudes) {
            if (codigo == p.getCodigo()) {
                planodesaudes.remove(p);
                break;
            }
        }
            atualizarArquivo();
    }

    private static void atualizarArquivo() {
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);
        try {
            arquivoTemp.createNewFile();
            BufferedWriter escritorTemp = Files.newBufferedWriter(PATH_TEMP, StandardOpenOption.APPEND, StandardOpenOption.WRITE);
            for (PlanoDeSaude p : planodesaudes) {
                escritorTemp.write(p.getSeparadoPorVirgula());
                escritorTemp.newLine();
            }
            escritorTemp.close();
            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    public static void criarListaDePlanoDeSaude() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();
            while (linha != null) {
                String[] vetor = linha.split(";");
                PlanoDeSaude p = new PlanoDeSaude(Integer.valueOf(vetor[0]), vetor[1], vetor[2], vetor[3], vetor[4]);
                planodesaudes.add(p);
                linha = leitor.readLine();
            }
            leitor.close();

        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo");
        }

    }

    public static DefaultTableModel getPlanoDeSaudeModel() {
        String[] titulos = {"CÓDIGO", "OPERADORA", "CATEGORIA", "NÚMERO", "VALIDADE"};
        String[][] dados = new String[planodesaudes.size()][5];
        int i = 0;
        for (PlanoDeSaude p : planodesaudes) {
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getCategoria();
            dados[i][3] = p.getNumero();
            dados[i][4] = p.getDataFormatada();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
    }

    public static void atualizar(PlanoDeSaude planodesaudeAtualizado) {
        for (PlanoDeSaude lista : planodesaudes) {
            if (planodesaudeAtualizado.getCodigo().equals(lista.getCodigo())) {
                int posicao = planodesaudes.indexOf(lista);
                planodesaudes.set(posicao, planodesaudeAtualizado);

            }
        }
    }

    public static void gravar(PlanoDeSaude dados) {
        planodesaudes.add(dados);
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH, StandardOpenOption.APPEND, StandardOpenOption.WRITE);
            escritor.write(dados.getSeparadoPorVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }

    }
}
