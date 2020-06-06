package control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpaControl<T> {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");

	EntityManager em = emf.createEntityManager();

	public void salvar(T t) {
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
                
	}

	public List <T> listar(String parametro) {
		em.getTransaction().begin();

		Query query = em.createQuery(parametro);

		List<T> lista = query.getResultList();
		
		em.getTransaction().commit();
		return lista;
	}

}
