/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author larissa
 */
public class Circulo extends FormaBidimensional {

    private final double raio;
    
    //Método construtor
    public Circulo(double raio) {
        this.raio = raio;
    }
    
    //Calcula a área do círculo
    @Override
    public void obterArea() {
        System.out.printf("Area do circulo: %.2f%n", Math.pow(getRaio(), 2) * Math.PI);
    }

    //Método getter
    private double getRaio() {
        return raio;
    }

}
