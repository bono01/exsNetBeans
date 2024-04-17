/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.usjt.gasolina;

/**
 *
 * @author 823217710
 */
public class Carro {
    int capacidade;
    double combustivel;

    Carro(int capacidade) {
        if (capacidade >= 40) {
            this.capacidade = capacidade;
        } else {
            this.capacidade = 40;
        }
        combustivel = this.capacidade - 2;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        if (combustivel <= capacidade) {
            this.combustivel = combustivel;
        }
    }
    
    public boolean tanqueCheio() {
        if (combustivel  == capacidade) {
            System.out.println("O TANQUE ESTÁ CHEIO!");
        }
        return combustivel == capacidade;
    }
}