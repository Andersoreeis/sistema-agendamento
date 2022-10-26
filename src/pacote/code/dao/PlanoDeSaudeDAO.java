/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote.code.dao;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import pacote.code.model.PlanoDeSaude;

/**
 *
 * @author 22282173
 */
public class PlanoDeSaudeDAO {

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
        for (PlanoDeSaude p : planodesaudes) {
            if (codigo == p.getCodigo()) {
                planodesaudes.remove(p);
                break;
            }
        }
    }

    public static void criarListaDePlanoDeSaude() {
        PlanoDeSaude p1 = new PlanoDeSaude("Bradesco Saúde", "Premiun", "291", LocalDate.of(2024, Month.MARCH, 23));
        PlanoDeSaude p2 = new PlanoDeSaude("Porto Seguro", "Bronze", "333", LocalDate.of(2025, Month.FEBRUARY, 18));
        planodesaudes.add(p1);
        planodesaudes.add(p2);

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
    }
}
