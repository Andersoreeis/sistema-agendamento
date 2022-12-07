package pacote.code.dao;

import pacote.code.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private final static String URL = "C:\\Users\\22282173\\java\\Especialidade.txt";
    private final static String URL_TEMP = "C:\\Users\\22282173\\java\\Especialidade_temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    private static ArrayList<String> especialidadesNomes = new ArrayList<>();

    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }
        return null;
    }

    public static void excluirEspecialidade(Integer codigo) {

        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
            }
        }
        
        atualizarArquivo();

    }

    private static void atualizarArquivo() {
        //PASSO 01 - Criar uma rpresentação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            //Criar arquivo temporário
            arquivoTemp.createNewFile();

            //Abrir o arquivo temporário para escrita
            BufferedWriter assisTemp = Files.newBufferedWriter(PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            for(Especialidade e : especialidades){
                assisTemp.write(e.getSeparaPorPontoEVirgula());
                assisTemp.newLine();
            }

            assisTemp.close();
            
            arquivoAtual.delete();
            
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception error) {
            error.getStackTrace();
        }
    }

    //Criar uma lista inicial de especialidades
    public static void criarListaDeEspecialidades() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {

                //Transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(vetor[1], vetor[2],
                        Integer.valueOf(vetor[0]));

                //Guardar a especialidade em uma lista
                especialidades.add(e);

                //Ler a próxima linha
                linha = leitor.readLine();
            }

            leitor.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro ao ler o arquivo");
        }

    }
    
    public static DefaultListModel<Especialidade> getEspModel(){
        DefaultListModel<Especialidade> especialidadesLista = new DefaultListModel<Especialidade>();
        for(Especialidade percorrer : getEspecialidades()){
            especialidadesLista.addElement(percorrer);
            especialidadesLista.toString();
        }
        return especialidadesLista;
        
        
    }

    public static DefaultTableModel getEspecialidadesModel() {

        String[] titulos = {"CÓDIGO", "ESPECIALIDADE", "DESCRIÇÃO"};
        String[][] dados = new String[especialidades.size()][3];

        int i = 0;
        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }

        DefaultTableModel modelo = new DefaultTableModel(dados, titulos);
        return modelo;

    }

    public static void atualizar(Especialidade corrigida) {
        for (Especialidade i : especialidades) {
            if (corrigida.getCodigo().equals(i.getCodigo())) {
                especialidades.set(especialidades.indexOf(i),
                        corrigida);
                break;
            }
        }
        
        atualizarArquivo();
    }

    public static void gravar(Especialidade e) {
        especialidades.add(e);

        //GRAVAR ARQUIVO
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(e.getSeparaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException err) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
    }

}
