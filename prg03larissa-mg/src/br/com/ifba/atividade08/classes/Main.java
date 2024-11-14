/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.classes;

/**
 *
 * @author larissa
 */
public class Main {
    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.depositar(1000);
        conta.abrirConta("Larissa", "cp");
        conta.sacar(50);
        conta.depositar(1000);
        conta.fecharConta();
        conta.mostrarConta();
        
    }
}
