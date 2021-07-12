package orm;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


//JPQL: linguagem propria de consultas da JPA

public class ListaTarefasJPQL {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		String sql = "select t from Tarefa as t where t.finalizada = false";
		@SuppressWarnings ("unchecked")
		List<Tarefa> lista = manager.createQuery(sql).getResultList();
		
		System.out.println("Lista de tarefas em aberto (TODO LIST):");
		for (Tarefa tarefa : lista) {
			System.out.println(tarefa.getDescricao());
			
		}
	}

}
