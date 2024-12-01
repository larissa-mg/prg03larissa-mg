/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author larissa
 */
public class Triangulo extends FormaBidimensional{
    
    private final double base;
    private final double altura;
    
    //Método construtor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Calcula a área do triângulo
    @Override
    public void obterArea() {
        System.out.printf("Area do triangulo: %.2f%n", getBase() * getAltura() / 2);
    }

    //Métodos getter
    private double getBase() {
        return base;
    }

    private double getAltura() {
        return altura;
    }

}
