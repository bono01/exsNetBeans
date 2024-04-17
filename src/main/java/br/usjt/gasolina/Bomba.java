/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.usjt.gasolina;

/**
 *
 * @author 823217710
 */
public class Bomba {
    Carro carro;
    
    Bomba(Carro carro) {
        this.carro = carro;
    }
    
    void abastecer() {
        carro.combustivel++;
    }
}
