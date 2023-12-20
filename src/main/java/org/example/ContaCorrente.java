package org.example;


public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private double saldo;


    public ContaCorrente(int numeroConta, String nomeCorrentista, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldoInicial;
    }

    public void depositoConta(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("O depósito nao pode ser zerado.");
        }
    }


    public void saqueConta(double valor) {

            if (valor >= 5 && saldo >= valor) {
                saldo -= valor;
            } else {
                System.out.println("O valor deve ser maior que 5 reais ");
            }

        }
        public double getSaldo() {
        return saldo;
    }
}
