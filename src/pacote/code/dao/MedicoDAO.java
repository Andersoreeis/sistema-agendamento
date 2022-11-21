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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pacote.code.model.Especialidade;
import pacote.code.model.Medico;

/**
 *
 * @author 22282173
 */
public class MedicoDAO {
  
       
    private final static String URL = "C:\\Users\\22282173\\java\\Medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282173\\java\\MedicoTemp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);
     private static ArrayList<Medico> medicos = new ArrayList<>();
     
      public static ArrayList<Medico> getMedicos() {
        return medicos;
    }
   public static Medico getMedico(Integer codigo) {
        for (Medico m : medicos) {
            if (codigo.equals(m.getCodigo())) {
                return m;
            }

        }
        return null;
    }
      
    public static void excluirMedico(Integer codigo) {
        for (Medico m : medicos) {
            if (codigo.equals(m.getCodigo())) {
                medicos.remove(m);
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
            for (Medico m : medicos) {
                escritorTemp.write(m.getSeparadorComPontoEVirgula());
                escritorTemp.newLine();
            }
            escritorTemp.close();
            
            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);
            
        } catch (Exception error) {
            error.printStackTrace();
        }
    }
       
       
        
  
       
         public static void criarListaDeMedicos() {
            
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();
            while (linha != null) {
                String[] vetor = linha.split(";");
                Medico m = new Medico(Integer.valueOf(vetor[0]), vetor[1], vetor[2], vetor[3], vetor[4]);
                medicos.add(m);
                linha = leitor.readLine();
            }
            leitor.close();
        } catch (Exception error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo");
        }

    }
         
            public static DefaultTableModel getMedicosModel() {

        String[] titulos = {"CODIGO", "CRM", "NOME", "TELEFONE"};
        String[][] dados = new String[medicos.size()][4];

        int i = 0;

        for (Medico m : medicos) {
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
    }
            
            public static void atualizar(Medico medicoAtualizado) {
        for (Medico lista : medicos) {
            if (medicoAtualizado.getCodigo().equals(lista.getCodigo())) {

                int posicao = medicos.indexOf(lista);

                medicos.set(posicao, medicoAtualizado);

            }
        }
    }
            
                public static void gravar(Medico dados) {
        medicos.add(dados);
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH, StandardOpenOption.APPEND, StandardOpenOption.WRITE);
            escritor.write(dados.getSeparadorComPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }

        // gravar em arquivos
    }
}
