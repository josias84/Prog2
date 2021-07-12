package orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdicinaTarefa {
	public static void main (String[] args) {
		Tarefa tarefa = new Tarefa ();
		//tarefa.setDescricao("Fazer Trabalho Programação II");
		//tarefa.setDescricao("Estudar Angular");
		//tarefa.setDescricao("Terminar de assistir Mandalorian 2");
		//tarefa.setDescricao("Assistir Viúva Negra");
		//tarefa.setDescricao("Viajar");
		tarefa.setDescricao("Passear");

		tarefa.setFinalidade(false);

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction() .begin();
		manager.persist(tarefa);
		manager.getTransaction() .commit();
		
		System.out.println("Id da tarefa: "+tarefa.getId());
		System.out.println("Conteudo da tarefa: "+tarefa.getDescricao());
		System.out.println("Tarefa finalizada: "+tarefa.isFinalidade());
		
		manager.clear();
		factory.close();
	
	
	}

}
