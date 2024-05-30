package org.example;

public class Banco {
    private double saldoContaCorrente = 1000;
    private double saldoPoupanca = 2000;

    public void setSaldoContaCorrente(double saldoContaCorrente) {
        this.saldoContaCorrente = saldoContaCorrente;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public Banco(double saldoContaCorrente, double saldoPoupanca) {
        this.saldoContaCorrente = saldoContaCorrente;
        this.saldoPoupanca = saldoPoupanca;
    }

    public Banco() {
    }

    public double getSaldoContaCorrente(){
        return saldoContaCorrente;
    }

    public double getSaldoPoupanca(){
        return saldoPoupanca;
    }
}
