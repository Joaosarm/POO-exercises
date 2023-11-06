package com.meli.javatest.SeguroDeVida;

import com.meli.javatest.Evento.Evento;

public class ManipuladorDeSeguroDeVida {

    SeguroDeVida seguro = new SeguroDeVida();

    public SeguroDeVida getSeguro() {
        return seguro;
    }

    public void criaSeguro(Evento evento){
        System.out.println("Digite o nome do titular: ");
        seguro.setTitular(evento.getString());
        System.out.println("Digite o valor do seguro: ");
        seguro.setValor(evento.getDouble());
        System.out.println("Digite o numero do apólice do seguro: ");
        seguro.setNumeroApolice(evento.getInt());
    }

    public String imprimeSeguro() {
        return "\nTitular: " + this.seguro.getTitular() + "\nValor do seguro: "
                + this.seguro.getValor() + "\nNúmero da apólice: " + this.seguro.getNumeroApolice()
                + "\nTipo de contrato: " + this.seguro.getTipo();
    }
}
