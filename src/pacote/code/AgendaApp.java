package pacote.code;



import pacote.code.model.Especialidade;
imoirt pacote.code.model.PlanoDeSaude

public class AgendaApp {
	public static void main(String[] args) {
		Especialidade especialidade1 = new Especialidade();
		especialidade1.setNome("Cardiologista");
		especialidade1.setDescricao("Cardiologia é a especialidade médica que realiza o diagnóstico e trata das doenças do coração.");
		
		
		
		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Odontologia");
		especialidade2.setDescricao("Odontologia atua na prevenção, diagnóstico e tratamento de problemas relacionados \n aos dentes, boca, língua, gengiva e ossos da face");
		
		
		
		Especialidade especialidade3 = new Especialidade();
		especialidade3.setNome("Otorrinolarigologia");
		especialidade3.setDescricao("torrinolaringologista é o médico especializado no diagnóstico e \n tratamento, clínico e cirúrgico, das doenças dos ouvidos, nariz, garganta, laringe e pescoço");
	}

}
