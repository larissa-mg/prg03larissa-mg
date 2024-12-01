/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author larissa
 */
public class Main {
    public static void main(String[] args) {
        Forma vetorForma[] = new Forma[6];
        
        vetorForma[0] = new Circulo(3.5);
        vetorForma[1] = new Quadrado(2.2);
        vetorForma[2] = new Triangulo(4, 3);
        vetorForma[3] = new Esfera(5);
        vetorForma[4] = new Cubo(1.2);
        vetorForma[5] = new Piramide(6, 3, 8);
        
        for(Forma forma: vetorForma) {
            System.out.println(forma.toString());
            if(forma instanceof FormaBidimensional) {
                forma.obterArea();
            } else {
                FormaTridimensional f = (FormaTridimensional) forma;     
                f.obterVolume();
            }
            System.out.println("");
        }
    }
}
