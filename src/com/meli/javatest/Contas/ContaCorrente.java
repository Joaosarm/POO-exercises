package com.meli.javatest.Contas;

import com.meli.javatest.Tributavel.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

    public String getTipo(){
        return "\nConta Corrente";
    }

    public void saca(double valor){
        this.saldo -= (valor + 0.1);
    }

    public double getValorImposto(){
        return 0.01*this.saldo;
    }

}
