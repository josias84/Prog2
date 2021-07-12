package orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AtualizarTarefa {
	public static void main(String[] args) {
		Tarefa tarefa = new Tarefa();
		tarefa.setId(3L);
		tarefa.setDescricao("Estudar muito mais Angular");
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction() .begin();
		manager.merge(tarefa);
		manager.getTransaction() .commit();
		
		System.out.println("Tarefa atualiada");
		
		manager.close();
		factory.close();
	
	
	}

}
