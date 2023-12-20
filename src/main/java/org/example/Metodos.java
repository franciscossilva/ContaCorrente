package org.example;

public class Metodos {

    public static void main(String[] args) {

        ContaCorrente minhaConta = new ContaCorrente(123, "francisco", 100.0);

        System.out.println("Saldo inicial: " + minhaConta.getSaldo());


        minhaConta.depositoConta(50.0);
        System.out.println("Saldo após depósito: " + minhaConta.getSaldo());


        minhaConta.saqueConta(30.0);
        System.out.println("Saldo após saque: " + minhaConta.getSaldo());


        minhaConta.saqueConta(3.0);
        System.out.println("Saldo após saque de valor menor que 5 reais: " + minhaConta.getSaldo());

        minhaConta.saqueConta(200.0);
        System.out.println("Saldo após tentativa de saque com saldo insuficiente: " + minhaConta.getSaldo());
    }
}
