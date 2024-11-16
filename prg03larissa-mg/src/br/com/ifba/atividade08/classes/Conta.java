/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.classes;

/**
 *
 * @author larissa
 */
public class Conta {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public Conta () {
        this.saldo = 0;
        this.status = false;
        this.numConta = (int)(Math.random() * 1000) + 1;
    }
    
    public void abrirConta(String d, String t) {
        if(t == "cp" || t == "cc") {
            this.setTipo(t);
            this.setStatus(true);
            this.setDono(d);
            
            if(t == "cp") {
                this.setSaldo(150);
            } else if(t == "cc") {
                this.setSaldo(50);
            }
            System.out.println("Conta aberta com sucesso!");
        } else {
            System.out.println("Tipo de conta invalido.");
        }
    }
    
    public void fecharConta() {
        if(this.getSaldo() == 0) {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        } else {
            System.out.println("A conta nao pode ser fechada pois o saldo nao e zero.");
        }
    }
    
    public void depositar(double deposito) {
        if(this.isStatus()) {
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Deposito feito com sucesso!");
        } else {
            System.out.println("Nao e possivel fazer depositos em uma conta fechada.");
        }
    }
    
    public void sacar(double saque) {
        if(this.isStatus()) {
            if(saque <= this.getSaldo()) {
                this.setSaldo(this.getSaldo() - saque);
                System.out.println("Saque feito com sucesso!");
            } else {
                System.out.println("Nao e possivel sacar uma quantia tao grande.");
            }   
        } else {
            System.out.println("Nao e possivel fazer saques em uma conta fechada");
        }
    }
    
    public void pagarMensal() {
        if(this.isStatus()) {
            if(this.getTipo() == "cp") {
                this.setSaldo(this.getSaldo() - 20);
            } else {
                this.setSaldo(this.getSaldo() - 12);
            }
        } else {
            System.out.println("Essa conta nao esta aberta.");
        }
    }
    
    public void mostrarConta() {
        System.out.println("Dono: " + this.getDono());
        System.out.println("Numero da conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
    }
    
    private int getNumConta() {
        return numConta;
    }

    private void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    private String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private String getDono() {
        return dono;
    }

    private void setDono(String dono) {
        this.dono = dono;
    }

    private double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private boolean isStatus() {
        return status;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }

}
