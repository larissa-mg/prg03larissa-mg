package br.com.ifba;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;

/**
 *
 * @author larissa
 */
public class JPQL {
    private final static EntityManagerFactory entityManagerFactory = 
                Persistence.createEntityManagerFactory("gerenciamento_curso");
    
    
    private final static EntityManager entityManager = 
            entityManagerFactory.createEntityManager();
    
    public static void main(String[] args) {
        List<Curso> cursosAtivos = entityManager 
                .createQuery("Select c from Curso as c where c.ativo = true")
                .getResultList();
        for (Curso curso : cursosAtivos) {
            System.out.println(curso.getNome());
        }
    }
}