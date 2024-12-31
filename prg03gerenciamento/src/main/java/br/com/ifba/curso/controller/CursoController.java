package br.com.ifba.curso.controller;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.curso.service.CursoIService;
import br.com.ifba.curso.service.CursoService;
import java.util.List;

/**
 *
 * @author larissa
 */

public class CursoController implements CursoIController{
    
    private final CursoIService cursoIService = new CursoService();
    
    @Override
    public List <Curso> findAll() throws RuntimeException{
        return cursoIService.findAll();
    }
    
    @Override
    public Curso save (Curso curso) throws RuntimeException{
        return cursoIService.save(curso);
    }
    
    @Override
    public Curso update (Curso curso) throws RuntimeException{
        return cursoIService.update(curso);
    }
    
    @Override
    public void delete (Curso curso) throws RuntimeException{
        cursoIService.delete(curso);
    }
    
    @Override
    public Curso findById (Long id) throws RuntimeException{
        return cursoIService.findById(id);
    }
    
    @Override
    public List <Curso> findByNome (String nome) throws RuntimeException{
        return cursoIService.findByNome(nome);
    }
}