package org.example;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public double getSaldoTotalBanco(){
        return contas
                .stream()
                .mapToDouble(Conta::getSaldo)
                .sum();
    }
}
