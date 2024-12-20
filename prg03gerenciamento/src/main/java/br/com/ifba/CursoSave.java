package br.com.ifba;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author larissa
 */
public class CursoSave {
    
    private final static EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("gerenciamento_curso");
    
    private final static EntityManager entityManager =
            entityManagerFactory.createEntityManager();
    
    public void save(Curso curso) {
        curso.setNome(curso.getNome());
        curso.setAtivo(curso.isAtivo());
        curso.setCodigoCurso(curso.getCodigoCurso());
        
        entityManager.getTransaction().begin();
        entityManager.persist(curso);
        entityManager.getTransaction().commit();
        
        entityManager.close();
        entityManagerFactory.close();
    }
}
