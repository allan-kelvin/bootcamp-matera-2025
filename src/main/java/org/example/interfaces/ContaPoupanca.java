package org.example.interfaces;

public class ContaPoupanca implements iConta{
    private Double saldo = 100.00;

    @Override
    public void depositar(Double valor){
        this.saldo += valor;
    }

    @Override
    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    public Double getSaldo(){
        return this.saldo;
    }
}
