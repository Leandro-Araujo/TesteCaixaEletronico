package org.example;

public class CaixaEletronico {
    private Banco banco;

    public CaixaEletronico(Banco banco){
        this.banco = banco;
    }

    public double someContas(){
        return this.banco.getSaldoContaCorrente() + this.banco.getSaldoPoupanca();
    }

}
