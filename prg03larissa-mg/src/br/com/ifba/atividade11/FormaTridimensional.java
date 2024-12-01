/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade11;

/**
 *
 * @author larissa
 */
public abstract class FormaTridimensional extends Forma{
    
    public abstract void obterVolume();
    
    //Método que retorna o tipo do objeto
    @Override
    public String toString() {
        return "Forma Tridimensional";
    }
}
