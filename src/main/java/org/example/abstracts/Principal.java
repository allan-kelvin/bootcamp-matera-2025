package org.example.abstracts;

public class Principal {
    public  static void main(String[] args){
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.imprimirExtrato();

        ContaPoupanca cp = new ContaPoupanca();

        cp.imprimirExtrato();
    }
}
