/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author larissa
 */
public class Main {
    public static void main(String[] args) {
        ControleRemoto cont = new ControleRemoto();
        cont.ligar();
        cont.play();
        cont.maisVolume();
        cont.abrirMenu();
        cont.fecharMenu();
    }
}
