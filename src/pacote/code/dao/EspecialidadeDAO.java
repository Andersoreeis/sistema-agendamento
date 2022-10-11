/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote.code.dao;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import pacote.code.model.Especialidade;

/**
 *
 * @author 22282173
 */
public class EspecialidadeDAO {

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
        Especialidade e1 = new Especialidade("Cardiologia", "Cuida do coração.");
        Especialidade e2 = new Especialidade("Demartologista", "Cuida da pele.");
        Especialidade e3 = new Especialidade("Gastrologista", "Cuida da barriga.");
        Especialidade e4 = new Especialidade("Pediatria", "Cuida das Crianças");
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
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
            if (especialidadeAtualizada.getCodigo() == lista.getCodigo()) {

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
    }

}
