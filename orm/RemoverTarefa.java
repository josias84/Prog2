package orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoverTarefa {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Tarefa tarefa_encontrada = manager.find(Tarefa.class, 2L);
		
		manager.getTransaction() .begin();
		manager.remove(tarefa_encontrada);
		manager.getTransaction() .commit();
		
		System.out.println("Tarefa removida da agenda");
		
		manager.close();
		factory.close();
		
	}

}
