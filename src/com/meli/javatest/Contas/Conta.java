package com.meli.javatest.Contas;

import com.meli.javatest.Data.Data;

public abstract class Conta {

    private static int identificador = 0;
    private String titular;
    private int numero;
    private String agencia;
    protected double saldo;
    private Data dataDeAbertura;
    protected double valorOperacao;

    public Conta(){
        identificador++;
    }
    public Conta(String titular){
        this.titular = titular;
    }

    public int getIdentificador(){
        return identificador;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDataDeAbertura(Data dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public void saca(double valor){
        this.saldo -= valor;
    }

    public void deposita(double valor){
        this.saldo +=valor;
    }

    public double getRendimento(){
        return this.saldo * 0.1;
    }

    public String recuperaDadosParaImpressao(){
        String texto = "\nTitular: " + this.titular + "\nNumero da conta: " + this.numero +
                "\nAgencia: " + this.agencia + "\nSaldo: " + this.saldo;

        texto += "\nData de abertura: " + this.dataDeAbertura.ImprimirData();
        texto += this.getTipo();

        return texto;
    }

    public void transfere(Conta destino, double valor){
        this.saca(valor);
        destino.deposita(valor);
    }

    public abstract String getTipo();
}
