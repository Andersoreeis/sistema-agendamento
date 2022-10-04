package pacote.code;

import java.time.LocalDate;
import java.time.LocalTime;
import pacote.code.dao.EspecialidadeDAO;

import pacote.code.model.Agenda;
import pacote.code.model.Endereco;
import pacote.code.model.Especialidade;
import pacote.code.model.Medico;
import pacote.code.model.Paciente;
import pacote.code.model.PlanoDeSaude;

public class AgendaApp {
	public static void main(String[] args) {

	
			
		Especialidade especialidade1 = new Especialidade();
		Especialidade especialidade2 = new Especialidade();
		Especialidade especialidade3 = new Especialidade();
		Especialidade especialidade4 = new Especialidade();
		Especialidade especialidade5 = new Especialidade();
                // Criando Objetos de Lista!
                
                // gravando 
                EspecialidadeDAO.gravar(especialidade1);
                EspecialidadeDAO.gravar(especialidade2);
                EspecialidadeDAO.gravar(especialidade3);
                EspecialidadeDAO.gravar(especialidade4);
                
               
                 Especialidade correto = new Especialidade("Teste", "Teste");
                 EspecialidadeDAO.atualizar(correto);
                 correto.setCodigo(especialidade4.getCodigo());

                
                 System.out.println( "Nova especialidade" + EspecialidadeDAO.getEspecialidade(especialidade4.getCodigo()).getNome());
                 
                 
                  EspecialidadeDAO.excluirEspecialidade(especialidade1.getCodigo());
                  System.out.println("Tamanho " + EspecialidadeDAO.getEspecialidades().size());
                   System.out.println(EspecialidadeDAO.getEspecialidade(2).getNome());

		PlanoDeSaude planodesaude1 = new PlanoDeSaude();
		PlanoDeSaude planodesaude2 = new PlanoDeSaude();
		Endereco edereco = new Endereco();
		Paciente paciente = new Paciente();
		Medico medico1 = new Medico();
		Medico medico2 = new Medico();
		Agenda agenda = new Agenda();

		Endereco endereco1 = new Endereco();
		endereco1.setBairro("Vale Do Sol");
		endereco1.setCep("06620010");
		endereco1.setCidade("Jandira");
		endereco1.setComplemento("Do lado da casa de show");
		endereco1.setLogradouro("Rua");
		endereco1.setNumero("291");

		Endereco endereco2 = new Endereco();
		endereco2.setBairro("Time Square");
		endereco2.setCep("0000000");
		endereco2.setCidade("Nova York");
		endereco2.setComplemento("Do Lado da Apple");
		endereco2.setLogradouro("Rua");
		endereco2.setNumero("000");

		especialidade1.setNome("Cardiologista");
		especialidade1.setDescricao("Médico realizador de diagnósticos e tratamentos de doenças do coração.");
		especialidade2.setNome("Otorrinolaringologia");
		especialidade2.setDescricao(
				"Médico especializado no diagnóstico e tratamento, clínico e cirúrgico, das doenças dos ouvidos, nariz, garganta, laringe e pescoço.");
		especialidade3.setNome("Gastroenterologia");
		especialidade3.setDescricao(
				" Médico Especializado em médica dedicada a prevenção, ao diagnóstico e ao tratamento clínico de várias doenças que afetam glândulas e órgãos do aparelho digestivo (esôfago, estômago, duodeno, intestino delgado, intestino grosso, fígado, pâncreas e vias biliares, reto).");
		especialidade4.setNome("Fisioterapia");
		especialidade4.setDescricao(
				"Medico especializado em tratamento e prevenção de doenças e lesões, decorrentes de fraturas ou má-formação ou vícios de postura. Tem como aliados, técnicas como massagens e exercícios que restaurem a capacidade física e funcionam do pacientes.");
		especialidade5.setNome("Clinica Geral");
		especialidade5.setDescricao(
				"Médico especializado responsável por diagnosticar doenças, desde as mais simples até as mais complexas. Caso verifique que a atual situação do paciente precisa da interferência de um especialista, ele realiza o encaminhamento necessário.");

		Especialidade[] especialidades1 = { especialidade1, especialidade5 };
		medico1.setEspecialidade(especialidades1);
		medico1.setNome("Creiton");
		medico1.setEmail("medico1@gmail.com");
		medico1.setCrm("000");
		medico1.setTelefone("11929292");

		Especialidade[] especialidades2 = { especialidade1, especialidade4, especialidade5 };
		medico2.setEspecialidade(especialidades2);
		medico2.setNome("José");
		medico2.setEmail("medico2@gmail.com");
		medico2.setCrm("001");
		medico2.setTelefone("11949493");

		planodesaude1.setOperadora("Porto Seguro");
		planodesaude1.setCategoria("Diamante");
		planodesaude1.setNumero("2874956871");
		planodesaude1.setValidade(LocalDate.of(2030, 05, 23));

		planodesaude2.setOperadora("Bradesco Saúde");
		planodesaude2.setCategoria("Top Nplus");
		planodesaude2.setNumero("2874956871");
		planodesaude2.setValidade(LocalDate.of(2030, 05, 23));
		
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Andressa");
		paciente1.setCpf("50.40.630.23.91");
		paciente1.setTelefone("1146186168");
		paciente1.setRg("50406302391");
		paciente1.setDataDeNascimento(LocalDate.of(2000,03,30));
		paciente1.setPlanoDeSaude(planodesaude1);
		paciente1.setEndereço(endereco1);
		
		Paciente paciente2 = new Paciente();
		paciente2.setNome("Anderson");
		paciente2.setCpf("526.274.638.10");
		paciente2.setTelefone("11976164379");
		paciente2.setRg("558849362");
		paciente2.setDataDeNascimento(LocalDate.of(2005,05,23));
		paciente2.setPlanoDeSaude(planodesaude2);
		paciente2.setEndereço(endereco2);

		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente1);
		agenda1.setEspecialidade(especialidade1);
		agenda1.setMedico(medico1);
		agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 20));
		agenda1.setHoraDaConsulta(LocalTime.of(16, 39));
		
		System.out.println("---------AGENDAMENTOS-----------");
		System.out.println("Paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
		System.out.println("Data: " + agenda1.getDataDaConsulta());
		System.out.println("Hora: " + agenda1.getHoraDaConsulta());
		System.out.println(" Nome do Médico: " + agenda1.getMedico().getNome());
		
		
//		System.out.println("---LISTA DE PACIENTE---");
//		System.out.println("Nome " + paciente1.getNome());
//		System.out.println("RG " + paciente1.getRg());
//		System.out.println("CPF " + paciente1.getCpf());
//		System.out.println("Data de Nascimento " + paciente1.getDataDeNascimento());
//		System.out.println("Plano De Saúde " + paciente1.getPlanoDeSaude().getCategoria());
//		System.out.println("Cidade " + paciente1.getEndereço().getCidade());
//		
//		
//		System.out.println("---LISTA DE PACIENTE---");
//		System.out.println("Nome " + paciente2.getNome());
//		System.out.println("RG " + paciente2.getRg());
//		System.out.println("CPF " + paciente2.getCpf());
//		System.out.println("Data de Nascimento " + paciente2.getDataDeNascimento());
//		System.out.println("Plano De Saúde " + paciente2.getPlanoDeSaude().getCategoria());
//		System.out.println("Cidade " + paciente2.getEndereço().getCidade());
		
//		int i = 0;
//		while (i < medico1.getEspecialidade().length) {
//			System.out.println("--------------MÉDICO1----------");
//			System.out.println("Especialidade " + medico1.getEspecialidade()[i].getNome());
//			System.out.println(medico1.getEspecialidade()[i].getDescricao());
//
//			i++;
//		}
//		int b = 0;
//
//		while (b < medico2.getEspecialidade().length) {
//			System.out.println("--------------MÉDICO2----------");
//			System.out.println("Especialidade " + medico2.getEspecialidade()[b].getNome());
//			System.out.println(medico2.getEspecialidade()[i].getDescricao());
//			System.out.println(medico2.getEmail());
//			b++;
//		}
	
		
				
	

	}
}
