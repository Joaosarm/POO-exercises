package com.meli.javatest;

import com.meli.javatest.Evento.Evento;
import com.meli.javatest.ManipuladorDeContas.ManipuladorDeContas;
import com.meli.javatest.SeguroDeVida.ManipuladorDeSeguroDeVida;
import com.meli.javatest.Tributavel.Tributavel;

public class Main {
    public static void main(String[] args){
        ManipuladorDeContas c1 = new ManipuladorDeContas();
        ManipuladorDeContas c2 = new ManipuladorDeContas();
        Evento evento = new Evento();


        c1.criarConta(evento);
        System.out.println("Quanto depositar na primeira conta?");
        c1.deposita(evento);

        c2.criarConta(evento);
        System.out.println("Quanto depositar na segunda conta?");
        c2.deposita(evento);

        System.out.println("Quanto quer transferir da primeira conta para a segunda?");
        c1.transfere(c2.getConta(),evento.getDouble());

        System.out.println(c1.getConta().recuperaDadosParaImpressao());
        System.out.println(c2.getConta().recuperaDadosParaImpressao());
    }
}