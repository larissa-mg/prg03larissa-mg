/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author larissa
 */
public class Piramide extends FormaTridimensional {

    private final double areaBase;
    private final double altura;
    private final double areaLateral;

    //Método construtor
    public Piramide(double areaBase, double altura, double areaLateral) {
        this.areaBase = areaBase;
        this.altura = altura;
        this.areaLateral = areaLateral;
    }
    
    //Calcula o volume da pirâmide
    @Override
    public void obterVolume() {
        System.out.printf("Volume da piramide: %.2f%n", (getAreaBase() * getAltura()) / 3);
    }

    //Calcula a área da pirâmide
    @Override
    public void obterArea() {
        System.out.printf("Area da piramide: %.2f%n", getAreaBase() + getAreaLateral());    
    }

    //Métodos getter
    public double getAreaBase() {
        return areaBase;
    }

    public double getAltura() {
        return altura;
    }

    private double getAreaLateral() {
        return areaLateral;
    }
    
}
