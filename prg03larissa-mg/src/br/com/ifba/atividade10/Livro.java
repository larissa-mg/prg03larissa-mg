/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10;

/**
 *
 * @author larissa
 */
public class Livro implements Publicacao {
    //Declaração de variáveis
    private String titulo;
    private Pessoa autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    //Método construtor
    public Livro(String titulo, Pessoa autor, int totalPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginaAtual = paginaAtual;
        this.leitor = leitor;
        this.aberto = false;
        this.paginaAtual = 0;
    }
    
    public void detalhes() {
        System.out.println("\n--- DETALHES DO LIVRO ---");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + autor.getNome());
        System.out.println("Total de paginas: " + this.getTotalPaginas());
        System.out.println("Status: " + this.isAberto());
        System.out.println("Pagina atual: " + this.getPaginaAtual());
        System.out.println("Leitor: " + leitor.getNome());
        System.out.println("\n--- DETALHES DO AUTOR ---");
        System.out.println("Nome: " + autor.getNome());
        System.out.println("Idade: " + autor.getIdade());
        System.out.println("Sexo: " + autor.getSexo());
        System.out.println("\n--- DETALHES DO LEITOR ---");
        System.out.println("Nome: " + leitor.getNome());
        System.out.println("Idade: " + leitor.getIdade());
        System.out.println("Sexo: " + leitor.getSexo() + "\n");
        
    }
    
    //Métodos da interface Publicacao
    @Override
    public void abrir() {
        if(!this.isAberto()) {
            this.setAberto(true);
            this.setPaginaAtual(1);
        }
    }

    @Override
    public void fechar() {
        if(this.isAberto()) {
            this.setAberto(false);
        }
    }

    @Override
    public void folhear() {
        if(this.isAberto()) {
            System.out.println("Folheando o livro...");
        } else {
            System.out.println("Abra o livro para folhea-lo.");
        }
    }

    @Override
    public void avancarPagina() {
        if(this.isAberto()) {
            if(this.getPaginaAtual() < this.getTotalPaginas()) {
                this.setPaginaAtual(this.getPaginaAtual() + 1);
            } else {
                System.out.println("Voce ja esta na ultima pagina.");
            }
        } else {
            System.out.println("Abra o livro para avancar uma pagina.");
        }
    }

    @Override
    public void voltarPagina() {
        if(this.isAberto()) {
            if(this.getPaginaAtual() > 1) {
                this.setPaginaAtual(this.getPaginaAtual() - 1);
            } else {
                System.out.println("Voce esta na primeira pagina.");
            }
        } else {
            System.out.println("Abra o livro para voltar uma pagina.");
        }
    }
    
    
    //Métodos getter e setter
    private String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private Pessoa getAutor() {
        return autor;
    }

    private void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    private int getTotalPaginas() {
        return totalPaginas;
    }

    private void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    private int getPaginaAtual() {
        return paginaAtual;
    }

    private void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    private boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
