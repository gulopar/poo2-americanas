package tech.ada.generics;

import tech.ada.generics.objetos.*;

public class TestadorDeCaixaDeTransporte {

    public static void main(String[] args) {

        CaixaDeTransporte<Gato> caixaDeGato = new CaixaDeTransporte<>();
        caixaDeGato.colocarNaCaixa(new Gato());

        // Não compila; a caixa de transporte aceita apenas objetos que implementam a interface Animal
//        CaixaDeTransporte<Bola> caixaDeBola = new CaixaDeTransporte<>();


    }

}
