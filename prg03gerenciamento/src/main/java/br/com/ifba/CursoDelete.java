package br.com.ifba;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author larissa
 */
public class CursoDelete {
     private final static EntityManagerFactory entityManagerFactory = 
                Persistence.createEntityManagerFactory("gerenciamento_curso");
    
    
    private final static EntityManager entityManager = 
            entityManagerFactory.createEntityManager();
    
    public static void main(String[] args) {
        Curso cursoEncontrado = entityManager.find(Curso.class, 1L);
        
        entityManager.getTransaction().begin();
        entityManager.remove(cursoEncontrado);
        entityManager.getTransaction().commit();
        
        entityManager.close();
        entityManagerFactory.close();
        
    }
}