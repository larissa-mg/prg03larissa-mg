/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author larissa
 */
public class Main {
    public static void main(String[] args) {
        Pessoa autor = new Pessoa("Machado de Assis", 40, "M");
        Pessoa leitor = new Pessoa("Maria", 25, "F");
        Livro livro = new Livro("Dom Casmurro", autor, 100, leitor);
        livro.abrir();
        livro.avancarPagina();
        livro.detalhes();
        livro.folhear();
     
    }
}
