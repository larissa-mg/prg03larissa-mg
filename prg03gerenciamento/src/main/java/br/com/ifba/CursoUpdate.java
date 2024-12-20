package br.com.ifba;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author larissa
 */
public class CursoUpdate {
    private final static EntityManagerFactory entityManagerFactory = 
                Persistence.createEntityManagerFactory("gerenciamento_curso");
    
    
    private final static EntityManager entityManager = 
            entityManagerFactory.createEntityManager();
    
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setId(1L);
        curso.setNome("Engenharia de Software");
        curso.setCodigoCurso("EGS");
        curso.setAtivo(true);
        
        Curso curso2 = new Curso();
        curso2.setId(2L);
        curso2.setNome("Analise de Desenvolvimento de Software");
        curso2.setCodigoCurso("ADS");
        curso2.setAtivo(true);
            
        entityManager.getTransaction().begin();
        entityManager.merge(curso);
        entityManager.getTransaction().commit();
            
        entityManager.close();
        entityManagerFactory.close();
    }
}
