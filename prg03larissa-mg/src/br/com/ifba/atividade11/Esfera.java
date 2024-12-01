/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author larissa
 */
public class Esfera extends FormaTridimensional {

    private final double raio;

    //Método construtor
    public Esfera(double raio) {
        this.raio = raio;
    }
    
    @Override
    public void obterVolume() {
        System.out.printf("Volume da esfera: %.2f%n", (4 * Math.PI * Math.pow(getRaio(), 3)) / 3);
    }

    @Override
    public void obterArea() {
        System.out.printf("Area da esfera: %.2f%n", 4 * Math.PI * Math.pow(getRaio(), 2));
    }

    private double getRaio() {
        return raio;
    }

}
