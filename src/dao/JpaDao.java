package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpaDao<T> {

    private EntityManager getEM() {
        EntityManagerFactory emf = null;
        EntityManager em = null;
        try {
            emf = Persistence.createEntityManagerFactory("persistence");
            em = emf.createEntityManager();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return em;
    }

    public void salvar(T t) {
        EntityManager em = null;
        try {
            em = getEM();
            em.getTransaction().begin();
            em.persist(t);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }

    }

    public List<T> listar(String parametro) {
        EntityManager em = null;
        List<T> lista = null;
        try {
            em = getEM();
            em.getTransaction().begin();
            Query query = em.createQuery(parametro);
            lista = query.getResultList();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return lista;
    }

    public void deletar(String paramentro) {
        EntityManager em = null;
        try {
            em = getEM();
            em.getTransaction().begin();
            Query q = em.createQuery(paramentro);
            q.executeUpdate();
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
    }

}
