/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacote.code.dao;

import java.util.ArrayList;
import pacote.code.model.Medico;

/**
 *
 * @author 22282173
 */
public class MedicoDAO {
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
      
    
}
