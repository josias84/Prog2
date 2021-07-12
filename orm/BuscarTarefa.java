package orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BuscarTarefa {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Tarefa tarefa_encontrada = manager.find(Tarefa.class, 1L);
		System.out.println(tarefa_encontrada.getDescricao());
		
		manager.close();
		factory.close();

	}

}
