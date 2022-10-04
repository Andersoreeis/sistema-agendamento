/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote.code.dao;

import java.util.ArrayList;
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
