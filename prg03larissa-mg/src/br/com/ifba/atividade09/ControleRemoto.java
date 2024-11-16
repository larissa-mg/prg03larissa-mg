/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09;

/**
 *
 * @author larissa
 */
public class ControleRemoto implements Controlador{
    //Declaração de variáveis
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Construtor
    public ControleRemoto() {
        this.volume = 0;
        this.ligado = false;
        this.tocando = false;
    }

    //Métodos getters e setters
    private int getVolume() {
        return volume;
    }
    
    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //Métodos da interface Controlador
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------- MENU --------");
        System.out.println("Volume: " + this.getVolume());
        System.out.println("Ligado: " + this.isLigado());
        System.out.println("Tocando: " + this.isTocando());
        System.out.println("----------------------");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Menu fechado.");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()) {
            this.setVolume(this.getVolume() + 1);
        } else {
            System.out.println("Sistema desligado.");
        }
    }

    @Override
    public void menosVolume() {
        if(this.isLigado()) {
            this.setVolume(this.getVolume() - 1);
        } else {
            System.out.println("Sistema desligado.");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && (this.isTocando())) {
            this.setTocando(false);
        }
    }
    
}
