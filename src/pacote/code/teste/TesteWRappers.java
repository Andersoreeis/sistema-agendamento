package pacote.code.teste;

import java.util.ArrayList;

import pacote.code.model.Especialidade;

public class TesteWRappers {
	public static void main(String[] args) {

		ArrayList<Especialidade> eArray = new ArrayList<>();
		Especialidade e1 = new Especialidade("Cardiologista","Cuida do coração");
//		e1.setNome("Cardiologia");
//		e1.setDescricao("Cuida do coração");
		eArray.add(e1);
		Especialidade e2 = new Especialidade();
		e2.setNome("Gastroenterologia");
		e2.setDescricao("Cuida do fígado");
		eArray.add(e2);
		Especialidade e3 = new Especialidade();
		e3.setNome("Fisioterapia");
		e3.setDescricao("Cuida do corpo");
		eArray.add(e3);
		Especialidade e4 = new Especialidade();
		e4.setNome("Clinico Geral");
		e4.setDescricao("Cuida de Tudo");
		eArray.add(e4);
		Especialidade e5 = new Especialidade();
		e5.setNome("Pediatrico");
		e5.setDescricao("Cuida das crianças");
		eArray.add(e5);
		
		System.out.println(eArray.size());
		
		
		Integer a = 1;
		Integer b = 2;
		Integer c = 3;
		ArrayList<Integer> arrayInteger = new ArrayList<>();
		arrayInteger.add(a);
		arrayInteger.add(b);
		arrayInteger.add(c);
		System.out.println(arrayInteger.size());
		arrayInteger.add(30);
		System.out.println(arrayInteger.size());
	
		eArray.get(1).setNome("Teste");
		
		System.out.println(eArray.get(1).getNome());
		Especialidade nova = eArray.get(1);
		nova.setNome("Não é mais teste");
		System.out.println(nova.getNome());
		
		Especialidade xy = new Especialidade();
		System.out.println(xy.getNome());
	
	
		
	}
}
