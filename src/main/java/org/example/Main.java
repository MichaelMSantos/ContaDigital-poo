package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco b = new Banco();
        Cliente c = new Cliente();
        c.setNome("Cliente 1");

        Conta cc = new ContaCorrente(c);
        Conta cp = new ContaPoupanca(c);
        b.adicionarConta(cc);
        b.adicionarConta(cp);

        cc.depositar(20);
        cc.transferir(2, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        System.out.println("=== Valor Total Depositado no Banco === \nR$: " + b.getSaldoTotalBanco());
    }
}