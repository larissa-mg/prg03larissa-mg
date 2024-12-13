package br.com.ifba;

import br.com.ifba.curso.entity.Curso;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author larissa
 */
public class CursoSave {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setId(1L);
        curso.setNome("Análise e Desenvolvimento de Sistemas");
        curso.setAtivo(true);
        curso.setCodigoCurso("ADS");
    }
}
