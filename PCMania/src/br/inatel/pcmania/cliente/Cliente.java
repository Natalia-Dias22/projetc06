package br.inatel.pcmania.cliente;

import br.inatel.pcmania.computador.Computador;

public class Cliente {
    public String nome;
    public long cpf;
    public Computador[] computador;
    int totalGasto = 0;
    public int quantidadeCompras = 0;

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.computador = new Computador[10];
    }

    public void quantidadeComputadores(){
        quantidadeCompras++;
    }

    public float calculaTotalCompra() {
        totalGasto = 0;
        for (int i = 0; i < quantidadeCompras; i++) {
            totalGasto += computador[i].preco;
        }
        return totalGasto;
    }
}

