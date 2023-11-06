package com.meli.javatest.ManipuladorDeContas;

import com.meli.javatest.Contas.Conta;
import com.meli.javatest.Contas.ContaCorrente;
import com.meli.javatest.Contas.ContaPoupanca;
import com.meli.javatest.Data.Data;
import com.meli.javatest.Evento.Evento;
import com.meli.javatest.Exception.ValorInvalidoException;

public class ManipuladorDeContas {

    private Conta conta;

    public Conta getConta() {
        return conta;
    }

    public Conta criarConta(Evento evento){
        int tipoConta;
        Data data = new Data();

        do {
            System.out.println("Digite o tipo de conta: (1 - Conta Poupança / 2 - Conta Corrente)");
            tipoConta = Integer.parseInt(evento.getString());
            if (tipoConta == 1) conta = new ContaPoupanca();
            else if (tipoConta == 2) conta = new ContaCorrente();
            else System.out.println("\nTipo de conta inexistente!");
        } while (tipoConta<1||tipoConta>2);

        System.out.println("Digite o nome do titular: ");
        conta.setTitular(evento.getString());
        System.out.println("Digite a agência da conta: ");
        conta.setAgencia(evento.getString());
        System.out.println("Digite o numero da conta: ");
        conta.setNumero(Integer.parseInt(evento.getString()));
        conta.setSaldo(0);
        conta.setDataDeAbertura(data);

        return conta;
    }

    public void deposita(Evento evento){
        try {
            double valor = Double.parseDouble(evento.getString());
            if (valor<0) throw new ValorInvalidoException(valor);
            this.conta.deposita(valor);
        } catch (ValorInvalidoException error){
            System.out.println(error.getMessage());
        }
    }

    public void saca(Evento evento){
        this.conta.saca(evento.getDouble());
    }

    public void transfere(Conta destino, double valor){
        this.conta.transfere(destino, valor);
    }
}
