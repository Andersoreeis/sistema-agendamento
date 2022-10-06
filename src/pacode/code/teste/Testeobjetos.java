package pacode.code.teste;

import java.util.ArrayList;
import pacote.code.dao.EspecialidadeDAO;

import pacote.code.model.Especialidade;
import pacote.code.model.PlanoDeSaude;

public class Testeobjetos {
    // vetores de vetores

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                
                
        int a[][] = {
                {1,2,3},
                {4,5,6},
                {6,7,8}
        };
            System.out.println(a[1][1]);
		
		// Criação de Objetos
		Especialidade e1 = new Especialidade("Cardiologista", "Cuida do coração");
		Especialidade e2 = new Especialidade("Gastroenterologia", "Cuida do Fígado");
		Especialidade e3 = new Especialidade();
		e3.setNome("Qualquer Nome");
                              

		// Criação do ArrayList
		ArrayList<Especialidade> especialidades = new ArrayList<>();
		especialidades.add(e1);
		especialidades.add(e2);
		especialidades.add(e3);

		// Criação do For
		for (Integer i = 0; i < especialidades.size(); i++) {
			System.out.println(especialidades.get(i).getNome());
		}
		
		for(Especialidade e : especialidades) {
			System.out.println(e.getNome());
		}
		// Criar 3 planos de saúde, armazenar em um ArrayList e exibir o nome da operadora de cada um deles
		PlanoDeSaude p1 =  new PlanoDeSaude("Brandesco Saúde");
		PlanoDeSaude p2 =  new PlanoDeSaude("Porto Seguro");
		PlanoDeSaude p3 =  new PlanoDeSaude("Sompoio Seguros");
		ArrayList<PlanoDeSaude> planodesaudes = new ArrayList<>();
		planodesaudes.add(p1);	
		planodesaudes.add(p2);
		planodesaudes.add(p3);


		
		for(PlanoDeSaude p : planodesaudes) {
		
			System.out.println(p.getOperadora());
			
		}
		AgendaApp.main(args);
		System.out.println("Total de plano de Saúdes: " + PlanoDeSaude.getQuantidade());
                  System.out.println("Total de Especialidades: " + e1.getContador());
                  
                
                  System.out.println(e1.getCodigo() + " - " + e1.getNome());
                  System.out.println(e2.getCodigo() + " - " + e2.getNome());
                  System.out.println(e3.getCodigo() + " - " + e3.getNome());
                  


	}
}
