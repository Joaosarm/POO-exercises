package com.meli.javatest.Contas;

public class ContaPoupanca extends Conta{

    public String getTipo(){
        return "\nConta Poupança";
    }

    public void saca(double valor){
        this.saldo -= valor;
    }

}
