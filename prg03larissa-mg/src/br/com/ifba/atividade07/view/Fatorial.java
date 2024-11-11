/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author larissa
 */

public class Fatorial {
    private int fatorial = 1;
    private String formula = "";

    // Calcula o valor do fatorial e a formula
    public void setValor(int num) {
        for(int i = num; i > 1; i--) {
            formula += i + " x ";
            fatorial *= i;
        }
        formula += "1 = ";
    }

    // Retorna o valor do fatorial calculado no método setValor
    public int getFatorial() {
        return fatorial;
    }

    // Retorna a string formula formada no método setValor
    public String getFormula() {
        return formula;
    }

}