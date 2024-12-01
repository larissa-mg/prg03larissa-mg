/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author larissa
 */
public class Quadrado extends FormaBidimensional{

    private final double lado;

    //Método construtor
    public Quadrado(double lado) {
        this.lado = lado;
    }
    
    //Calcula a área do quadrado
    @Override
    public void obterArea() {
        System.out.printf("Area do quadrado: %.2f%n", Math.pow(getLado(), 2));
    }

    //Método getter
    private double getLado() {
        return lado;
    }
 
}
