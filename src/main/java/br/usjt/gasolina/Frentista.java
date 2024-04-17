/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.usjt.gasolina;

/**
 *
 * @author 823217710
 */
public class Frentista {
    Carro carro;
    Bomba bomba;
    // Váriavel = inicia c letra MINÚSCULA | Classe = inicia c letra MAIÚSCULA
    Frentista() {
        carro = new Carro(40);
        bomba = new Bomba(carro);
    }
    void abastecer() {
        while(!carro.tanqueCheio()) {
            System.out.println("Colocando 1 L");
            bomba.abastecer();            
        }
    }
}
